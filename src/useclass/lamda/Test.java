package useclass.lamda;

public class Test {
    public static void main(String[] args) {
        int add1to10 = Algorithm.calc(new Add(), 1, 10, 1, 0);
        int mult1to10 = Algorithm.calc(new Multiply(), 1, 10, 1, 1);

        int ramdaAdd1To10 = Algorithm.calc((a, b) -> a + b, 1, 10, 1, 0);

        System.out.println(add1to10);
        System.out.println(mult1to10);
        System.out.println(ramdaAdd1To10);
        System.out.println(add1to10 == Algorithm.sum(1, 10, 1));


    }
}
