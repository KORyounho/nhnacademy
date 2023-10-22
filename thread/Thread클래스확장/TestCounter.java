package Thread클래스확장;

public class TestCounter {
    public static void main(String[] args) {
        Counter counter = new Counter("Counter1");

        counter.start();

        try {
            counter.join();
        } catch(InterruptedException e){}

        System.out.println("Thread has been started");
    }
}
