package guitarslist.codeclan.com.guitarslistapp;

import java.util.ArrayList;

public class TopGuitars {

    private ArrayList<Guitar> list;

    public TopGuitars() {
        list = new ArrayList<Guitar>();
        list.add(new Guitar(1, "Fender Stratocaster", 1954));
        list.add(new Guitar(2, "Fender Telecaster", 1951));
        list.add(new Guitar(3, "Gibson ES150", 1934));
        list.add(new Guitar(4, "Gibson Les Paul", 1952));
        list.add(new Guitar(5, "Rickenbacker 360 12", 1964));
        list.add(new Guitar(6, "Gretsch 6128 Duo Jet", 1953));
        list.add(new Guitar(7, "Fender Stratocaster", 1954));
        list.add(new Guitar(8, "Fender Telecaster", 1951));
        list.add(new Guitar(9, "Gibson ES150", 1934));
        list.add(new Guitar(10, "Gibson Les Paul", 1952));
        list.add(new Guitar(11, "Rickenbacker 360 12", 1964));
        list.add(new Guitar(12, "Gretsch 6128 Duo Jet", 1953));
    }

    public ArrayList<Guitar> getList (){
        return new ArrayList<Guitar> (list);
    }
}