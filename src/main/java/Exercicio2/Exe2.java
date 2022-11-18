package Exercicio2;

public class Exe2 extends Thread{
    public Exe2(String str){
        super(str);
    }

    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println((i+1)+"# del "+ getName());
            try {
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.getMessage();
            }
        }


        System.out.println("Termina thread "+ getName());
    }
}
