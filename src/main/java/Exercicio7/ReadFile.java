package Exercicio7;

import java.io.*;

public class ReadFile extends Thread{
    private Buzon bz;

    //Constructor
    public ReadFile(Buzon mail){
        bz = mail;
    }

    //Lánzase o método lector sincronizado do obxecto buzón
    @Override
    public void run(){
        bz.lector();
    }
}
