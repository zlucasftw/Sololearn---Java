package polymorphism;

public class Program {
    public static void main(String[] args) {
        Animal a = new Dog();
        Animal b = new Cat();

        a.makeSound();
        b.makeSound();
    }
}
