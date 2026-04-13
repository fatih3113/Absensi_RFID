/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.absensi_rfid.Objects;

/**
 *
 * @author ACER
 */

import java.time.LocalDateTime;

public class LogAbsensi {
    
    private String idLog;
    private String uidRFID;
    private LocalDateTime waktuTap;
    private String status;

    public LogAbsensi() {
        
    }

    public LogAbsensi(String idLog, String uidRFID, LocalDateTime waktuTap, String status) {
        this.idLog = idLog;
        this.uidRFID = uidRFID;
        this.waktuTap = waktuTap;
        this.status = status;
    }

    public String getIdLog() {
        return idLog;
    }

    public void setIdLog(String idLog) {
        this.idLog = idLog;
    }

    public String getUidRFID() {
        return uidRFID;
    }

    public void setUidRFID(String uidRFID) {
        this.uidRFID = uidRFID;
    }

    public LocalDateTime getWaktuTap() {
        return waktuTap;
    }

    public void setWaktuTap(LocalDateTime waktuTap) {
        this.waktuTap = waktuTap;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "LogAbsensi{" +
                "idLog=" + idLog +
                ", uidRFID=" + uidRFID +
                ", waktuTap=" + waktuTap +
                ", status=" + status + '}';
    }
}
