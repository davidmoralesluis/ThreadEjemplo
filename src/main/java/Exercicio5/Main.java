package Exercicio5;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Exe5 numero1=new Exe5("1");
        Exe5 numero2=new Exe5("2");

        numero1.setPriority(1);
        numero2.setPriority(10);

        numero1.start();
        numero2.start();
        //numero2.join();
        //numero1.join();
    }
}
