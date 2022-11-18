package Exercicio1;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread primero=new Thread(new Exe1("Primero"));
        Thread segundo=new Thread(new Exe1("Segundo"));

        primero.start();
        segundo.start();
    }
}