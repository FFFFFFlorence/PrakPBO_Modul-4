// Nama: Florence Regis Lake
// NIM: 105223006
// POST TEST MODUL 4
public class Main {
    public static void main(String[] args) {
        CarRent car0 = new CarRent("B 2189 ZFB", "Honda Brio", 150000, true); 
        CarRent car1 = new CarRent("B 1753 AGH", "Toyota Avanza", 230000, false);
        CarRent car2 = new CarRent("B 8675 CTR", "Honda Jazz", 250000, true);
        CarRent car3 = new CarRent("B 4212 ETS", "Suzuki Ertiga", 360000, true);
        CarRent car4 = new CarRent("B 2353 FNG", "Daihatsu Xenia", 350000, true);
        CarRent car5 = new CarRent("B 6453 SRT", "Mitsubishi Xpander", 480000, true);
        CarRent car6 = new CarRent("B 6734 TKU", "Toyota Kijang", 450000, true);
        CarRent car7 = new CarRent("B 5473 HRT", "Honda CR-V", 570000, true);
        CarRent car8 = new CarRent("B 6536 TGE", "Suzuki Jimny", 590000, true);
        CarRent car9 = new CarRent("B 8584 VSD", "Daihatsu Terios", 680000, true);
        
        System.out.println("\n========= WELCOME TO CAR's CAR =========");
        System.out.println("\n====== Daftar Mobil yang Tersedia ======");
        car0.info();
        System.out.println("========================================");
        car1.info();
        System.out.println("========================================");
        car2.info();
        System.out.println("========================================");
        car3.info();
        System.out.println("========================================");
        car4.info();
        System.out.println("========================================");
        car5.info();
        System.out.println("========================================");
        car6.info();
        System.out.println("========================================");
        car7.info();
        System.out.println("========================================");
        car8.info();
        System.out.println("========================================");
        car9.info();
        System.out.println("========================================");
        
        CarRent.pelanggan pelanggan1 = car0.new pelanggan("Asep", "1234567890", "081234567890");
        CarRent.pelanggan pelanggan2 = car1.new pelanggan("Budi", "0987654321", "089876543210");
        CarRent.pelanggan pelanggan3 = car2.new pelanggan("Caca", "0987123456", "089871234560");
        CarRent.pelanggan pelanggan4 = car3.new pelanggan("Dedi", "0987123456", "089871234560");
        CarRent.pelanggan pelanggan5 = car4.new pelanggan("Eca", "0987123456", "089871234560");
        CarRent.pelanggan pelanggan6 = car5.new pelanggan("Fafa", "0987123456", "089871234560");

        CarRent.Sewa sewa1 = car0.new Sewa(pelanggan1, car5, 8);
        sewa1.dataSewa();
        CarRent.Sewa sewa2 = car1.new Sewa(pelanggan2, car1, 7);
        sewa2.dataSewa();
        CarRent.Sewa sewa3 = car2.new Sewa(pelanggan3, car7, 5);
        sewa3.dataSewa();
        CarRent.Sewa sewa4 = car3.new Sewa(pelanggan4, car3, 9);
        sewa4.dataSewa();
        CarRent.Sewa sewa5 = car4.new Sewa(pelanggan5, car4, 6);
        sewa5.dataSewa();
        CarRent.Sewa sewa6 = car5.new Sewa(pelanggan6, car5, 8);
        sewa6.dataSewa();
        System.out.println();
    }
}
