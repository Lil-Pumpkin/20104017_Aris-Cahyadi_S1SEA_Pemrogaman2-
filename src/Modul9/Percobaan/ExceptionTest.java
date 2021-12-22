package Modul9.Percobaan;

public class ExceptionTest {
    public static void main(String[] args) {
        int a[] = new int[2];
        try {
            System.out.println("Acces element three\t: " + a[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception throw\t\t: " + e);
        }finally {
            a[0] = 6;
            System.out.println("First elemet value\t: " + a[0]);
        }
    }
}
