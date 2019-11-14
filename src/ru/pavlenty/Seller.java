package ru.pavlenty;

public class Seller {
    // характеристики - ПОЛЯ (СВО-ВА, АТТРИБУТЫ)
    protected int age = 4; // 0
    private double salary = 4.5;// 0.0
    private int years = 10;// 0
    private String brand = "Str"; // null


    // конструктор - перегружен
    // @Overload

    Seller() {

    }

    Seller(int a, double s, int y, String b) {
        this.age = a;
        this.salary =s;
        this.years = y;
        this.brand = b;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        // if проверка
        return this.age;
    }

    // действия - методы
    public void toSale() {

    }
    public void changeBrand() {

    }
    public void toLie() { // <- сигнатура метода
        System.out.println("Always lie!!!");
    }


}
