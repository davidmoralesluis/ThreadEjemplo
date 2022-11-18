package Parkhaus;

import java.util.Arrays;

import static Parkhaus.Main.plazasParking;
import static Parkhaus.Main.plazasLibres;

public class Parking extends Thread{

    boolean out=false;
    public Parking(String name) {
        super(name);
    }

    @Override
    public void run() {
        out=false;
        for (int i = 0; i < plazasParking.length; i++) {
            if (getName().equals(plazasParking[i])){
                salir(i);
                out=true;
            }
        }
        if (!out){
            while (plazasLibres==0){
                System.out.println("Esperando");
                try {
                    sleep((long) (Math.random()*1000));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            aparcar();
        }

    }

    synchronized public void aparcar(){

        for (int i = 0; i < plazasParking.length; i++) {
            if (plazasParking[i].equals("-")){
                plazasParking[i]=getName();
                System.out.println("ENTRADA: "+getName()+" aparca en plaza -> "+i);
                plazasLibres--;
                break;
            }
        }
        System.out.println("Plazas Libres: "+plazasLibres+"\nParking:" + Arrays.toString(plazasParking));
    }
    synchronized public void salir(int i){
        plazasParking[i]="-";
        plazasLibres++;
        System.out.println("Plazas Libres: "+plazasLibres+"\nParking:" + Arrays.toString(plazasParking));
    }
}