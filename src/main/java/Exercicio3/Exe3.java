package Exercicio3;

public class Exe3 extends Thread{
    public Exe3(int n){
        super("Core["+n+"]");
        n--;
        if (n>0){
            new Exe3(n).start();
        }
    }

    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(i+1+"´ -> "+ getName());
        }
        System.out.println("Termina thread "+ getName());
    }
}
