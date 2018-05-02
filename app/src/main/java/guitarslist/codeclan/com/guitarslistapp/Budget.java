package guitarslist.codeclan.com.guitarslistapp;

import java.io.Serializable;

public class Budget  implements Serializable {

    private int currentBudget;
    private int monthlySavings;

    public Budget(int currentBudget, int monthlySavings){
        this.currentBudget = currentBudget;
        this.monthlySavings = monthlySavings;
    }

    public Budget(){
        this.currentBudget = 0;
        this.monthlySavings = 0;
    }

    public int getCurrentBudget(){
        return this.currentBudget;
    }

    public int getMonthlySavings(){
        return this.monthlySavings;
    }

    public String howLongToAffordGuitar(Guitar guitar){
        return howManyMonthsToAffordGuitar(guitar) + "months";
    }

    public int howManyMonthsToAffordGuitar(Guitar guitar){
        int numberOfMonths = (guitar.getPriceOfGuitar() - currentBudget) / monthlySavings;
        return numberOfMonths;
    }



}
