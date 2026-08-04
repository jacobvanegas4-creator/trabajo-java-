package com.example;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("P123", "Laptop", 1200.0, 50);
        Product p2 = new Product("P124", "Mouse", 25.0, 100);

        p1.setPrice(1150.0);
        p2.setStock(80);

        System.out.println("P1 - Nombre: " + p1.getName() + " | Precio: $" + p1.getPrice());
        System.out.println("P2 - Nombre: " + p2.getName() + " | Stock: " + p2.getStock());

        System.out.println(p1);
        System.out.println(p2);
    }
}