package Universitas;

import java.util.ArrayList;

public class ManajemenMahasiswa {
    private ArrayList<Mahasiswa> daftar = new ArrayList<>();

    public void tambah(Mahasiswa m) {
        daftar.add(m);
        System.out.println("Mahasiswa berhasil ditambahkan.");
    }

    public void tampilkanSemua() {
        if (daftar.isEmpty()) {
            System.out.println("Belum ada data.");
        } else {
            for (Mahasiswa m : daftar) {
                m.tampilkanData();
            }
        }
    }

    public void tampilkanIPKTertinggi() {
        if (daftar.isEmpty()) {
            System.out.println("Belum ada data.");
            return;
        }

        Mahasiswa tertinggi = daftar.get(0);
        for (Mahasiswa m : daftar) {
            if (m.getIpk() > tertinggi.getIpk()) {
                tertinggi = m;
            }
        }
        System.out.println("Mahasiswa dengan IPK tertinggi:");
        tertinggi.tampilkanData();
    }
}
