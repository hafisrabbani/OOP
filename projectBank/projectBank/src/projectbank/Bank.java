/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbank;

/**
 *
 * @author Nitro
 */
public class Bank {

    private int jumlahNasabah;
    private Nasabah dataNasabah[];
    private int index;

    public Bank() {
        this.jumlahNasabah = 10;
        this.dataNasabah = new Nasabah[this.jumlahNasabah];
        this.index = 0;
    }

    public int getJumlahNasabah() {
//        return jumlahNasabah;
        return index + 1;
    }

    public Nasabah[] getDataNasabah() {
        return dataNasabah;
    }

    public boolean tambahNasabah(String nama, Tabungan tab) {

//        if (index < dataNasabah.length) {
//            dataNasabah[index] = new Nasabah(nama, tab);
//            index++;
//            return true;
//        } else {
//            return false;
//        }
        return tambahNasabah(new Nasabah(nama, tab));

    }
    
    public Nasabah getNasabah(int index){
        return dataNasabah[index];
    }
    
    public Nasabah[] searchNasabah(String nama){
        Nasabah temp[] = new Nasabah[5];
        int n = 0;
        for(int i = 0 ; i < index; i++){
            if(dataNasabah[i].getNama().contains(nama)){
                temp[n] = dataNasabah[i];
                n++;
            }
        }
        return temp;
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
