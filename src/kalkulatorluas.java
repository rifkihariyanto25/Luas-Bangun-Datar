import java.util.Scanner;

public class kalkulatorluas {
    public static void main(String[] args) {
        int pilihan;
        Scanner kalkulatorLuas = new Scanner(System.in);

        System.out.println("Pilih Bangun Datar");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Lingkaran");
        System.out.println("5. Belah Ketupat");
        System.out.println("6. Layang Layang");
        System.out.println("7. Jajar Genjang");
        System.out.println("8. Trapesium");
        System.out.println("9. Keluar Program");

        System.out.print("Masukkan Pilihan (1-9) : ");
        pilihan = kalkulatorLuas.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Persegi");
                System.out.print("Masukkan Sisi Persegi: ");
                double sisiPersegi = kalkulatorLuas.nextDouble();
                double luasPersegi = sisiPersegi * sisiPersegi;
                System.out.println("Luas Persegi: " + luasPersegi);
                break;

            case 2:
                System.out.println("Persegi Panjang");
                System.out.print("Masukkan Panjang Persegi Panjang: ");
                double panjang = kalkulatorLuas.nextDouble();
                System.out.print("Masukkan Lebar Persegi Panjang: ");
                double lebar = kalkulatorLuas.nextDouble();
                double luasPersegiPanjang = panjang * lebar;
                System.out.println("Luas Persegi Panjang: " + luasPersegiPanjang);
                break;

            case 3:
                System.out.println("Segitiga");
                System.out.print("Masukkan Alas Segitiga: ");
                double alasSegitiga = kalkulatorLuas.nextDouble();
                System.out.print("Masukkan Tinggi Segitiga: ");
                double tinggiSegitiga = kalkulatorLuas.nextDouble();
                double luasSegitiga = 0.5 * alasSegitiga * tinggiSegitiga;
                System.out.println("Luas Segitiga: " + luasSegitiga);
                break;

            case 4:
                System.out.println("Lingkaran");
                double phi = 3.14;
                System.out.print("Masukkan Jari-Jari Lingkaran: ");
                double jariLingkaran = kalkulatorLuas.nextDouble();
                double luasLingkaran = phi * jariLingkaran * jariLingkaran;
                System.out.println("Luas Lingkaran: " + luasLingkaran);
                break;

            case 5:
                System.out.println("Belah Ketupat");
                System.out.print("Masukkan Diagonal 1: ");
                double diagonal1BelahKetupat = kalkulatorLuas.nextDouble();
                System.out.print("Masukkan Diagonal 2: ");
                double diagonal2BelahKetupat = kalkulatorLuas.nextDouble();
                double luasBelahKetupat = 0.5 * diagonal1BelahKetupat * diagonal2BelahKetupat;
                System.out.println("Luas Belah Ketupat: " + luasBelahKetupat);
                break;

            case 6:
                System.out.println("Layang-Layang");
                System.out.print("Masukkan Diagonal 1: ");
                double diagonal1Layang = kalkulatorLuas.nextDouble();
                System.out.print("Masukkan Diagonal 2: ");
                double diagonal2Layang = kalkulatorLuas.nextDouble();
                double luasLayang = 0.5 * diagonal1Layang * diagonal2Layang;
                System.out.println("Luas Layang-Layang: " + luasLayang);
                break;

            case 7:
                System.out.println("Jajar Genjang");
                System.out.print("Masukkan Alas Jajar Genjang: ");
                double alasJajarGenjang = kalkulatorLuas.nextDouble();
                System.out.print("Masukkan Tinggi Jajar Genjang: ");
                double tinggiJajarGenjang = kalkulatorLuas.nextDouble();
                double luasJajarGenjang = alasJajarGenjang * tinggiJajarGenjang;
                System.out.println("Luas Jajar Genjang: " + luasJajarGenjang);
                break;

            case 8:
                System.out.println("Trapesium");
                System.out.print("Masukkan Alas 1 Trapesium: ");
                double alas1Trapesium = kalkulatorLuas.nextDouble();
                System.out.print("Masukkan Alas 2 Trapesium: ");
                double alas2Trapesium = kalkulatorLuas.nextDouble();
                System.out.print("Masukkan Tinggi Trapesium: ");
                double tinggiTrapesium = kalkulatorLuas.nextDouble();
                double luasTrapesium = 0.5 * (alas1Trapesium + alas2Trapesium) * tinggiTrapesium;
                System.out.println("Luas Trapesium: " + luasTrapesium);
                break;

            case 9:
                System.out.println("Program selesai.");
                break;

            default:
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                break;
        }

        kalkulatorLuas.close();
    }
}
