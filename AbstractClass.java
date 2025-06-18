abstract class Animal{

    abstract void makeSound();
}

class Cat extends Animal{

    public void makeSound(){
        System.out.println("Cat Meows !!!");
    }
}

class Dog extends Animal{

    public void makeSound(){
        System.out.println("Dog Barks !!!");
    }
}

public class AbstractClass {
    
    public static void main(String[] args) {
        
        Cat c = new Cat();
        Dog d = new Dog();

        c.makeSound();
        d.makeSound();
    }
}
