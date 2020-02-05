public class Main {

    public static void main(String[] args) {
        Bakery b = new Bakery();
        b.welcome();

        Cookie c1 = new Cookie("choloclate chip", 2.99, "2/20/2020", "gluten", 354);
        Cookie c2 = new Cookie("oatmeal", 3.99, "3/28/2020", "none", 56);
        Cookie c3 = new Cookie("sugar", 0.99, "12/31/2020","none",6500);
        Cookie c4 = new Cookie("snickerdoodle",3.50,"5/15/2020","peanut",67);
        Cookie c5 = new Cookie("gingersnap",1.99,"8/30/2020","none",400);

        Cake ck1 = new Cake("chocolate cake", 12.99, "2/20/2020", "soy", 29);
        Cake ck2 = new Cake("vanilla cake", 12.99, "2/20/2020", "gluten", 23);
        Cake ck3 = new Cake("coffee cake", 12.99, "2/20/2020", "none", 21);
        Cake ck4 = new Cake("funfetti cake", 12.99, "2/20/2020", "none", 25);
        Cake ck5 = new Cake("rainbow cake", 12.99, "2/20/2020", "peanut", 23);

        Bread b1 = new Bread("white", 2.99, "3/20/2020", "gluten", 10);
        Bread b2 = new Bread("wheat", 2.99, "3/29/2020", "gluten", 15);
        Bread b3 = new Bread("banana", 2.99, "3/15/2020", "none", 20);
        Bread b4 = new Bread("oatmeal", 2.99, "3/05/2020", "gluten", 10);
        Bread b5 = new Bread("rye", 2.99, "3/28/2020", "gluten", 20);


        c1.askDiet();
        //cookies
        System.out.println("\nCookies:");
        c1.showList(c1.getDietRestrict());
        c2.showList(c1.getDietRestrict());
        c3.showList(c1.getDietRestrict());
        c4.showList(c1.getDietRestrict());
        c5.showList(c1.getDietRestrict());
        //cakes
        System.out.println("\nCakes:");
        ck1.showList(c1.getDietRestrict());
        ck2.showList(c1.getDietRestrict());
        ck3.showList(c1.getDietRestrict());
        ck4.showList(c1.getDietRestrict());
        ck5.showList(c1.getDietRestrict());
        //breads
        System.out.println("\nBreads:");
        b1.showList(c1.getDietRestrict());
        b2.showList(c1.getDietRestrict());
        b3.showList(c1.getDietRestrict());
        b4.showList(c1.getDietRestrict());
        b5.showList(c1.getDietRestrict());

    }

}