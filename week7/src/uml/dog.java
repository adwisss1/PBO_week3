package WEEK7.uml;

public class dog extends animal {
    public String breed;

    public dog (){
    }

    public dog (String name, int age, String breed){
        super(name, age);
        this.breed= breed;
    }
    public void getBreed(){
        System.out.println("breednya adalah " + breed);

    }

    @Override 
    public void makeSound(){
        System.out.println("ninuninu");

    }
    
}
