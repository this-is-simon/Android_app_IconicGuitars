package guitarslist.codeclan.com.guitarslistapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class Favourite_Guitars_List_Activity extends AppCompatActivity {

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guitars);

        TopGuitars topGuitars = TopGuitars.getInstance();

        ArrayList<Guitar> listFavourites = topGuitars.getListFavourites();

        TopGuitarsAdapter guitarsAdapter = new TopGuitarsAdapter(this, listFavourites);

        ListView listView = (ListView) findViewById(R.id.guitarListViewId);
        listView.setAdapter(guitarsAdapter);

//            PERSISTENCE STUFF
//            Intent intent = getIntent();
//            Movie favouriteMovieToAddToCollection = (Movie) intent.getSerializableExtra("movie");
//
//            ApplicationState applicationState = PersistenceHelper.loadApplicationState(this);
//            applicationState.getFavouriteMovies().add(favouriteMovieToAddToCollection);
//            PersistenceHelper.saveApplicationState(this, applicationState);

        }

    @Override
    protected void onResume() {
        super.onResume();
        ListView listView = (ListView) findViewById(R.id.guitarListViewId);
        listView.invalidateViews();

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
}
