public class Latihan1person {
    public static void main(String[] args) {

    Person a = new Person ();
    a.Nama = "Anton";
    a.JenisKelamin = "Laki Laki";
    a.Umur= 15;
    System.out.println ("Nama : " + a.Nama );
    System.out.println ("Jenis Kelamin : " + a.JenisKelamin);
    System.out.println ("Umur : " + a.Umur);

    System.out.println("     ");
    
    Person b= new Person ();
    b.Nama = "Riko";
    b.JenisKelamin = "Laki Laki";
    b.Umur = 13;
    System.out.println ("Nama : " + b.Nama );
    System.out.println ("Jenis Kelamin : " + b.JenisKelamin);
    System.out.println ("Umur : " + b.Umur);
    }
}
