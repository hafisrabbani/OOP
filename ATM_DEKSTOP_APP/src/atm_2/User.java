/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm_2;

/**
 *
 * @author hafis
 */
public class User {
    private String norek;
    private String pin;
    private String nama;
    private int id;

    public User(String norek, String pin, String nama, int id){
        this.norek = norek;
        this.pin = pin;
        this.nama = nama;
        this.id = id;
    }

    public String getNorek(){
        return norek;
    }

    public String getPin(){
        return pin;
    }

    public String getNama(){
        return nama;
    }

    public int getId(){
        return id;
    }
}
