package guitarslist.codeclan.com.guitarslistapp;

import java.io.Serializable;

public class Budget  implements Serializable {

    private Integer currentBudget;
    private Integer monthlySavings;

    public Budget(int currentBudget, int monthlySavings){
        this.currentBudget = currentBudget;
        this.monthlySavings = monthlySavings;
    }

    public Budget(){
        this.currentBudget = 0;
        this.monthlySavings = 0;
    }

    public Integer getCurrentBudget(){
        return this.currentBudget;
    }

    public Integer getMonthlySavings(){
        return this.monthlySavings;
    }

    public Integer howManyMonthsToAffordGuitar(Guitar guitar){
        Integer numberOfMonths = (guitar.getPriceOfGuitar() - currentBudget) / monthlySavings;
        return numberOfMonths;
    }

    public String howLongToAffordGuitar(Guitar guitar){
        return howManyMonthsToAffordGuitar(guitar) + " months";
    }

}
