package guitarslist.codeclan.com.guitarslistapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
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
        Button setBudgetButton = findViewById(R.id.setBudgetButtonId);

        TopGuitars topGuitars = PersistenceHelper.loadApplicationState(this);

        String userCurrentBudget = topGuitars.getBudget().getCurrentBudget().toString();
        userBudgetInput.setText( userCurrentBudget );

        String userMonthlySavings = topGuitars.getBudget().getMonthlySavings().toString();
        userMonthlySavingsInput.setText( userMonthlySavings );
    }

    public void onClicKBudget(View setBudgetButton){

        String userInitialMoneyString = userBudgetInput.getText().toString();
        int userInitialMoney = Integer.parseInt(userInitialMoneyString);

        String userMonthlyMoneyString = userMonthlySavingsInput.getText().toString();
        int userMonthlyMoney = Integer.parseInt(userMonthlyMoneyString);

        TopGuitars topGuitars = PersistenceHelper.loadApplicationState(this);

        topGuitars.updateBudgetWithInputs(userInitialMoney, userMonthlyMoney); //TODO: write this method

        PersistenceHelper.saveApplicationState(this, topGuitars);

        Intent intent = new Intent(this, Favourite_Guitars_List_Activity.class);
        startActivity(intent);
    }

}
