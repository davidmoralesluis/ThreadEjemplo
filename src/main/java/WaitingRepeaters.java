public class WaitingRepeaters {
    public static void main(String[] args)
            throws InterruptedException {
        Repeater threadA = new Repeater("A", 2);
        Repeater threadB = new Repeater("B", 5);

        threadA.start();
        threadB.start();

        System.out.println("Repeaters ...");
        threadA.join();
        System.out.println("A joins");
    }
}
