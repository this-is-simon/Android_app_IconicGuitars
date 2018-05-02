package guitarslist.codeclan.com.guitarslistapp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BudgetTest {

    public Budget budget1;
    public Guitar guitar1;

    @Before
    public void before(){
        budget1 = new Budget(8500, 100);
        guitar1 = new Guitar(3, "Gibson ES150", 1934, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi pharetra pretium velit id tincidunt. Duis vel metus in massa rhoncus pulvinar. Suspendisse elit purus, rutrum at nunc et, dignissim pharetra leo. Aliquam erat volutpat. Fusce luctus ligula ligula, sit amet maximus massa viverra eu. Maecenas ac viverra purus. Duis arcu metus, tempor quis sollicitudin commodo, mattis eu lectus. Proin aliquam orci et lectus egestas, lacinia venenatis leo lacinia. Maecenas sed ante quis purus rutrum varius a et quam. Suspendisse vehicula enim non quam vehicula, sit amet sodales mi vestibulum. Vivamus sollicitudin condimentum purus, eu iaculis lacus. Donec dignissim est eget malesuada ornare. Pellentesque vehicula nibh dolor, nec efficitur ex hendrerit nec.", false, "", 9000);
    }

    @Test
    public void canSetCurrentBudget() {
        budget1.setCurrentBudget(9000);
        assertEquals((Integer)9000, budget1.getCurrentBudget());
    }

    @Test
    public void canSetMonthlySavings() {
        budget1.setMonthlySavings(50);
        assertEquals((Integer)50, budget1.getMonthlySavings());
    }

    @Test
    public void canCalculateHowManyMonthsToAffordGuitar() {
        assertEquals((Integer)5, budget1.howManyMonthsToAffordGuitar(guitar1));
    }

    //    public Integer howManyMonthsToAffordGuitar(Guitar guitar){
//        Integer numberOfMonths = (guitar.getPriceOfGuitar() - currentBudget) / monthlySavings;
//        return numberOfMonths;
//    }

    @Test
    public void canCalculateHowLongToAffordGuitar() {
        assertEquals((String)"5 months", budget1.howLongToAffordGuitar(guitar1));
    }

//    public String howLongToAffordGuitar(Guitar guitar){
//        return howManyMonthsToAffordGuitar(guitar) + " months";
//    }

}