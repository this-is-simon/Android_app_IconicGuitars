package guitarslist.codeclan.com.guitarslistapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class Guitars_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guitars);

        TopGuitars topGuitars = new TopGuitars(); //UPDATED
        ArrayList<Guitar> list = topGuitars.getList();

        TopGuitarsAdapter guitarsAdapter = new TopGuitarsAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.guitarListViewId);
        listView.setAdapter(guitarsAdapter);
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
