package WEEK7.uml;

public class animal {
    public String name;
    public int age;

    public animal(){
    }

    public animal (String name, int age){
        this.name = name;
        this.age = age;
    }
    public void getName(){
        System.out.println("Nama hewan: " + name);
    }
    public void getAge(){
        System.out.println("age-nya " + age + " tahun");
    }

    public void makeSound(){
        System.out.println ("this animak makes sound");
    }
    public void getInfo(){
        System.out.println("jadi animal ini" + name + "umur" + age + "tahun");
    }

}