package Diagram1;

public class Dosen extends Civitas implements PesertaKelas, Pengajar {
    private String nip;
    private double gaji;

    public Dosen(String nama, int umur, boolean jenisKelamin, String nip, double gaji) {
        super(nama, umur, jenisKelamin);
        this.nip = nip;
        this.gaji = gaji;
    }

    public void ikutPenelitian() {
        System.out.println(getNama() + " ikut penelitian");
    }

    @Override
    public void masukKelas() {
        System.out.println(getNama() + " masuk kelas");
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

    @Override
    void naikLift() {
        System.out.println(getNama() + " naik lift");
    }
}
