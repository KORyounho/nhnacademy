package useclass.lamda;

public class Add implements BinaryOperation{

    @Override
    public int apply(int a, int b) {
        return a+b;
    }
}
