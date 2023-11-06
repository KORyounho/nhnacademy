package Thread클래스확장.quiz01;

public class TestCounter {
    public static void main(String[] args){
        Counter counter = new Counter("counter", 0);

        counter.start();
    }
}
