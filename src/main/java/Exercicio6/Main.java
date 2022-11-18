package Exercicio6;

import static java.lang.Thread.sleep;

public class Main {
     static int cash=0;
     static boolean dentro=false;
    public static void main(String[] args) throws InterruptedException {


        Exe6 input=new Exe6(10);
        Exe6 output=new Exe6(-5);

        input.start();
        output.start();

        //sleep(1000);
//        input.join();
//        output.join();
        System.out.println(" FINAL = "+cash);
    }
}
