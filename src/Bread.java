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

}