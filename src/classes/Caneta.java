package classes;

public class Caneta {
    public String modelo;
    public String cor;
    public double ponta;
    public int carga;
    public boolean tampada;

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

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }



}
