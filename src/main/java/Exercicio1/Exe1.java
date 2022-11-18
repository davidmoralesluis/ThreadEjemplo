package Exercicio1;

public class Exe1 extends Thread{

    public Exe1(String str){
        super(str);
    }

    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1)+"# del "+ getName());
            try {
                sleep((int)Math.random()*1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Termina thread "+ getName());
    }
}
