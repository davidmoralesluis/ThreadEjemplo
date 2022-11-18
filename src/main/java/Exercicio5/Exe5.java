package Exercicio5;

public class Exe5 extends Thread{
    public Exe5(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Ola, son o fio numero "+getName());
    }
}
