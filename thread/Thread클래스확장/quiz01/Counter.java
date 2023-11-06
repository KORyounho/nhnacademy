package Thread클래스확장.quiz01;

public class Counter extends Thread{
    String name;
    int start;
    public Counter(String name, int start){
        this.name = name;
        this.start = start;
    }

    @Override
    public void run(){
        for(int i = 0; i<10; i++) {
            System.out.println("count : " + (i+1));
            try {
                sleep(1000);
            }catch (InterruptedException e){
                return;
            }
        }
    }

}
