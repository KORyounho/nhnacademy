package useclass.lamda;

public class Algorithm {
    public static int calc(BinaryOperation binaryOperation, int start, int end, int upper, int init) {
        int result = init;

        for (int i = start; i <= end; i = i + upper) {
            result = binaryOperation.apply(result, i);
        }
        return result;
    }

    public static int sum(int a, int b, int step){
        return calc(new Add(), a, b, step, 0);
    }
    public static int mul(int a, int b, int step){
        return calc(new Add(), a, b, step, 0);
    }
}
