package guitarslist.codeclan.com.guitarslistapp;

import org.w3c.dom.Text;

import java.io.Serializable;

public class Guitar implements Serializable {

    private Integer ranking;
    private String title;
    private Integer year;
    private String details;
    private boolean isFavourite;

    public Guitar(Integer ranking, String title, Integer year, String details, boolean isFavourite){
        this.ranking = ranking;
        this.title = title;
        this.year = year;
        this.details = details;
        this.isFavourite = isFavourite;
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

    public boolean isFavourite() {
        return isFavourite;
    }

    public void setFavourite(boolean favourite) {
        isFavourite = favourite;
    }
}
