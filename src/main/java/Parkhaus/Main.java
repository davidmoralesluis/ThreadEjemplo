package Parkhaus;

public class Main {

    static String [] plazasParking={"-","-","-","-","-","-"}; //new boolean[6];
    static int plazasLibres=6;

    public static void main(String[] args) throws InterruptedException {

        Parking bmw=new Parking("bmw");
        Parking audi=new Parking("audi");
        Parking benz=new Parking("benz");
        Parking lambo=new Parking("lambo");
        Parking vw=new Parking("vw");
        Parking seat=new Parking("seat");
        Parking tractor=new Parking("tractor");

        bmw.start();
        bmw.join();
        audi.start();
        audi.join();
        benz.start();
        benz.join();
        lambo.start();
        lambo.join();
        vw.start();
        vw.join();
        seat.start();
        seat.join();
        bmw.start();
        // bmw.join();
        // tractor.start();
        // tractor.join();

        System.out.println("fin");
    }
}
