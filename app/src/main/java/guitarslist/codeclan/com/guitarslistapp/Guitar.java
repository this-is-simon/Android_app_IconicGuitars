package guitarslist.codeclan.com.guitarslistapp;

import org.w3c.dom.Text;

import java.io.Serializable;

public class Guitar implements Serializable {

    private Integer ranking;
    private String title;
    private Integer year;
    private String details;
    private boolean isFavourite;
    private String notablePlayers;
    private Integer priceOfGuitar;
    private String budgetString;

    public Guitar(Integer ranking, String title, Integer year, String details, boolean isFavourite, String notablePlayers, Integer priceOfGuitar){
        this.ranking = ranking;
        this.title = title;
        this.year = year;
        this.details = details;
        this.isFavourite = isFavourite;
        this.notablePlayers = notablePlayers;
        this.priceOfGuitar = priceOfGuitar;
        this.budgetString = null;
    }

    public Integer getRanking() {
        return ranking;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getDetails(){
        return details;
    }

    public String getNotablePlayers(){
        return notablePlayers;
    }

    public String getNotablePlayersString() {
        return "Notable players include: " + notablePlayers;
    }

    public boolean isFavourite() {
        return isFavourite;
    }

    public void setFavourite(boolean favourite) {
        isFavourite = favourite;
    }

    public Integer getPriceOfGuitar(){
        return this.priceOfGuitar;
    }

    public String getPriceOfGuitarString(){
        return "Average price: £" + priceOfGuitar;
    }

    public void setBudgetString(String months){
        budgetString =  "It will take you " + months + " to afford a " + title;
    }

    public String getBudgetString() {
        return budgetString;
    }
}
