package Exercicio4;

public class Exe4 extends Thread{
    public Exe4(String s) {
        super(s);
    }

    @Override
    public void run() {
        int suma=0;
        if (getName()=="pares"){
            for (int i = 0; i < 1000; i++) {
                if (i%2==0){
                    suma+=i;
                }
            }
        }
        if (getName()=="impares"){
            for (int i = 0; i < 1000; i++) {
                if (i%2==1){
                    suma+=i;
                }
            }
        }
        if (getName()=="2y3"){
            for (int i = 0; i < 1000; i++) {
                if ((i%10==2)||(i%10==3)){
                    suma+=i;
                }
            }
        }
        System.out.println(getName()+" -> "+suma);
    }
}
