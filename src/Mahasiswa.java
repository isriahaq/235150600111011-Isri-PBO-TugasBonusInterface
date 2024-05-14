package Diagram1;

public class Mahasiswa extends Civitas implements PesertaKelas {
    private String nim;
    private double ipk;
    private int golUkt;

    public Mahasiswa(String nama, int umur, boolean jenisKelamin, String nim, double ipk, int golUkt) {
        super(nama, umur, jenisKelamin);
        this.nim = nim;
        this.ipk = ipk;
        this.golUkt = golUkt;
    }

    public void ngerjainTugas() {
        System.out.println(getNama() + " ngerjain tugas");
    }

    public void pasrah() {
        System.out.println(getNama() + " pasrah");
    }

    public void mengikutiOrganisasi(String namaOrganisasi) {
        System.out.println(getNama() + " mengikuti organisasi " + namaOrganisasi);
    }

    public void presentasi() {
        System.out.println(getNama() + " presentasi");
    }

    @Override
    public void masukKelas() {
        System.out.println(getNama() + " masuk kelas");
    }

    @Override
    void naikLift() {
        System.out.println(getNama() + " naik lift");
    }
}
