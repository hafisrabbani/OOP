/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectBankPrivate;

/**
 *
 * @author Nitro
 */
public class Nasabah {

    private String nama;
    private Tabungan tab;
    private User user;
 
    public Nasabah(String nama, Tabungan tab, User user) {
        this.nama = nama;
        this.tab = tab;
        this.user = user;
    }

    public Nasabah(String nama, Tabungan tab) {
        this.nama = nama;
        this.tab = tab;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Tabungan getTab() {
        return tab;
    }

    public void setTab(Tabungan tab) {
        this.tab = tab;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Nasabah{" + "nama=" + nama + ", tab=" + tab + ", user=" + user + '}';
    }

}
