package Thread클래스확장.inf.방법2;

// 1. Runnalbe 인터페이스를 구현한다.
public class MyRunnable implements Runnable{
    private String str;

    public MyRunnable(String str){
        this.str = str;
    }

    // 2. run() 메서드를 오버라이딩 한다.
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println("--- " + name + " ---");
        for (int i = 0; i < 10; i++) {
            System.out.print(str);
            try {
                Thread.sleep(1000); // 1초간 쉼.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
