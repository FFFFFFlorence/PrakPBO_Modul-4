// Nama: Florence Regis Lake
// NIM: 105223006
// POST TEST MODUL 4
public class CarRent {
    private String noPlat;
    private String merk;
    private double hargaSewaPerHari;
    private boolean kesediaanSewa = true;

    public CarRent(String noPlat, String merk, double hargaSewaPerHari, boolean kesediaanSewa) {
        this.noPlat = noPlat;
        this.merk = merk;
        this.hargaSewaPerHari = hargaSewaPerHari;
        this.kesediaanSewa = kesediaanSewa;
    }

    public CarRent() {
        this("B 0000 AAA", "Toyota Avanza", 250000, true);
    }

    public void info() {
        System.out.println("No Plat\t\t    : " + noPlat);
        System.out.println("Merk\t\t    : " + merk);
        System.out.println("Harga Sewa Per Hari : " + utility.mataUang(hargaSewaPerHari));
        System.out.println("Kesediaan Sewa\t    : " + kesediaanSewa);
    }

    void infoSewa() {
        if (kesediaanSewa == true) {
            System.out.println("Mobil dengan no plat " + noPlat + " telah disewa");
            kesediaanSewa = false;
        } else {
            System.out.println("Mobil dengan no plat " + noPlat + " tidak tersedia");
        }
    }

    public class pelanggan {
        private String namaPenyewa;
        private String noKTP_Penyewa;
        private String noHP_Penyewa;
    
        public pelanggan(String namaPenyewa, String noKTP_Penyewa, String noHP_Penyewa) {
            this.namaPenyewa = namaPenyewa;
            this.noKTP_Penyewa = noKTP_Penyewa;
            this.noHP_Penyewa = noHP_Penyewa;
        }

        public void dataPelanggan() {
            System.out.println("Nama Penyewa\t: " + namaPenyewa);
            System.out.println("No KTP Penyewa\t: " + noKTP_Penyewa);
            System.out.println("No HP Penyewa\t: " + noHP_Penyewa);
        }
    }

    public class Sewa {
        private pelanggan penyewa;
        private CarRent mobil;
        private int lamaSewa;
        private double totalBiaya;
        private boolean statusSewa = false;

        public Sewa(pelanggan penyewa, CarRent mobil, int lamaSewa) {
            this.penyewa = penyewa;
            this.mobil = mobil;
            this.lamaSewa = lamaSewa;
            penyewaan();
        }    
        
        private void penyewaan() {
            if (mobil.kesediaanSewa) {
                System.out.println("\n================= CAR's Sewa =================");
                mobil.infoSewa();
                totalBiaya = (lamaSewa * mobil.hargaSewaPerHari) - utility.diskon(lamaSewa, mobil.hargaSewaPerHari);
                statusSewa = true;
                mobil.kesediaanSewa = false;
            } else {
                System.out.println("\n================= CAR's Sewa =================");
                mobil.infoSewa();
                statusSewa = false;
            }
        }
        
        public void dataSewa() {
            System.out.println("==============================================");
            penyewa.dataPelanggan();
            System.out.println("Lama Sewa\t: " + lamaSewa + " hari");
            System.out.println("Total Biaya\t: " + utility.mataUang(totalBiaya));
            System.out.println("Status Sewa\t: " + statusSewa);
            System.out.println("==============================================");
        }
    }

    public class utility {
        public static double diskon(int lamaSewa , double hargaSewaPerHari) {
            if (lamaSewa > 5) {
                return (hargaSewaPerHari * lamaSewa) * 0.1;
            } else {
                return 0;
            }
        }

        public static String mataUang (double harga) {
            return "Rp" + (int)harga;
        }
    }
}

