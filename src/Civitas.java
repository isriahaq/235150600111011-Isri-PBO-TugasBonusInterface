package Diagram1;

public abstract class Civitas {
    private String nama;
    private int umur;
    private boolean jenisKelamin;

    public Civitas(String nama, int umur, boolean jenisKelamin) {
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
    }

    public void makanDiKantin(String kantin) {
        System.out.println(nama + " makan di kantin " + kantin);
    }

    public void mainGameCorner() {
        System.out.println(nama + " bermain di game corner");
    }

    abstract void naikLift();

    public String getNama() {
        return nama;
    }
}
