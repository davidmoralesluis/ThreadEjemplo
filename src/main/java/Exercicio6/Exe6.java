package Exercicio6;

import static Exercicio6.Main.cash;
import static Exercicio6.Main.dentro;

public class Exe6 extends Thread{

    static int movimiento;
    public Exe6(int n){
        super(n+"");
        if (n>0){
            n--;
            if (n>0){
                movimiento=1; // (int)(Math.random()*10)+1;
                new Exe6(n).start();
            }

        }
        if (n<0){
            n++;
            if (n<0){
                movimiento =-1; // (((int) (Math.random() * 10) + 1) * -1);
                new Exe6(n).start();
            }
        }
    }

    @Override
    public void run() {

        move();

    }

    synchronized public void move() {

       while (dentro){
           try {
               wait();
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }
       System.out.printf(cash+"");
       dentro=true;
       cash = cash + (movimiento);
       dentro=false;
       System.out.println(" <-- :antes <"+getName()+">"+" ("+movimiento+") --> despues:"+cash);
       notify();

    }
}
