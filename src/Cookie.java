public class Cookie extends Bakery {

    //constructors
    public Cookie() {
    }

    public Cookie(String name, double price, String expiration, String diet, int stock) {
        this.name = name;
        this.price = price;
        this.expiration = expiration;
        this.diet = diet;
        this.stock = stock;
    }
}