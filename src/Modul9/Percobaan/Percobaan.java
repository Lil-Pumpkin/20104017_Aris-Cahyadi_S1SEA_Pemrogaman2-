package Modul9.Percobaan;

public class Percobaan {
    public static void main(String[] args) {
        int a[] = new int[5]; //Deklarasi array dg indeks 5,
        try{
            a[5] = 100; // deklarasi indeks ke-5
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Indeks array melebihi batas");
            // error karena array dgn isi 5 indeks = 0, 1, 2, 3, 4
            // dan indeks 5 diluar batas indeks deklarasi
        }
    }
}
