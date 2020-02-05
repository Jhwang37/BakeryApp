public class Cookie extends Bakery {

    //constructors
    public Cookie(){

    }
    public Cookie(String name, double price, String expiration, String diet, int stock){
        this.name = name;
        this.price = price;
        this.expiration = expiration;
        this.diet = diet;
        this.stock = stock;
    }

    //methods
    public String displayCookie() {
        return "Type: "+ getName()+"\t\tPrice: "+getPrice()+"\t\tIn Stock: "+getStock()+"\t\tDiet: " + getDiet()+"\t\tExpiration: "+getExpiration();
    }

    public void showCookieList(String dietRestrict){
        switch(dietRestrict){
            case "soy":
                if(!getDiet().equalsIgnoreCase("soy")) {
                    System.out.println(displayCookie());
                }
                break;

            case "gluten":
                if(!getDiet().equalsIgnoreCase("gluten")) {
                    System.out.println(displayCookie());
                }
                break;

            case "peanut":
                if(!getDiet().equalsIgnoreCase("peanut")) {
                    System.out.println(displayCookie());
                }
                break;

            default:
                System.out.println(displayCookie());
                break;
        }
    }
}


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
