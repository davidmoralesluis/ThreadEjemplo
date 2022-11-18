package Exercicio2;

public class Main {
    public static void main(String[] args) {

        Exe2 erster=new Exe2("Erster");
        Exe2 zweiter=new Exe2("Zweiter");
        Exe2 dritter=new Exe2("Dritter");
        Exe2 vierter=new Exe2("Vierter");

        erster.start();
        zweiter.start();
        dritter.start();
        vierter.start();

        System.out.println("Fin de la Historia");
    }
}
