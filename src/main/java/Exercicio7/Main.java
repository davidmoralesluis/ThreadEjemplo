package Exercicio7;

import java.io.*;

public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Obxecto que sincronizará os fíos lectores e escritores
        Buzon b = new Buzon();

        //Créanse 3 Lectores e 3 Escritores
        WriteFile e1 = new WriteFile(b,"hola");
        ReadFile l1 = new ReadFile(b);

        WriteFile e2= new WriteFile(b,"hello");
        ReadFile l2 = new ReadFile(b);

        WriteFile e3= new WriteFile(b,"ola");
        ReadFile l3 = new ReadFile(b);

        //Inicianse os Escritores
        e1.start();
        e3.start();
        e2.start();

        //Inicianse os Lectores
        l1.start();
        l2.start();
        l3.start();
    }
}
