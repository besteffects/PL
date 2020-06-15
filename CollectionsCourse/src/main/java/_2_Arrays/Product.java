package _2_Arrays;

import java.util.Comparator;

public class Product {
    public static final Comparator<Product> BY_WEIGHT
            // =Comparator.comparing(Product:: getWeight);
            = new Comparator<Product>() {
        public int compare(final Product p1, final Product p2) {
            return Integer.compare(p1.getWeight(), p2.getWeight());
        }
    };


    private final String name;
    private final int weight;

    public Product(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Arrays.Product{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}