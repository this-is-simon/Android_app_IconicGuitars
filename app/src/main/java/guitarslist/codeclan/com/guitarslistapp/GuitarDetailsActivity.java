package guitarslist.codeclan.com.guitarslistapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class GuitarDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guitar_details);

        Intent intent = getIntent();
        Guitar guitar = (Guitar)intent.getSerializableExtra("guitarToOpen");

        Log.d("GuitarDetailsActivi:", guitar.getTitle());

        TextView guitarTitle = findViewById(R.id.guitarTitleTextViewId);
        guitarTitle.setText(guitar.getTitle().toString());

        TextView guitarDetails = findViewById(R.id.guitarDetailsTextViewId);
        guitarDetails.setText(guitar.getDetails().toString());


    }

}
