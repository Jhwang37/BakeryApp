import java.util.ArrayList;
import java.util.Scanner;

public class Bakery {
    protected String name;
    protected double price;
    protected String expiration;
    protected String diet;
    protected int stock;

    Scanner sc = new Scanner(System.in);

    public ArrayList<String> cookies = new ArrayList<String>();


    // Cookies c1 = new Cookies("chocolate", 19.11, "2/1999", "soy", 10000);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


    public String welcome() {
        System.out.println("howdy! welcoem to the place");
        System.out.println("We sell the following baked goods: cookies, cake, bread");
        System.out.println("which are you interested in? ");
        String category = sc.next();

        return category;
//
//        if category.equals("cookies"){
//            Cookies
//        } else if
//    }


    }
}
