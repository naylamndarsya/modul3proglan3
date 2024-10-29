package tugas3;

public class TiketPesawat extends Pemesanan implements tugas3.Tiket {
    private String nama;
    private String asal;
    private String tujuan;
    private double Tiket;
    private double diskon;

    public TiketPesawat(String nama, String asal, String tujuan, double hargaTiket, info info) {
        this.nama = this.nama;
        this.asal = asal;
        this.tujuan = tujuan;
        this.Tiket = hargaTiket;
        this.diskon = info.diskon();
    }

    public double hitungBiayaTiket() {
        return Tiket - (Tiket * (diskon / 100));
    }

    public double hitungDiskon() {
        return Tiket * (diskon / 100);
    }

    public void tampilkanInformasi() {
        System.out.println("Nama Penumpang: " + nama);
        System.out.println("Asal: " + asal);
        System.out.println("Tujuan: " + tujuan);
        System.out.println("Harga Tiket: " + Tiket);
        System.out.println("Diskon: " + diskon + "%");
        System.out.println("Biaya Tiket Setelah Diskon: " + hitungBiayaTiket());
        System.out.println("Jumlah Diskon: " + hitungDiskon());
    }
}