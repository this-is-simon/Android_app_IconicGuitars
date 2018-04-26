package guitarslist.codeclan.com.guitarslistapp;

import java.io.Serializable;

public class Guitar implements Serializable {

    private Integer ranking;
    private String title;
    private Integer year;

    public Guitar(Integer ranking, String title, Integer year){
        this.ranking = ranking;
        this.title = title;
        this.year = year;
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
}
