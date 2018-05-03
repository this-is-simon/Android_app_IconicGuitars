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
        guitarImageHashMap.put("Gibson Les Paul Standard", R.drawable.gibson_les_paul);
        guitarImageHashMap.put("Rickenbacker 360 12", R.drawable.rickenbacker);
        guitarImageHashMap.put("Gretsch 6128 Duo Jet", R.drawable.gretsch_duojet);

        ArrayList<Guitar> newList = new ArrayList<Guitar>();

        newList.add(new Guitar(1, "Fender Stratocaster", 1954, "As the year that started it all, Stratocasters from 1954 are extremely collectible and prized instruments. Full production on the Stratocaster did not start until October of that year, so earlier examples exhibit a great deal of variation and are generally considered prototypes. It was in this year that the body shape and contour of the Strat were nailed down, and that its unique tremolo bridge was developed. \n" +
                "\n" +
                "Years of Production: 1954 - present\n" +
                "\n" +
                "Unique to this Year: Strats from 1954 exhibit a great deal of variation particularly those produced before October. Changing design features include the bakelite knobs and covers, neck profile, screw placement, and pickguard composition.", false, "Bob Dylan, Stevie Ray Vaughn, Jimi Hendrix, Buddy Holly, Eric Clapton", 22000));
        newList.add(new Guitar(2, "Fender Telecaster", 1951, "A striking example of Fender's time-honored innovation, this 1951 model stands out as the debut year of the Telecaster. It was the first ever Spanish-styled solid-body guitar to be commercially mass produced for the working musician. It boasts beauty and confidently portrays the utilitarian concept of form and function. With an ash body and see-through blonde finish, this long-established workhorse was engineered for simplicity and understated beauty. And the tone is no exception. Adorning its original dual single-coil pickups, it gushes with that sought-after Tele sound. That \"sound\" originated from an attempt to capture Fender's lap steel guitars while still appealing to jazz guitarists. The bright and snappy bridge pickup is paired with a darker and warmer neck pickup to accentuate its round bass notes. ", true, "", 25000) );
        newList.add(new Guitar(3, "Gibson ES150", 1934, "The Gibson ES-150 electric guitar has an important place in the company's history: it was one of the first successful guitars in the ES line, or the Electric Spanish series. Though manufacturing of the ES-150 began in 1936, it was stopped during World War II and then rereleased in '46 with a number of redesigned elements, such as the inclusion of a P-90 rather than a \"Charlie Christian\" pickup. Own a piece of history by grabbing a vintage Gibson ES-150.", false, "", 3500));
        newList.add(new Guitar(4, "Gibson Les Paul Standard", 1952,"The Gibson Les Paul Standard stands as one of the most widely played and universally recognizable guitars ever. First marketed as the Les Paul model in 1952, the Les Paul evolved throughout the '50s until the design was replaced by the SG in late 1960. Up until 1958, the Les Paul sported a gold finish, and guitars from this era are collectively referred to as Goldtops. Goldtop Les Pauls are extremely prized by collectors, and each year showcases the major innovations made by Gibson throughout the decade.", false, "Jimmy Page, Slash, Neil Young, Alex Lifeson, Pete Townshend", 16000));
        newList.add(new Guitar(5, "Rickenbacker 360 12", 1963, "Rickenbacker’s 360 12, introduced in 1963, was a revolutionary design. This 12-string semi-hollow electric was made popular by George Harrison of the Beatles. Other British Invasion groups took to Rickenbacker instruments as well. The Who’s John Entwistle played his thunderous lines on a Rickenbacker bass, while guitarist Pete Townshend used a Rick on 'Substitute,' 'My Generation,' and other early songs.", false, "George Harrison, John Entwhistle", 0));
        newList.add(new Guitar(6, "Gretsch 6128 Duo Jet", 1956, "The Duo-Jet stands as one of Gretsch's most iconic guitars and certainly its most iconic solidbody. This chambered solidbody is most closely associated with George Harrison who played one in the early Beatles era and throughout his whole career. While not as collectable as their Gibson or Fender counterparts, vintage Duo-Jets are amongst the most prized Gretsch solidbody guitars.", false, "David Gilmour, George Harrison", 5000));
//        newList.add(new Guitar(7, "Gibson SG", 1968, "The Gibson SG was introduced in 1961 as a complete replacement for the Les Paul. The new design was thought to be a more modern solidbody guitar, with sleek beveled edges and two sharp cutaways. By late 1963, the Les Paul moniker was dropped, and the SG (or Solid Guitar) became an entirely separate model. The SG has remained in steady production ever since earning a place as one of the truly classic solidbody guitars.", false, "Tony Iommi, Angus Young, Derek Trucks, Jeff Tweedy, Robbie Krieger", 3000));
//        newList.add(new Guitar(8, "Gibson Explorer", 1984, ""After its short but noteworthy premier in 1958, the Gibson Explorer went out of production until the mid-'70s. Gibson changed the Explorer design in 1981 to include uncovered "Dirty Fingers" humbuckers, a maple neck with Ebony fingerboard, and chrome-plated hardware. In mid-1984, Gibson started offering a wide range of custom and artist colors and designs. Also in this year, the placement of the pickup selector and control knobs changed." false, "The Edge, Billy Gibbons, James Hetfield", 2000));
//        newList.add(new Guitar(9, "Gibson ES-335", 1958, "The Gibson ES-335 made its debut in 1958 and immediately began making history. As the first thin-line, semi-hollowbody guitar in production, it gave players interested in exploring the warmer tones of hollow-body guitars and the joy and power of loud amplification a license to kill on stage and in the studio. And they took it. Almost immediately Chuck Berry, B.B. King and a host of other hard-working musicians began brandishing the ES-335, and, later, its sisters, the ES-345, which one-upped the ES-335 with the E.Q.-savvy Vari-Tone switch, and the ES-355, which flashed up the ES-345 with gold hardware and other appealing trimmings.", false, "Chuck Berry, Eric Clapton, BB King"));
//        newList.add(new Guitar(10, "Gibson 'Burst' Les Paul", 1958, "The Gibson Les Paul Standard stands as one of the most widely played and universally recognizable guitars ever. First marketed as the Les Paul model in 1952, the Les Paul evolved throughout the '50s until the design was replaced by the SG in late 1960. In 1958, the standard finish for the Les Paul was changed from gold to cherry sunburst. Sunburst or 'Burst' Les Pauls from 1958 till 1960 are some of the most sought-after vintage guitars on the market. For many, they represent the absolute pinnacle of Gibson innovation in its golden age.", false, "Jimmy Page, Slash, Neil Young, Alex Lifeson, Pete Townshend", 160000));

        return newList;
    }
}