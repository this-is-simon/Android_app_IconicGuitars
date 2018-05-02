package guitarslist.codeclan.com.guitarslistapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class BudgetActivity extends AppCompatActivity {

    EditText userBudgetInput;
    EditText userMonthlySavingsInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget);

        userBudgetInput = findViewById(R.id.currentBudgetInputId);
        userMonthlySavingsInput = findViewById(R.id.monthlySavingsInputId);

        //get persisted budget and pre-fill inputs if there's anything there
        TopGuitars topGuitars = PersistenceHelper.loadApplicationState(this);

        String userCurrentBudget = topGuitars.getBudget().getCurrentBudget().toString();
        userBudgetInput.setText( userCurrentBudget );

        String userMonthlySavings = topGuitars.getBudget().getMonthlySavings().toString();
        userMonthlySavingsInput.setText( userMonthlySavings );
    }

    public void onClick(View button){

        String userInitialMoneyString = userBudgetInput.getText().toString();
        int userInitialMoney = Integer.parseInt(userInitialMoneyString);
        //changes string to int

        String userMonthlyMoneyString = userMonthlySavingsInput.getText().toString();
        int userMonthlyMoney = Integer.parseInt(userMonthlyMoneyString);
        //changes string to int

        TopGuitars topGuitars = PersistenceHelper.loadApplicationState(this);
        //loads SharedPreferences

        //TODO: make the change in shared prefs -> Save above values into budget
//        topGuitars.updateBudgetWithInputs(userInitialMoney, userMonthlyMoney); //TODO: write this method

        //TODO: save new state in shared prefs
        PersistenceHelper.saveApplicationState(this, topGuitars);

    }

}
