package example0403;

public class Exercise4_0301 {
    // contract을 위해 주석 추가 ( contract -> 개발자에게는 구문적인 의미 이해, 호출자에게는 의미론적인 의미 이해
    public static void printMeasure(int n){
        System.out.print(n + "의 약수 = ");
        for(int i = 1; i<=n/2; i++){ // n의 약수로 가능한 경우의수 전체 방문
            if(n%i == 0){ // i의 값이 약수일 경우,
                System.out.print(i+ " "); //print에 추가
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(args[0]);
        printMeasure(100);
    }
}
