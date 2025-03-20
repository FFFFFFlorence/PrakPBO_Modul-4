public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("ecaa", "001", "Antropologi", 3.75);
        Mahasiswa mahasiswa2 = new Mahasiswa("Florence", "006", "Ilmu Komputer", 3.5);
        Mahasiswa mahasiswa3 = new Mahasiswa("Rian", "029", "Teknik Sipil", 2.8);

        mahasiswa1.tampilkanInfo();
        System.out.println("Lulus: " + mahasiswa1.cekLulus());

        System.out.println();

        mahasiswa2.tampilkanInfo();
        System.out.println("Lulus: " + mahasiswa2.cekLulus());
        
        mahasiswa3.tampilkanInfo();
        System.out.println("Lulus: " + mahasiswa3.cekLulus());
        System.out.println("\n");
    }
}
