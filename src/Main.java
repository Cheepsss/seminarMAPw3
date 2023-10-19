// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import Domain.Doctor;

public class Main {
    public static void main(String[] args) {
        Doctor d = new Doctor(12,12,"Popescu");
        Doctor d2 = new Doctor(12,12,"Popescu");
        System.out.println(d2.equals(d));
    }
}