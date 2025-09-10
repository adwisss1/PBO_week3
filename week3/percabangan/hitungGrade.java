package percabangan;

public class hitungGrade {
    private int nilai;
    public hitungGrade (int nilai){
        this.nilai = nilai;
    }

    public void hitung(){
        if (nilai >=60) {
            if (nilai >= 90) {
                System.out.println("Grade: A");
            } else if (nilai >= 80) {
                System.out.println("Grade: B");
            } else if (nilai >= 70) {
                System.out.println("Grade: C");
            } else if (nilai >= 60) {
                System.out.println("Grade: D");
            } else {
                System.out.println("Grade: E");
            }
        } else {
            System.out.println("tudak lulus");
        }
    }
}
