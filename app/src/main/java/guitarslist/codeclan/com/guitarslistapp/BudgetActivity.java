package guitarslist.codeclan.com.guitarslistapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

    }

    //public void onClick(View button){
    // EditText userBudgetInput = findViewById(R.id.currentBudgetInputId);
    //        EditText userMonthlySavingsInput = findViewById(R.id.monthlySavingsInputId);
    //
    //        //get stuff back from user above and put it in x and y below
    //        //Budget budget = new Budget(x, y);
    // }


}
