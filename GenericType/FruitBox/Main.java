package GenericType.FruitBox;

import GenericType.Generic.BoxOnSteroids;
import GenericType.Generic.Pair;

public class Main {
    public static void main(String[] args) {
        FruitBox fruitBox = new FruitBox(new Orange());
        Orange fruit1 = (Orange) fruitBox.getFruit();

        BoxOnSteroids<Apple> appleBox = new BoxOnSteroids<>(new Apple());
        BoxOnSteroids<Orange> orangeBox = new BoxOnSteroids<>(new Orange());

        Orange fruit = orangeBox.getFruit();

        Pair<BoxOnSteroids<Apple>, BoxOnSteroids<Orange>> pairOfBoxes =
                new Pair<>(
                        new BoxOnSteroids<>(new Apple()),
                        new BoxOnSteroids<>(new Orange())
                );


    }
}
