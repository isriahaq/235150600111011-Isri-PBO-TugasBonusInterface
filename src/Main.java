package Diagram1;

public class Main {
    public static void main(String[] args) {
        Dosen dosen = new Dosen("Mr. Alex", 34, true, "123456", 15000000);
        Mahasiswa mahasiswa = new Mahasiswa("Yuven", 19, true, "235150", 4.0, 8);
        Asprak asprak = new Asprak("Isri", 20, true, "224234", 3.9, 3);
        Resepsionis resepsionis = new Resepsionis("Davis", 28, true, 654321, "Front Desk", 5000000);

        Civitas dosenCivitas = dosen;
        Civitas mahasiswaCivitas = mahasiswa;
        Civitas asprakCivitas = asprak;
        Civitas resepsionisCivitas = resepsionis;

        dosen.mengajar("Pemrograman berorientasi objek");
        dosen.mengasihTugas();
        dosen.menilaiTugas();
        dosen.naikLift();
        dosen.masukKelas();
        dosen.ikutPenelitian();
        System.out.println();

        mahasiswa.ngerjainTugas();
        mahasiswa.pasrah();
        mahasiswa.mengikutiOrganisasi("BEM");
        mahasiswa.presentasi();
        mahasiswa.naikLift();
        mahasiswa.masukKelas();
        System.out.println();

        asprak.mengajar("Pemrograman dasar");
        asprak.mengasihTugas();
        asprak.menilaiTugas();
        asprak.ngasihKomenDiGCR();
        asprak.naikLift();
        asprak.masukKelas();
        System.out.println();

        resepsionis.melayani();
        resepsionis.melapor();
        resepsionis.naikLift();
        System.out.println();

        // Upcasting method
        dosenCivitas.makanDiKantin("Kantin A");
        mahasiswaCivitas.mainGameCorner();
        asprakCivitas.makanDiKantin("Kantin B");
        resepsionisCivitas.mainGameCorner();
    }
}
