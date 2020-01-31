package pl.biblioteka.biblioteka;


import java.util.Arrays;
import java.util.Random;

public enum Genre {
    UNSET, FANTASTYKA, HORROR, ROMANS, OBYCZAJOWA, KRYMINAL, PRZYGODOWA, SENSACJA;


    public static Genre getRandom() {
        return Arrays.asList(values()).get(new Random().nextInt(values().length));
    }
}
