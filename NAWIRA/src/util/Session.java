package util;

import java.util.ArrayList;
import java.util.List;

public class Session {
    public static int idPenonton;
    public static String namaPenonton;
    public static String noHp;

    // =====================
    // FILM YANG DIPILIH
    // =====================
    public static int idFilm;
    public static String judulFilm;

    // =====================
    // JADWAL YANG DIPILIH
    // =====================
    public static int idJadwal;
    public static String tanggal;
    public static String jam;

    // =====================
    // STUDIO
    // =====================
    public static int jumlahTiket;
    public static int idStudio;
    public static String namaStudio;

    // =====================
    // KURSI
    // =====================
    public static int jumlahKursi;
    // contoh: "A1,A2,A3"
    

    // =====================
    // TRANSAKSI
    // =====================
    public static int idTransaksi;
    public static int totalHarga;
    
    public static List<Integer> kursiDipilih = new ArrayList<>();
}
