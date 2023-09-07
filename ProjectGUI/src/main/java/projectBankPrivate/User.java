/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectBankPrivate;

/**
 *
 * @author hafis
 */
public class User {
    private String idUser;
    private String password;

    public User(String idUser, String password) {
        this.idUser = idUser;
        this.password = password;
    }

    public String getIdUser() {
        return idUser;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" + "idUser=" + idUser + '}';
    }
    
    
}
