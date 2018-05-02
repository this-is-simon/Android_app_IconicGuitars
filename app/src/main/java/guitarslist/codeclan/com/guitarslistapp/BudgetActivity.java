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
        //TODO: get persisted budget and pre-fill intuts if there's anything there
        TopGuitars topGuitars = PersistenceHelper.loadApplicationState(this);

        String userSavingsSoFar = topGuitars.getBudget().getCurrentSavings();
        userBudgetInput.setText( userSavingsSoFar );

        //TODO: same fpr the other one
    }

    public void onClick(View button){



        String userInitialMoneyString = userBudgetInput.getText().toString();
        int userInitialMoney = 0; //TODO: change string to int


        String userMonthlyMoneyString = userMonthlySavingsInput.getText().toString();
        int userMonthlyMoney = 0; //TODO: change string to int


        //TODO: load the Shared Preferences budget (or new up???)
        TopGuitars topGuitars = PersistenceHelper.loadApplicationState(this);

        //TODO: make the change in shared prefs -> Save above values into budget
        topGuitars.updateBudgetWithInputs(userInitialMoney, userMonthlyMoney); //TODO: write this method

        //TODO: save new state in shared prefs
        PersistenceHelper.saveApplicationState(this, topGuitars);




    }

}
