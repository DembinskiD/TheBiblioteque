package pl.biblioteka.biblioteka;

import pl.biblioteka.biblioteka.products.ProductType;

import java.util.Arrays;
import java.util.Random;

public enum PublisherList {
    UNSET, PRH, HACHETTE, HELION, MAMIKO, OSSOLINEUM, MON, CZYTELNIK;

    public static PublisherList getRandom() {
        return Arrays.asList(values()).get(new Random().nextInt(values().length));
    }
}
