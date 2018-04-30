package guitarslist.codeclan.com.guitarslistapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TopGuitarsAdapter extends ArrayAdapter<Guitar> {

    public TopGuitarsAdapter(Context context, ArrayList<Guitar> guitars){
        super(context, 0, guitars);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.guitar_list, parent, false);
        }

        Guitar currentGuitar = getItem(position);

        //Array of integers for images:
        Integer[] images = {R.drawable.fender_strat, R.drawable.fender_tele, R.drawable.gibson_es150};
        ImageView guitarImage = (ImageView) listItemView.findViewById(R.id.guitarImageId);

        guitarImage.setImageResource(images[position]);

        TextView ranking = (TextView) listItemView.findViewById(R.id.rankingTextViewID);
        ranking.setText(currentGuitar.getRanking().toString());

        TextView guitarTitle = (TextView) listItemView.findViewById(R.id.guitarTitleTextViewId);
        guitarTitle.setText(currentGuitar.getTitle().toString());

        TextView guitarYear = (TextView) listItemView.findViewById(R.id.yearTextViewId);
        guitarYear.setText(currentGuitar.getYear().toString());

        listItemView.setTag(currentGuitar);

        return listItemView;
    }
}
