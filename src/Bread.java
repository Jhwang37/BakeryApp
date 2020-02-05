public class Bread extends Bakery {
       //default constructor
    public Bread() {

    }

    //overloaded constructor
    public Bread(String name, double price, String expiration, String diet, int stock) {
        this.name = name;
        this.price = price;
        this.expiration = expiration;
        this.diet = diet;
        this.stock = stock;
    }
 /* Bread b1 = new Bread("white", 2.99, "3/20/2020", "gluten", 10);
        Bread b2 = new Bread("wheat", 2.99, "3/29/2020", "gluten", 15);
        Bread b3 = new Bread("banana", 2.99, "3/15/2020", "none", 20);
        Bread b4 = new Bread("oatmeal", 2.99, "3/05/2020", "gluten", 10);
        Bread b5 = new Bread("rye", 2.99, "3/28/2020", "gluten", 20);*/
     /*   bread.add(b1.toString());
        bread.add(b2.toString());
        bread.add(b3.toString());
        bread.add(b4.toString());
        bread.add(b5.toString());*/
    //getters and setters

    //method to display bread
   public String displayBread() {
        return "Type: " + getName() + " Price: " + getPrice() + " Expiration: " + getExpiration() + " Dietary Restriction: " + getDiet() + " Quantity In Stock: " + getStock();
    }


}







