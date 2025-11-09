// Similar to bubble sort

import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameUI.InternalFramePropertyChangeListener;

import java.util.ArrayList;
import java.util.Collections;

public class Product implements Comparable<Product> {
    int id;
    String name;
    double rating;
    int discount;
    int price;

    @Override
    public String toString() {
        return "Product[id = " + id + ", name = " + name + ", rating = " + rating + ", discount = " + discount + ", price = " + price + "]";
    }

    public Product(int id, String name, double rating, int discount, int price) {
        super();
        this.id = id;
        this.name = name;
        this.rating = rating;
        this.discount = discount;
        this.price = price;
    }
    @Override
    public int compareTo(Product o) {
        return Integer.compare(this.price, o.price);
    }
    public static void main(String[] args) {
        List<Product> Items = new ArrayList<>();
        Items.add(new Product(1, "Nike Shoe", 4.5, 30, 7000));
        Items.add(new Product(2, "Rolex watch", 4.4, 10, 90000));
        Items.add(new Product(3, "Shirt", 4.8, 50, 1500));
        Items.add(new Product(4, "TShirt", 3.9, 18, 449));
        Items.add(new Product(5, "Dress", 4.7, 100, 0));

        System.out.println("\t\t\t Before sorting");
        for(Product p : Items) {
            System.out.println(p);
        }
        System.out.println();

        Collections.sort(Items);

        System.out.println("\t\t\t After sorting");
        for(Product p : Items) {
            System.out.println(p);
        }
    }
}

