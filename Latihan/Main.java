public class Main {
    //psvm
    public static void main(String[] args) {
        //object
        //Mahasiswa mhs1 = new Mahasiswa("Asep", "001", "Teknik Informatika");

        //object tanpa parameter konstraktor
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "Asep";
        mhs1.NIM = "001";
        mhs1.jurusan = "Teknik Informatika";
        
        //mencetak mhs1
        System.out.println("\nmencetak attribute: ");
        System.out.println(mhs1.nama);
        System.out.println(mhs1.NIM);
        System.out.println(mhs1.jurusan + "\n");

        //change name
        System.out.println("changed name: ");
        mhs1.nama = "Joko";
        System.out.println(mhs1.nama + "\n");
        
        //method access
        System.out.println("method access: ");
        mhs1.belajar();;

        //method overloading access
        System.out.println("\nmethod overloading access: ");
        mhs1.belajar("eca");
        
        //function access
        System.out.println("\nfunction access: ");
        System.out.println(mhs1.getNama() + "\n");

        //static method access
        System.out.println("static method access: ");
        Mahasiswa.kuliah();

        //static attribute access
        System.out.println("\nstatic attribute access: ");
        System.out.println(Mahasiswa.angkatan + "\n");
        
        //Mahasiswa mhs2 = new Mahasiswa("Budi", "002", "Teknik Informatika");
        
        //object dengan parameter konstraktor
        System.out.println("object dengan parameter konstraktor");
        Mahasiswa mhs2 = new Mahasiswa(mhs1);
        System.out.println(mhs2.nama);
        System.out.println(mhs2.NIM);
        System.out.println(mhs2.jurusan + "\n");
        // mhs2.nama = "Budi";
        // mhs2.NIM = "002";
        // mhs2.jurusan = "Teknik Informatika";
        
        
        // mhs2.belajar();
        
        // System.out.println(mhs2.getNama() + "\n");
        
    }
}
