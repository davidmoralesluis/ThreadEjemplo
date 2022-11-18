package Exercicio3;

import static Exercicio3.Main.contador;

public class Exe3v2 extends Thread{
    public Exe3v2() {
        super("Core["+contador+"]");
        if (contador<5) {
            contador++;
            new Exe3v2().start();
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i+1+"´ -> "+ getName());
        }
        System.out.println("Termina thread "+ getName());
    }
}
