package Thread클래스확장;

public class MyExercise{
    static long startTime = 0;
    public static void main(String[] args) {
        MyThread thread1 = new MyThread(5);
        MyThread thread2 = new MyThread(10);

        thread1.start();
        thread2.start();

        System.out.println("hi");

    }
}

class MyThread extends Thread{

    public MyThread(int size)
    {
        this.size = size;
    }

    private int [] arr;

    private int size;

    @Override
    public void run(){
        arr = new int[size];

        for(int i = 0; i<10; i++){
            arr[i] = i;
            System.out.println(i+1);

        }
    }

}