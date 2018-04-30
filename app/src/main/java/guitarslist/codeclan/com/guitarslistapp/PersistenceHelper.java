package guitarslist.codeclan.com.guitarslistapp;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;

public class PersistenceHelper {

        public static void saveApplicationState(Context context, TopGuitars state){

            SharedPreferences.Editor editor = context.getSharedPreferences(context.getString(R.string.app_name), Context.MODE_PRIVATE).edit();
            Gson gson = new Gson();
            String json = gson.toJson(state);
            editor.putString("APPLICATION_STATE", json);
            editor.apply();
        }

        public static TopGuitars loadApplicationState(Context context){
            SharedPreferences sharedPreferences = context.getSharedPreferences(context.getString(R.string.app_name), Context.MODE_PRIVATE);
            Gson gson = new Gson();
            TopGuitars applicationState = gson.fromJson(sharedPreferences.getString("APPLICATION_STATE", "{}"), TopGuitars.class );
            return applicationState;
        }
    }