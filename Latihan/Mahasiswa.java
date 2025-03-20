//
//  Florence Rgis Lake
//  105223006
//  Latihan
//

public class Mahasiswa {            //membuat class

    //atribut
    String nama;                    
    String NIM;
    String jurusan;
    boolean isLulus =  false;

    //atribut static
    static int angkatan = 2023;

    //konstruktor (namanya harus sama dengan nama class)
    Mahasiswa(String nama, String NIM, String jurusan) {
        System.out.println("ini adalah constructor");
        this.nama = nama;
        this.NIM = NIM;
        this.jurusan = jurusan;
    }

    //constructor overloading (constructor dengan parameter berbeda)
    //default constructor
    Mahasiswa() {
        this("nama default", "NIM default", "jurusan default");
        System.out.println("ini adalah constructor");
    }
    
    //constructor overloading (constructor dengan parameter berbeda)
    //constructor
    Mahasiswa(Mahasiswa m) {
        System.out.println("ini adalah constructor");
        this.nama = m.nama;
        this.NIM = m.NIM;
        this.jurusan = m.jurusan;
    }

    //method no return & no parameter
    void belajar() {
        System.out.println(nama + " sedang belajar");
    }

    //method overloading (method dengan nama sama tapi parameter berbeda)
    void belajar(String nama) {
        System.out.println(nama + " sedang belajar ");
        System.out.println(this.nama + " sedang belajar ");
    }

    //fungsi no return
    String getNama() {
        return nama;
    }

    //static method
    static void kuliah(){
        System.out.println("ini adalah static method");
    }

    //class inside class
    class innerClass {
        void show() {
            System.out.println("ini adalah inner class");
        }
    }
}
