package abstrak.latihan;

public  class staff extends employ {
    int bonus;
    @Override 
    void calculateBonus(){
        bonus = salary*2/100;
        System.out.println("bonus nya staff adalah " +bonus);

    }
    
}
