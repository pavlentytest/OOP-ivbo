package ru.pavlenty;

public class Main {

    public static void main(String[] args) {
        Seller oleg = new Seller();

        Seller ivan = new Seller(4,5,6,"ddd");

        Manager mmm = new Manager();
        mmm.toLie();
        mmm.toSale();

        }
}
