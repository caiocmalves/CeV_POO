import classes.Caneta;

public class App {
    public static void main(String[] args) throws Exception {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5;
        c1.tampada = false;
        c1.modelo = "Bic Padrão";
        c1.tampar();
        c1.rabiscar();
        c1.destampar();
        c1.rabiscar();
         
       

    }
}
