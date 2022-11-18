public class ThreadEjemplo extends Thread{
    public ThreadEjemplo(String str){
        super(str);
    }
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(i+" "+ getName());
        }
        try {
            Thread.sleep(10);
        }catch(InterruptedException e){
            e.getMessage();
        }

        System.out.println("Termina thread "+ getName());
    }


}
