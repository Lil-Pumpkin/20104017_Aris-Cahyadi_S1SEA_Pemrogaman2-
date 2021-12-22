# 20104017_Aris-Cahyadi_S1SEA_Pemrogaman2-

Mata kuliah Pemrogaman 2
lanjutan dari repository sebelumnya dikarenakan terddapat kesalahan teknis
<hr>

## DASAR TEORI

  Exception adalah suatu kondisi abnormal yang terjadi pada saat menjalankan program. Karena dalam java segala sesuatu merupakan objek, maka exception juga direpresentasikan dalam sebuah objek yang menjelaskan tentang exception tersebut. 
  
  Contoh exception adalah pembagian bilangan dengan 0, pengisian elemen array diluar ukuran array, kegagalan koneksi database, file yang akan dibuka tidak ada, dan mengakses objek yang belum diinisialisasi. Terdapat dua penanganan exception yaitu: 
  
  • Menangani sendiri exception tersebut. 
  • Meneruskannya ke luar dengan cara membuat objek tentang exception tersebut dan melemparkannya (throw) keluar agar ditangani oleh kode yang memanggil method(method yang didalamnya terdapat exception) tersebut. 
  
  Ada lima keyword yang digunakan oleh Java untuk menangani exception yaitu try, catch, finally, throw dan throws.

**Tipe-Tipe Exception**

  Pada exception, superclass tertinggi adalah class Throwable, tetapi hampir tidak pernah menggunakan class ini secara langsung. Dibawah class Throwable terdapat dua subclass yaitu class Error dan class Exception. 
  
  Class Error merupakan tipe exception yang tidak ditangani dengan blok try-catch, karena berhubungan dengan Java run-time system/environment. Untuk exception dengan tipe class Exception, merupakan exception 154 yang dapat ditangani oleh program. Terdapat subclass dari class Exception diantaranya RunTimeException, IOException, AWTException dan lain-lain.
  
  Semua exception bertipe RunTimeException dan turunannya tidak harus secara eksplisit ditangani dalam program (Unchecked Exception). Contoh subclass dari RunTimeException adalah ArrayIndexOutOfBoundsException, ArithmeticException, NullPointerException dan lain-lain.

<hr>

## Praktikum

