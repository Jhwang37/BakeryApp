import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     Bakery bakery = new Bakery();
     bakery.welcome();

        Cookies aas = new Cookies();


        Bread b1 = new Bread("white", 2.99, "3/20/2020", "gluten", 10);
        Bread b2 = new Bread("wheat", 2.99, "3/29/2020", "gluten", 15);
        Bread b3 = new Bread("banana", 2.99, "3/15/2020", "none", 20);
        Bread b4 = new Bread("oatmeal", 2.99, "3/05/2020", "gluten", 10);
        Bread b5 = new Bread("rye", 2.99, "3/28/2020", "gluten", 20);

        System.out.println(b1.displayBread());
    }

}
