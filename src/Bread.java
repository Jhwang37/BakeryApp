public class Bread {
    private String name;
    private double price;
    private String expiration;
    private String diet;
    private int stock;

    public Bread() {

    }

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

    public Bread(String name, double price, String expiration, String diet, int stock) {
        this.name = name;
        this.price = price;
        this.expiration = expiration;
        this.diet = diet;
        this.stock = stock;


        Bread b1 = new Bread("white", 2.99, "3/20/2020", "gluten", 10);
        Bread b2 = new Bread("wheat", 2.99, "3/29/2020", "gluten", 15);
        Bread b3 = new Bread("banana", 2.99, "3/15/2020", "none", 20);
        Bread b4 = new Bread("oatmeal", 2.99, "3/05/2020", "gluten", 10);
        Bread b5 = new Bread("rye", 2.99, "3/28/2020", "gluten", 20);
     /*   bread.add(b1.toString());
        bread.add(b2.toString());
        bread.add(b3.toString());
        bread.add(b4.toString());
        bread.add(b5.toString());*/






        System.out.println("Bread Inventory Includes: " + b1 + " " + b2 + " " + b3 + " " + b4 + "and" + b5);
        }





}