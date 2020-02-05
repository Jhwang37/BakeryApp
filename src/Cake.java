public class Cake extends Bakery {
    public Cake(){
    }

    public Cake(String name, double price, String expiration, String diet, int stock) {
        this.name = name;
        this.price = price;
        this.expiration = expiration;
        this.diet = diet;
        this.stock = stock;
    }
}
