# Latihan-Tugas

<p><b> Nama    :   Afra Nesya Apriyanthi </p>
<p><b> NIM     :   312110614 </p>
<p><b> Kelas   :   TI.21.C1 </p>
<p><b> Mata Kuliah : Pemrograman Orientasi Objek</p>
<p><b> Tugas Pertemuan 4 </p>


<p> Berikut soal dari latihan 1 <p>

![gambar 1](screenshot/gambar1.png)

berikut script javanya
Person.java

```java
public class Person {
    String Nama;
    String JenisKelamin;
    int Umur;
}
```

selanjutnya membuat java baru dengan nama Latihan1person.java

```java
public class Latihan1person {
    public static void main(String[] args) {

    Person a = new Person (); //Membuat objek pertama
    a.Nama = "Anton";        //Memanggil atribut dan memberi nilai
    a.JenisKelamin = "Laki Laki";
    a.Umur= 15;
    System.out.println ("Nama : " + a.Nama );
    System.out.println ("Jenis Kelamin : " + a.JenisKelamin);
    System.out.println ("Umur : " + a.Umur);

    System.out.println("     ");
    
    Person b= new Person (); //Membuat objek kedua
    b.Nama = "Riko";  //Memanggil atribut dan memberi nilai
    b.JenisKelamin = "Laki Laki";
    b.Umur = 13;
    System.out.println ("Nama : " + b.Nama );
    System.out.println ("Jenis Kelamin : " + b.JenisKelamin);
    System.out.println ("Umur : " + b.Umur);
    }
}
```

<p> Maka hasil outputnya adalah<p>

![gambar 2](screenshot/gambar2.PNG)