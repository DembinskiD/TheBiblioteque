package pl.biblioteka.biblioteka.products;

import java.util.Arrays;
import java.util.Random;

public enum ProductType {
    BOOK, DVD, PRESS;


    public static ProductType getRandom() {
        return Arrays.asList(values()).get(new Random().nextInt(values().length));
    }
}
