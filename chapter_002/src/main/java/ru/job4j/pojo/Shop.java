package ru.job4j.pojo;


public class Shop {

    public static void main(String[] args) {
        Product products[] = new Product[5];
        Shop shop = new Shop();
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        products[3] = new Product("Butter", 1);
        products[4] = new Product("Juice", 5);
        shop.delete(products,2);
    }

    public Product[] delete(Product[] products, int index) {
        products[index] = null;
        for (;index < products.length-1; index++) {
            products[index] = products[index + 1];
            products[index + 1] = null;
        }
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
        return products;
    }
}