[jawaban ](https://github.com/Lil-Pumpkin/20104017_Aris-Cahyadi_S1SEA_Pemrogaman2-/tree/modul9/src/Modul9/Latihan)

[Latihan 1](https://github.com/Lil-Pumpkin/20104017_Aris-Cahyadi_S1SEA_Pemrogaman2-/tree/modul9/src/Modul9/Latihan/L1)

  Pada latihan 1 menggunakan tipe exception FileNotFoundException yang menggunakan exception throws
  
  ```java
  import java.io.FileNotFoundException;

public class percobaan7 {
    public static void method1() throws FileNotFoundException{
        throw new FileNotFoundException("File Tidak Ada");
    }

    public static void main(String[] args) {
        try {
            method1();
        } catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }
}
```

  Pada program diatas dijalankan, main akan mengeksekusi code exception try yang mana yaitu percobaan didalamnya adalah method method1(), Pada method1 terhadapat penggunaan exception throws untuk menangai terjadinya kesalahan pada file "FileNotFoundException".
  
  Setelah proggram tersebut selesai dijalankan, maka progam tersebut akan di tamngkap/catch oleh program selanjutnya yang menggunakan "FileNotFoundException" juga sebagai tipe exceptionnya, Kemudian program akan menampilkan hasil pada throw dengan melakukan pemanggilan getMassage dari throw
  
[Latihan 2](https://github.com/Lil-Pumpkin/20104017_Aris-Cahyadi_S1SEA_Pemrogaman2-/tree/modul9/src/Modul9/Latihan/L2)
Pada Latihan2 kita menggunakan exception try-catch, yang berfungsi sebagai pemeriksa apakah progam tersebut terdapat error program yang berbentuk tipe angka atau data.

```java
package Modul9.latihan.Latihan2;

import java.util.Scanner;

public class percobaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Masukan Angka\t: ");
            int num = sc.nextInt();
            if (num>10) throw new Exception();
            System.out.println("Angka kurang dari atau sama dengan 10");
        } catch (Exception s){
            System.out.println("Angka lebih dari 10");
            System.out.println("Selesai");
        }
    }
}
```

ketika program tersebut dijalankan maka akan mengalami proses sebagai berikut
  Pada percobaan diatas method *try* akan meminta masukan dari user berupa angka. Kemudian program akan melakukan seleksi *if* yang mempunyai nilai lebih dari 10, jika kriteria tersebut sesuai maka hasilnya akan dilempar dan akan melakukan Exception. jika tidak memenuhi syarat dari apa yang dibutuhkan maka program akan mencetak output "Angka kurang dari atau sama dengan 10".
  
  Jika masukan dari user lebih dari 10 maka akan ditangkap "catch" berdasarkan exception atau syarat yang sudah ditentukan. Kemudian akan mencetak *Angka lebih dari 10* dan *Selesai*
  
  jika inputan kurang dari 10
```java
  Masukan Angka	: 1
  Angka kurang dari atau sama dengan 10
```

  jika inputan yang dimasukan lebih dari 10
```java
  Masukan Angka	: 11
  Angka lebih dari 10
  
Selesai
```

[Latiihan 3](https://github.com/Lil-Pumpkin/20104017_Aris-Cahyadi_S1SEA_Pemrogaman2-/tree/modul9/src/Modul9/Latihan/L3)

```java
import javax.swing.*;

class ExceptionA extends Exception {}
class ExceptionB extends ExceptionA {}
class ExceptionC extends ExceptionB {}
    
public class Demo {
    public static void main( String args[] ){
        try {
            throw new ExceptionC();
        } catch( ExceptionA a ) {
            JOptionPane.showMessageDialog( null, a.toString(), "Exception", JOptionPane.INFORMATION_MESSAGE ); 
        } try {
            throw new ExceptionB(); 
        } catch( ExceptionA b ) {
            JOptionPane.showMessageDialog(null, b.toString(), "Exception", JOptionPane.INFORMATION_MESSAGE );
        }
    System.exit( 0 );
    }
}
```

  Program akan menjalankan syntax exception try, yang berisikan statement throw new ExceptionC(); yaitu melakukan throw pada class yang telah dideklarasikan berdasarkan ExceptionC. Kemudian pada catch menampilkan hasil menggunakan JOptionPane dengan isi berdasarkan *INFORMATION.MASSAGE.*
  
  kemudian di langkah selanutnya program *try* yang berisikan syntax yang mempunyai statement throw new ExceptionB(); Program akan melakukan throw pada class yang telah dideklarasikan, Pada catch akan menampilkan penanganan errornya yaitu akan mencetak berdasarkan **JOptionPane** dengan isi berdasarkan *INFORMATION.MASSAGE.*
  
  try pertama, throw ExceptionC
```java
Exception
Modul9.latihan.Latihan3.ExceptionC
```

  try kedua, throw ExceptionB
```java
Exception
Modul9.latihan.Latihan3.ExceptionB
```

<hr>

## Kesimpulan
  Pada modul 9 mempelajari mengenai exception handling yaitu penanganan ketika terjadi masalah atau error code. Pengunaan exception digunakan pada error code nya dan penanganan yang sesuai jika terjadi error. 
  
  Exception sendiri terdapat beberapa tipe atau jenis dan salah satunya adalah Checked Exception dan Unchecked Exception,Kemudian mempelajari penggunaan try, catch, finally, throw dan throws serta contoh penggunaanya, antara lain catch, finally, throw dan throws yang dimana mempunyai fungsinya masing-masing
  • Try-catch dilakukan bersamaan dan try berisikan syntax yang mungkin akan terjadi error atau yang menyebabkan exception.
  • Catch berisikan penanganan error dari program try.
  • Throw dan throws, yaitu melempar program yang kemungkinan akan terjadi error dan kemudian nantinya akan dilakukan pemanggilannya denga menambahkan exception solusinya.
  • Finally digunakan untuk mencetak dari program yang dijalankan atau akhir dari peogram yang dijalakan walau hasilnya normal atau berdasarkan exception yang telah dijalankan.
