public class Main {

    public static void main(String[] args) {
        Bakery b = new Bakery();
        b.welcome();

        Cookie c1 = new Cookie("choloclate chip", 2.99, "2/20/2020", "gluten", 354);
        Cookie c2 = new Cookie("oatmeal", 3.99, "3/28/2020", "none", 56);
        Cookie c3 = new Cookie("sugar", 0.99, "12/31/2020","none",6500);
        Cookie c4 = new Cookie("snicker doodle",3.50,"5/15/2020","peanut",67);
        Cookie c5 = new Cookie("gingersnap",1.99,"8/30/2020","none",400);

        c1.askDiet();
        c1.showCookieList(c1.getDietRestrict());
        c2.showCookieList(c1.getDietRestrict());
        c3.showCookieList(c1.getDietRestrict());
        c4.showCookieList(c1.getDietRestrict());
        c5.showCookieList(c1.getDietRestrict());


    }

}





/////// ******** IGNORE ******** ///////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //        System.out.println();
//        System.out.println();
//        System.out.println(c1.displayCookie());
//        System.out.println(c2.displayCookie());
//        System.out.println(c3.displayCookie());
//        System.out.println(c4.displayCookie());
//        System.out.println(c5.displayCookie());
//        System.out.println();
//        System.out.println();

//        System.out.println("c1.getDiet() = "+c1.getDiet());






//        ArrayList<String> cookies = new ArrayList<String>();
//
//        cookies.add(c1.toString());
//        cookies.add(c2.toString());
//        cookies.add(c3.toString());
//        cookies.add(c4.toString());
//        cookies.add(c5.toString());
//
//        System.out.println(cookies);
////        for(String key: cookies){
//        for(int i=0; i<cookies.size(); i++){
//            System.out.print(cookies.get(i)+ "_");
//        }
//
//        System.out.println();
//        System.out.println();
//        System.out.println("cookies.get(1) = "+cookies.get(0));
//        System.out.println("c1 = "+c1);
//        System.out.println("c1.toString() = "+c1.toString());



//        System.out.println(c1.cookies);

        //        Cookies test = new Cookies();
//        test.setName("testname");
//        test.setPrice(999);
//        test.setDiet("soy");
//        test.setExpiration("march 2020");
//        test.setStock(1000);
//
//        System.out.println("test = "+test);
//        System.out.println(test.getName() + " " + test.getDiet()+" "+ test.getPrice());
//
//        if (test.getDiet().equals("soy")){
//            System.out.println("this contains soy");
//        }




//
//    public static void welcome(){
//
//    }

    //        System.out.println("Type: "+c1.getName()+"\t\tPrice: "+c1.getPrice()+"\t\tIn Stock: "+c1.getStock()+"\t\tDiet: " + c1.getDiet()+"\t\tExpiration: "+c1.getExpiration());
//        System.out.println("Type: "+c2.getName()+"\t\tPrice: "+c2.getPrice()+"\t\tIn Stock: "+c2.getStock()+"\t\tDiet: " + c2.getDiet()+"\t\tExpiration: "+c2.getExpiration());
//        System.out.println("Type: "+c3.getName()+"\t\tPrice: "+c3.getPrice()+"\t\tIn Stock: "+c3.getStock()+"\t\tDiet: " + c3.getDiet()+"\t\tExpiration: "+c3.getExpiration());
//        System.out.println("Type: "+c4.getName()+"\t\tPrice: "+c4.getPrice()+"\t\tIn Stock: "+c4.getStock()+"\t\tDiet: " + c4.getDiet()+"\t\tExpiration: "+c4.getExpiration());
//        System.out.println("Type: "+c5.getName()+"\t\tPrice: "+c5.getPrice()+"\t\tIn Stock: "+c5.getStock()+"\t\tDiet: " + c5.getDiet()+"\t\tExpiration: "+c5.getExpiration());



