package gui;

public class Mahasiswa {
    private String nama;
    private String nim;

    public Mahasiswa() {
    }

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String JenjangPendidikan() {
        char JP = nim.charAt(0);
        if (JP == '1') {
            return "S1(Sarjana)";
        } else if (JP == '2') {
            return "S2(Magister)";
        } else if (JP == '3') {
            return "S3(Doktor)";
        }
        return "Tidak ditemukan";
    }

    public String TahunMasuk() {
        char TM1 = nim.charAt(1);
        char TM2 = nim.charAt(2);
        return "20" + TM1 + TM2;
    }

    public String MenentukanFakultas() {
        char MK = nim.charAt(3);
        if (MK == '1') {
            return "Tarbiyah dan Keguruan";
        } else if (MK == '2') {
            return "Syari'ah dan Hukum";
        } else if (MK == '3') {
            return "Ushuluddin";
        } else if (MK == '4') {
            return "Dakwah dan Komunikasi";
        } else if (MK == '5') {
            return "Sains dan Teknologi";
        } else if (MK == '6') {
            return "Psikologi";
        } else if (MK == '7') {
            return "Ekonomi dan Ilmu Sosial";
        } else if (MK == '8') {
            return "Pertanian dan Peternakan";
        }
        return "Tidak ditemukan";
    }

    public String MenentukanJurusan() {
        char MJ1 = nim.charAt(4);
        char MJ2 = nim.charAt(5);
        if (MJ1 == '0' && MJ2 == '1') {
            return "Teknik Informatika";
        } else if (MJ1 == '0' && MJ2 == '2') {
            return "Teknik Industri";
        } else if (MJ1 == '0' && MJ2 == '3') {
            return "Sistem Informasi";
        } else if (MJ1 == '0' && MJ2 == '4') {
            return "Matematika";
        } else if (MJ1 == '0' && MJ2 == '5') {
            return "Teknik Elektro";
        }
        return "Tidak ditemukan";
    }

    public String JenisKelamin() {
        char JK = nim.charAt(6);
        if (JK == '1') {
            return "Laki-laki";
        } else if (JK == '2') {
            return "Perempuan";
        }
        return "Error";
    }

    public String NomorUrutMahasiswa() {
        char NUM1 = nim.charAt(7);
        char NUM2 = nim.charAt(8);
        char NUM3 = nim.charAt(9);
        char NUM4 = nim.charAt(10);

        return "" + NUM1 + NUM2 + NUM3 + NUM4;
    }
}
