package Modul9.Percobaan;

public class Percobaan2 {
    public static void main(String[] args) {
        int bil = 10;
        try {
            System.out.println(bil / 0);
        }catch (Throwable e){ //ArithmeticException
            //System.out.println("Tidak boleh membagi bilanga dengan 0");
            System.out.println(e);
        }
    }
}
