/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.absensi_rfid;

import com.mycompany.absensi_rfid.Objects.Siswa;

public class MainApp {
    
    public static void main(String[] args) {
        Siswa s = new Siswa();
        s.setUidRFID("12345678");
        s.setIdSiswa("321");
        s.setNama("Galuh"); 
 
        System.err.println(s.toString());
    }
}