import java.util.ArrayList;

public class Cookies extends Bakery {

//    cookie1.setName("chocolate chip");
//    cookie1.setAllergy("soy");
//    cookie1.setPrice(19.99);
//    cookie1.setExpiration(date);
//    cookie1.setStock(20);
//
//    protected String name;
//    protected double price;
//    protected String expiration;
//    protected String diet;
//    protected int stock;


    public Cookies(){

    }
    public Cookies(String name, double price, String expiration, String diet, int stock){
        this.name = name;
        this.price = price;
        this.expiration = expiration;
        this.diet = diet;
        this.stock = stock;

        Cookies c1 = new Cookies("choloclate chip", 2.99, "2/20/2020", "gluten", 354);
        cookies.add(c1.toString());

        System.out.println(cookies);

        Cookies c2 = new Cookies();
        Cookies c3 = new Cookies();
        Cookies c4 = new Cookies();
        Cookies c5 = new Cookies();

    }





//
//    String cookie1 = "Name: " + name + "\nAllergy" + allergy + "\nPrice: " + price;
//    String s = cookie1.toString();
//    cookies.put(String s);
//
//
//    cookie1.setName("chocolate chip");
//    cookie1.setAllergy("soy");
//    cookie1.setPrice(19.99);
//    String cookie1 = "Name: " + name + "\nAllergy" + allergy + "\nPrice: " + price;
//
//
//    cookie1.setName("chocolate chip");
//    cookie1.setAllergy("soy");
//    cookie1.setPrice(19.99);
//    String cookie1 = "Name: " + name + "\nAllergy" + allergy + "\nPrice: " + price;


}
