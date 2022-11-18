package Exercicio7;

import java.io.*;

public class WriteFile extends Thread{
    private Buzon bz;
    private String txt;

    //Constructor
    public WriteFile(Buzon mail, String texto){
        bz = mail;
        txt = texto;
    }

    //Lánzase o método escritos sincronizado do obxecto buzón enviandolle a mensaxe
    @Override
    public void run(){
        bz.escritor(txt);
    }
}
