package example0404;

public class Example4_0403 {
    /**
     * 정수를 입력받아서, 해당 숫자가 소수면 true, 아니면 false
     * 에라토스테네스의 체 기법을 이용
     * @param N
     * @return if( no Prime -> false,  is Prime -> true )
     */

    static boolean isPrime(int N){
        int divisor; // 나눌 값

        if(N <= 1)  // 1보다 작은경우 (1은 소수가 아니고, 0이하의 정수는 N의 값으로 마땅하지 않음
            return false; // early return

        int maxToTry = (int) Math.sqrt(N + 0.001); // 0.001을 붙인 이유는, double형이기 때문에, 그냥 N만 넣으면 값이 근사치가 정확하지 않아서

        for(divisor = 2; divisor <= maxToTry; divisor++){
            if(N % divisor == 0){
                return false;
            }
        }
        return true;
    }
}
