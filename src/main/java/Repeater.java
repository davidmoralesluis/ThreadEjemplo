public class Repeater extends Thread {
    private String id;
    private int count;

    public Repeater(String id, int count) {
        this.id = id;
        this.count = count;
    }

    public void run() {
        do {
            System.out.println(id + ": " + count);
            count--;
            try {
                Thread.sleep(1000); // 1000ms = 1s
            } catch (InterruptedException ignore) {
            }
        } while (count > 0);
        System.out.println(id + ": end");
    }
}
