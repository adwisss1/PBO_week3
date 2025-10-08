package abstrak.latihan;

public class manager extends employ {
    int bonus;
    @Override 
    void calculateBonus(){
        bonus = salary * 10/100;
        System.out.println("bonusnya  " + bonus);
    }
    
}
