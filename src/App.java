

import classes.Caneta;

public class App {
    public static void main(String[] args) throws Exception {
        Caneta c1 = new Caneta("BIC",0.5, 100);
        c1.status();
        c1.setModelo("BIC Cristal");
        c1.getModelo();
        c1.status();

    }
}
