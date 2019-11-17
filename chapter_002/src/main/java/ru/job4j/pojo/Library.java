package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Преступление и наказание",150);
        Book book2 = new Book("Вишнёвые сады",100);
        Book book3 = new Book("Капитанская дочка",80);
        Book book4 = new Book("Clean code",600);

        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;

        for (int i = 0; i < books.length; i++) {
            Book b = books[i];
            System.out.println(b.getName()+ " " + " " + b.getPages());
        }

        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;
        System.out.println();

        for (int i = 0; i < books.length; i++) {
            Book b = books[i];
            System.out.println(b.getName()+ " " + " " + b.getPages());
        }
        System.out.println();

        for (int i = 0; i < books.length; i++) {
            Book b = books[i];

            if (b.getName().equals("Clean code"))
            System.out.println(b.getName()+ " " + " " + b.getPages());
        }
    }
}
