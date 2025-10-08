package abstrak.latihan;

public class totalBonus {
    public static void main(String[] args) {
        manager m = new manager();
        m.name = "baiq";
        m.salary = 2000000;
        m.calculateBonus();

        staff s = new staff();
        s.name = "adel";
        s.salary = 1000000;
        s.calculateBonus();
    }
}
