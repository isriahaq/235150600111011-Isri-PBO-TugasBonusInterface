package Diagram1;

public class Asprak extends Mahasiswa implements Pengajar {
    public Asprak(String nama, int umur, boolean jenisKelamin, String nim, double ipk, int golUkt) {
        super(nama, umur, jenisKelamin, nim, ipk, golUkt);
    }

    public void ngasihKomenDiGCR() {
        System.out.println(getNama() + " ngasih komen di GCR");
    }

    @Override
    public void mengajar(String matkul) {
        System.out.println(getNama() + " mengajar matkul " + matkul);
    }

    @Override
    public void mengasihTugas() {
        System.out.println(getNama() + " mengasih tugas");
    }

    @Override
    public void menilaiTugas() {
        System.out.println(getNama() + " menilai tugas");
    }
}
