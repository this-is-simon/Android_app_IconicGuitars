package guitarslist.codeclan.com.guitarslistapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GuitarDetailsActivity extends AppCompatActivity {

    private Guitar guitar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guitar_details);

        Intent intent = getIntent();
        guitar = (Guitar)intent.getSerializableExtra("guitarToOpen");

        Log.d("GuitarDetailsActivi:", guitar.getTitle());

        TextView guitarTitle = findViewById(R.id.guitarTitleTextViewId);
        guitarTitle.setText(guitar.getTitle().toString());

        TextView guitarDetails = findViewById(R.id.guitarDetailsTextViewId);
        guitarDetails.setText(guitar.getDetails().toString());

        Button favouriteButton = findViewById(R.id.favouriteButtonID);
        Button removeFavouriteButton = findViewById(R.id.removeFavouriteGuitarId);

        if (guitar.isFavourite() == true) {
            favouriteButton.setVisibility(View.INVISIBLE);
        }

    }

    public void onAddToFavouritesClick(View btn) {
        addGuitarToFavourites();
    }

    public void addGuitarToFavourites() {
        Log.d("openGuitarDetail: ", guitar.getTitle());

         TopGuitars topGuitars = PersistenceHelper.loadApplicationState(this);
         topGuitars.makeGuitarFavourite(guitar);
         PersistenceHelper.saveApplicationState(this, topGuitars);

        Intent intent = new Intent(this, Favourite_Guitars_List_Activity.class);
        startActivity(intent);
    }

    public void onRemoveFromFavouritesClick(View removeFavouriteStatusButton) {
        removeGuitarFromFavourites();
    }

    public void removeGuitarFromFavourites() {
        Log.d("openGuitarDetail: ", guitar.getTitle());

        TopGuitars topGuitars = PersistenceHelper.loadApplicationState(this);
        topGuitars.removeGuitarFavourite(guitar);
        PersistenceHelper.saveApplicationState(this, topGuitars);

        Intent intent = new Intent(this, Favourite_Guitars_List_Activity.class);
        startActivity(intent);
    }

}
