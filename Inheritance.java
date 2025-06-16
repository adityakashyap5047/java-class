    class Animal{
        String name;
        Animal(String name){
            this.name = name;
        }

        public String getName(){
            return this.name;
        }
    }

    class Dog extends Animal{
        Dog(String name){
            super(name);
        }

        public void makeSound(){
            System.out.println(this.name + " Barks!!!");
        }
    }

public class Inheritance{

    public static void main(String[] args) {
        Dog d = new Dog("Tommy");
        System.out.println("The name of dog is: " + d.getName());
        d.makeSound();
    }
}