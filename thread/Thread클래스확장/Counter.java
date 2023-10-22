package Thread클래스확장;

public class Counter extends Thread{

    String name;
    int count;


    public Counter(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    @Override
    public void run(){
        System.out.println("Greetings from thread '" + name + "'!");

    }
}
