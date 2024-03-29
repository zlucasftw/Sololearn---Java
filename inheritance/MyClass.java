package inheritance;

class Animal {
    protected int legs;
    public void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    Dog() {
        legs = 4;
    }
}

public class MyClass {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
    }
}
