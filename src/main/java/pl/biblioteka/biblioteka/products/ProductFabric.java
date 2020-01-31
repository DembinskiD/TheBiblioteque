package pl.biblioteka.biblioteka.products;


public class ProductFabric{

    public static Productable getProduct(ProductType type) {
        switch (type) {
            case BOOK:
                return new Book();
            case DVD:
                return new DVD();
            case PRESS:
                return new Press();
            default:
                return new Product();
        }
    }
}
