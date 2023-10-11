package unit01;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import useclass.Apple;

public class Unit1 {

    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<>();

        Apple a1 = new Apple(Color.RED, 140, 80);
        Apple a2 = new Apple(Color.GREEN, 170, 90);
        Apple a3 = new Apple(Color.RED, 150, 60);


        Collections.sort(inventory, new Comparator<Apple>() {
            @Override
            public int compare(Apple a1, Apple a2) {
                return a1.getWeight().compareTo(a2.getWeight());
            }
        });
        //자바 8이전에는 위와같은 익명 클래스를 정의하는 방법을 사용함.

        inventory.sort(Comparator.comparing(Apple::getWeight));

        //자바 8이후에는 더 간단한 방식으로 코드를 구현함.
    }
}
