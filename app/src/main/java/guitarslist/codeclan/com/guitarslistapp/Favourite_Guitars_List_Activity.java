package guitarslist.codeclan.com.guitarslistapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class Favourite_Guitars_List_Activity extends AppCompatActivity {

    TopGuitars topGuitars;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guitars);

        refreshGuitars();

        TopGuitarsAdapter guitarsAdapter = new TopGuitarsAdapter(this, topGuitars.getListFavourites());

        ListView listView = (ListView) findViewById(R.id.guitarListViewId);
        listView.setAdapter(guitarsAdapter);

    }

    private void refreshGuitars(){
        //app loads
        //do I have a saved top guitars in persistance?
        //if not get from seed, then save it in persistance
        //if yes, load from persistance

        topGuitars = PersistenceHelper.loadApplicationState(this);
        if (topGuitars.getList().size() == 0 ){

            topGuitars = new TopGuitars();
            PersistenceHelper.saveApplicationState(this, topGuitars);

        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        refreshGuitars();
        ListView listView = (ListView) findViewById(R.id.guitarListViewId);

        TopGuitarsAdapter guitarsAdapter = new TopGuitarsAdapter(this, topGuitars.getListFavourites());
        listView.setAdapter(guitarsAdapter);


    }

    @Override
    protected void onPause(){
        super.onPause();
//        Log.d("PAUSING!!!!!!!", TopGuitars.getInstance().getListFavourites().toString());
    }

    public void onListItemClick(View listItem) {
        Guitar guitarClicked = (Guitar) listItem.getTag();
        Log.d("Guitar Title: ", guitarClicked.getTitle());

        openGuitarDetail(guitarClicked);
    }

    public void openGuitarDetail(Guitar guitarToOpen) {
        Log.d("openGuitarDetail: ", guitarToOpen.getTitle());

        Intent intent = new Intent(this, GuitarDetailsActivity.class);
        intent.putExtra("guitarToOpen", guitarToOpen);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.activity_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menu_favourites) {
            // TODO: do something
            Intent intent = new Intent(this, Favourite_Guitars_List_Activity.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
