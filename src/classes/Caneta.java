package classes;

public class Caneta {
    private String modelo;
    private String cor;
    private double ponta;
    private int carga;
    private boolean tampada;

        
    public Caneta(String modelo, double ponta, int carga) {
        this.tampar();
        this.cor = "Azul";
        this.modelo = modelo; //pode ser assim 
        this.setPonta(ponta); // e também pode ser assim desde que tenha o set e o get do atributo
        this.setCarga(carga);
        
    }


    public void status(){
        System.out.println("Modelo " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta:  " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }
 
    public void rabiscar(){
        if (this.tampada == true) {
            System.out.println("ERRO: NÃO POSSO RABISCAR");            
        }
        else {
            System.out.println("estou rabiscando!!");
        }
    }

    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public String getCor() {
        return cor;
    }


    public void setCor(String cor) {
        this.cor = cor;
    }


    public double getPonta() {
        return ponta;
    }


    public void setPonta(double ponta) {
        this.ponta = ponta;
    }


    public int getCarga() {
        return carga;
    }


    public void setCarga(int carga) {
        this.carga = carga;
    }


    public void tampar() {
        this.tampada = true;
    }


    public void destampar() {
        this.tampada = false;
    }

    


}
