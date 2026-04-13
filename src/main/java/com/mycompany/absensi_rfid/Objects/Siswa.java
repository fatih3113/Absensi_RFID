/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.absensi_rfid.Objects;

/**
 *
 * @author ACER
 */

public class Siswa {
    
    private String uidRFID;
    private String idSiswa;
    private String nama;

    public Siswa() {
        
    }

    public Siswa(String uidRFID, String idSiswa, String nama) {
        this.uidRFID = uidRFID;
        this.idSiswa = idSiswa;
        this.nama = nama;
    }

    public String getUidRFID() {
        return uidRFID;
    }

    public void setUidRFID(String uidRFID) {
        this.uidRFID = uidRFID;
    }

    public String getIdSiswa() {
        return idSiswa;
    }

    public void setIdSiswa(String idSiswa) {
        this.idSiswa = idSiswa;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "Siswa{" +
                "uidRFID=" + uidRFID +
                ", idSiswa=" + idSiswa +
                ", nama=" + nama + '}';
    }

}
