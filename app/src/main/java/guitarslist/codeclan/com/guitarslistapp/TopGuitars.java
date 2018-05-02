package guitarslist.codeclan.com.guitarslistapp;

import java.util.ArrayList;
import java.util.HashMap;

public class TopGuitars  {

    private ArrayList<Guitar> list;
    private HashMap<String, Integer> guitarImageHashMap;
    private Budget budget;

    public TopGuitars() {
        list = getSeed();
        budget = new Budget();
    }


    public Budget getBudget(){
        return this.budget;
    }

    public void updateBudgetInfoOnGuitars(){ //call this method when someone changes the budget
        //loop troiugh all guitars
            //for each guitar update budget string
            // g.setBudgetString(budget.howLongForGuitar(g));
        for (Guitar oneGuitar: list) {
                oneGuitar.setBudgetString(budget.howLongToAffordGuitar(oneGuitar));
            }
    }

    public void updateBudgetWithInputs(int userInitialMoney, int userMonthlyMoney){
        getBudget().setCurrentBudget(userInitialMoney);
        getBudget().setMonthlySavings(userMonthlyMoney);
    }

    public ArrayList<Guitar> getList (){
        return new ArrayList<Guitar> (list);
    }

    public ArrayList<Guitar> getListFavourites (){
        ArrayList<Guitar> favouriteGuitars = new ArrayList<>();
        for (Guitar oneGuitar: list) {
            if (oneGuitar.isFavourite() == true) {
                favouriteGuitars.add(oneGuitar);
            }
        }
        return favouriteGuitars;
    }


    public void makeGuitarFavourite(Guitar guitarToMakeFavourite) {
        for (Guitar oneGuitar: list) {
            if (oneGuitar.getTitle().equals(guitarToMakeFavourite.getTitle())){
                oneGuitar.setFavourite(true);
            }
        }
    }

    public void removeGuitarFavourite(Guitar guitarToRemoveFromFavourites) {
        for (Guitar oneGuitar: list) {
            if (oneGuitar.getTitle().equals(guitarToRemoveFromFavourites.getTitle())){
                oneGuitar.setFavourite(false);
            }
        }
    }

    public HashMap<String, Integer> getGuitarHashMap() {
        return this.guitarImageHashMap;
    }

    private ArrayList<Guitar> getSeed(){

        guitarImageHashMap = new HashMap<>();
        guitarImageHashMap.put("Fender Stratocaster", R.drawable.fender_strat);
        guitarImageHashMap.put("Fender Telecaster", R.drawable.fender_tele);
        guitarImageHashMap.put("Gibson ES150", R.drawable.gibson_es150);
        guitarImageHashMap.put("Gibson Les Paul", R.drawable.gibson_les_paul);

        ArrayList<Guitar> newList = new ArrayList<Guitar>();

        newList.add(new Guitar(1, "Fender Stratocaster", 1954, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi pharetra pretium velit id tincidunt. Duis vel metus in massa rhoncus pulvinar. Suspendisse elit purus, rutrum at nunc et, dignissim pharetra leo. Aliquam erat volutpat. Fusce luctus ligula ligula, sit amet maximus massa viverra eu. Maecenas ac viverra purus. Duis arcu metus, tempor quis sollicitudin commodo, mattis eu lectus. Proin aliquam orci et lectus egestas, lacinia venenatis leo lacinia. Maecenas sed ante quis purus rutrum varius a et quam. Suspendisse vehicula enim non quam vehicula, sit amet sodales mi vestibulum. Vivamus sollicitudin condimentum purus, eu iaculis lacus. Donec dignissim est eget malesuada ornare. Pellentesque vehicula nibh dolor, nec efficitur ex hendrerit nec.", false, "", 5000));
        newList.add(new Guitar(2, "Fender Telecaster", 1951, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi pharetra pretium velit id tincidunt. Duis vel metus in massa rhoncus pulvinar. Suspendisse elit purus, rutrum at nunc et, dignissim pharetra leo. Aliquam erat volutpat. Fusce luctus ligula ligula, sit amet maximus massa viverra eu. Maecenas ac viverra purus. Duis arcu metus, tempor quis sollicitudin commodo, mattis eu lectus. Proin aliquam orci et lectus egestas, lacinia venenatis leo lacinia. Maecenas sed ante quis purus rutrum varius a et quam. Suspendisse vehicula enim non quam vehicula, sit amet sodales mi vestibulum. Vivamus sollicitudin condimentum purus, eu iaculis lacus. Donec dignissim est eget malesuada ornare. Pellentesque vehicula nibh dolor, nec efficitur ex hendrerit nec.", true, "", 6000) );
        newList.add(new Guitar(3, "Gibson ES150", 1934, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi pharetra pretium velit id tincidunt. Duis vel metus in massa rhoncus pulvinar. Suspendisse elit purus, rutrum at nunc et, dignissim pharetra leo. Aliquam erat volutpat. Fusce luctus ligula ligula, sit amet maximus massa viverra eu. Maecenas ac viverra purus. Duis arcu metus, tempor quis sollicitudin commodo, mattis eu lectus. Proin aliquam orci et lectus egestas, lacinia venenatis leo lacinia. Maecenas sed ante quis purus rutrum varius a et quam. Suspendisse vehicula enim non quam vehicula, sit amet sodales mi vestibulum. Vivamus sollicitudin condimentum purus, eu iaculis lacus. Donec dignissim est eget malesuada ornare. Pellentesque vehicula nibh dolor, nec efficitur ex hendrerit nec.", false, "", 9000));
        newList.add(new Guitar(4, "Gibson Les Paul", 1952,"The Gibson Les Paul Standard stands as one of the most widely played and universally recognizable guitars ever. First marketed as the Les Paul model in 1952, the Les Paul evolved throughout the '50s until the design was replaced by the SG in late 1960. Up until 1958, the Les Paul sported a gold finish, and guitars from this era are collectively referred to as Goldtops. Goldtop Les Pauls are extremely prized by collectors, and each year showcases the major innovations made by Gibson throughout the decade.", false, "Jimmy Page, Slash, Neil Young, Alex Lifeson, Pete Townshend", 15000));
//        list.add(new Guitar(5, "Rickenbacker 360 12", 1964));
//        list.add(new Guitar(6, "Gretsch 6128 Duo Jet", 1953));
//        list.add(new Guitar(7, "Fender Stratocaster", 1954));
//        list.add(new Guitar(8, "Fender Telecaster", 1951));
//        list.add(new Guitar(9, "Gibson ES150", 1934));
//        list.add(new Guitar(10, "Gibson Les Paul", 1952));
//        list.add(new Guitar(11, "Rickenbacker 360 12", 1964));
//        list.add(new Guitar(12, "Gretsch 6128 Duo Jet", 1953));
        return newList;
    }
}