package WEEK7.uml;

public class main extends animal{
    public static void main(String[] args) {
        animal animal1 = new animal ("meong", 9);
        animal1.getName();
        animal1.getAge();
        animal1.makeSound();
        animal1.getInfo();

        dog dog1 = new dog ("puppy", 8, "cebol");
        dog1.getName();
        dog1.getAge();
        dog1.getBreed();
        dog1.makeSound();
        dog1.getInfo();
    }
}