package guitarslist.codeclan.com.guitarslistapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class Guitars_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guitars);

        TopGuitars topGuitars = TopGuitars.getInstance();

        ArrayList<Guitar> list = topGuitars.getList();
//        ArrayList<Guitar> listFav = topGuitars.getListFavourites();

        TopGuitarsAdapter guitarsAdapter = new TopGuitarsAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.guitarListViewId);
        listView.setAdapter(guitarsAdapter);

//        PERSISTENCE STUFF
//        ApplicationState applicationState = PersistenceHelper.loadApplicationState(this);
//
//        if (applicationState.getFavouriteMovies() == null){
//            applicationState = new ApplicationState("NONAME");
//            PersistenceHelper.saveApplicationState(this, applicationState);
//        }

    }

    @Override
    protected void onResume() {
        super.onResume();
        ListView listView = (ListView) findViewById(R.id.guitarListViewId);
        listView.invalidateViews();


    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("PAUSING!!!!!!!", TopGuitars.getInstance().getListFavourites().toString());
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
