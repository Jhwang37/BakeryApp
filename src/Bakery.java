import java.util.Scanner;

public class Bakery {
    Scanner sc = new Scanner(System.in);

    protected String name;
    protected double price;
    protected String expiration;
    protected String diet;
    protected int stock;
    private String dietRestrict = "";


    //getters and setters
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
    public String getDietRestrict() {
        return dietRestrict;
    }
    public void setDietRestrict(String dietRestrict) {
        this.dietRestrict = dietRestrict;
    }

    //display welcome
    public void welcome() {
        System.out.println("**** WELCOME TO THE BIG BOY BAKERY ****");
        System.out.println("We sell the following baked goods: cookies, cakes, breads");
        System.out.println();
    }

    public void askDiet() {
            System.out.print("Do you have any diet restrictions (soy, gluten, peanut)? ");
            dietRestrict = sc.next();
            System.out.println();
    }

    public String displayText() {
        return "Type: "+ getName()+"\t\tPrice: "+getPrice()+"\t\tIn Stock: "+getStock()+"\t\tDiet: " + getDiet()+"\t\tExpiration: "+getExpiration();
    }

    public void showList(String dietRestrict){
        switch(dietRestrict){
            case "soy":
                if(!getDiet().equalsIgnoreCase("soy")) {
                    System.out.println(displayText());
                }
                break;

            case "gluten":
                if(!getDiet().equalsIgnoreCase("gluten")) {
                    System.out.println(displayText());
                }
                break;

            case "peanut":
                if(!getDiet().equalsIgnoreCase("peanut")) {
                    System.out.println(displayText());
                }
                break;

            default:
                System.out.println(displayText());
                break;
        }
    }

}
