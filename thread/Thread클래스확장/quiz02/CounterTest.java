package Thread클래스확장.quiz02;

public class CounterTest {
    public static void main(String[] args) {
        Counter yh = new Counter("윤호", 0);
        Counter hm = new Counter("현명", 0);
        Counter jm = new Counter("중민", 0);

        yh.run();
        hm.run();
    }
}
