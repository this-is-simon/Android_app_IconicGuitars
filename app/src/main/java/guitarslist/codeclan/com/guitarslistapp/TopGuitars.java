package guitarslist.codeclan.com.guitarslistapp;

import java.util.ArrayList;

public class TopGuitars {

    private ArrayList<Guitar> list;

    public TopGuitars() {
        list = new ArrayList<Guitar>();
        list.add(new Guitar(1, "Fender Stratocaster", 1954, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi pharetra pretium velit id tincidunt. Duis vel metus in massa rhoncus pulvinar. Suspendisse elit purus, rutrum at nunc et, dignissim pharetra leo. Aliquam erat volutpat. Fusce luctus ligula ligula, sit amet maximus massa viverra eu. Maecenas ac viverra purus. Duis arcu metus, tempor quis sollicitudin commodo, mattis eu lectus. Proin aliquam orci et lectus egestas, lacinia venenatis leo lacinia. Maecenas sed ante quis purus rutrum varius a et quam. Suspendisse vehicula enim non quam vehicula, sit amet sodales mi vestibulum. Vivamus sollicitudin condimentum purus, eu iaculis lacus. Donec dignissim est eget malesuada ornare. Pellentesque vehicula nibh dolor, nec efficitur ex hendrerit nec."));
        list.add(new Guitar(2, "Fender Telecaster", 1951, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi pharetra pretium velit id tincidunt. Duis vel metus in massa rhoncus pulvinar. Suspendisse elit purus, rutrum at nunc et, dignissim pharetra leo. Aliquam erat volutpat. Fusce luctus ligula ligula, sit amet maximus massa viverra eu. Maecenas ac viverra purus. Duis arcu metus, tempor quis sollicitudin commodo, mattis eu lectus. Proin aliquam orci et lectus egestas, lacinia venenatis leo lacinia. Maecenas sed ante quis purus rutrum varius a et quam. Suspendisse vehicula enim non quam vehicula, sit amet sodales mi vestibulum. Vivamus sollicitudin condimentum purus, eu iaculis lacus. Donec dignissim est eget malesuada ornare. Pellentesque vehicula nibh dolor, nec efficitur ex hendrerit nec."));
        list.add(new Guitar(3, "Gibson ES150", 1934, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi pharetra pretium velit id tincidunt. Duis vel metus in massa rhoncus pulvinar. Suspendisse elit purus, rutrum at nunc et, dignissim pharetra leo. Aliquam erat volutpat. Fusce luctus ligula ligula, sit amet maximus massa viverra eu. Maecenas ac viverra purus. Duis arcu metus, tempor quis sollicitudin commodo, mattis eu lectus. Proin aliquam orci et lectus egestas, lacinia venenatis leo lacinia. Maecenas sed ante quis purus rutrum varius a et quam. Suspendisse vehicula enim non quam vehicula, sit amet sodales mi vestibulum. Vivamus sollicitudin condimentum purus, eu iaculis lacus. Donec dignissim est eget malesuada ornare. Pellentesque vehicula nibh dolor, nec efficitur ex hendrerit nec."));
//        list.add(new Guitar(4, "Gibson Les Paul", 1952));
//        list.add(new Guitar(5, "Rickenbacker 360 12", 1964));
//        list.add(new Guitar(6, "Gretsch 6128 Duo Jet", 1953));
//        list.add(new Guitar(7, "Fender Stratocaster", 1954));
//        list.add(new Guitar(8, "Fender Telecaster", 1951));
//        list.add(new Guitar(9, "Gibson ES150", 1934));
//        list.add(new Guitar(10, "Gibson Les Paul", 1952));
//        list.add(new Guitar(11, "Rickenbacker 360 12", 1964));
//        list.add(new Guitar(12, "Gretsch 6128 Duo Jet", 1953));
    }

    public ArrayList<Guitar> getList (){
        return new ArrayList<Guitar> (list);
    }
}