/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectBankPrivate;

import javax.swing.JOptionPane;

/**
 *
 * @author Nitro
 */
public class Bank {

    private int jumlahNasabah;
    private Nasabah dataNasabah[];
    private int index;
    private static Bank pcd;

    private Bank() {
        this.jumlahNasabah = 10;
        this.dataNasabah = new Nasabah[this.jumlahNasabah];
        this.index = 0;
    }

    public static Bank getInstance() {
        if (pcd == null) {
            //creating a constructor of the class      
            pcd = new Bank();
        }
        return pcd;
    }

    public int getJumlahNasabah() {
//        return jumlahNasabah;
        return index + 1;
    }

    public Nasabah[] getDataNasabah() {
        return dataNasabah;
    }

    public boolean tambahNasabah(String nama, Tabungan tab, User user) {

//        if (index < dataNasabah.length) {
//            dataNasabah[index] = new Nasabah(nama, tab);
//            index++;
//            return true;
//        } else {
//            return false;
//        }
        return tambahNasabah(new Nasabah(nama, tab, user));

    }

    public Nasabah getNasabah(int index) {
        return dataNasabah[index];
    }

    public Nasabah[] searchNasabah(Nasabah nama) {
        Nasabah temp[] = new Nasabah[5];
        int n = 0;
        for (int i = 0; i < index; i++) {
            if (dataNasabah[i].getNama().contains((CharSequence) nama)) {
                temp[n] = dataNasabah[i];
                n++;
            }
        }
        return temp;
    }

    public Nasabah searchNasabah(User user) {
        for (int i = 0; i < index; i++) {
            if ((dataNasabah[i].getUser().getIdUser().equalsIgnoreCase(user.getIdUser()))
                    && (dataNasabah[i].getUser().getPassword().equalsIgnoreCase(user.getPassword()))) {
                JOptionPane.showMessageDialog(null, getNasabah(i));
                return getNasabah(i);
            }
        }
        JOptionPane.showMessageDialog(null, "Tidak Ditemukan");
        return null;
    }
    
    public int searchIndexNasabah(User user) {
        for (int i = 0; i < index; i++) {
            if ((dataNasabah[i].getUser().getIdUser().equalsIgnoreCase(user.getIdUser()))
                    && (dataNasabah[i].getUser().getPassword().equalsIgnoreCase(user.getPassword()))) {
                JOptionPane.showMessageDialog(null, getNasabah(i));
                return i;
            }
        }
        JOptionPane.showMessageDialog(null, "Tidak Ditemukan");
        return -1;
    }

    public boolean tambahNasabah(Nasabah nas) {
        if (index < dataNasabah.length) {
            dataNasabah[index] = nas;
            index++;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
//        return "Bank{" + "jumlahNasabah=" + (index ) + ", dataNasabah=" + dataNasabah + '}';
        String str = "jumlah nasabah : " + index + "\n";
        for (int i = 0; i < index; i++) {
            str = str + dataNasabah[i];
        }

        return str;

    }

}
