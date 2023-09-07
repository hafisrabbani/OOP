
import projectbank.Tabungan;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Nitro
 */
public class Main {

    public static void main(String[] args) {
        Tabungan syahrul = new Tabungan(500);
        System.out.println("Saldo Syahrul = $ " + syahrul.getSaldo());
        syahrul.depositMoney(200);
        System.out.println("Saldo Syahrul = $ " + syahrul.getSaldo());

        syahrul.getMoney(100);
        System.out.println("Saldo Syahrul = $ " + syahrul.getSaldo());

        syahrul.getMoney(1000);
        System.out.println("Saldo Syahrul = $ " + syahrul.getSaldo());

        Tabungan budi = new Tabungan(1000);
        System.out.println("Saldo Budi = $ " + budi.getSaldo());

        System.out.println("Budi Transfer ke Syahrul");
        budi.transferMoney(syahrul, 300);

        System.out.println("Saldo Syahrul = $ " + syahrul.getSaldo());
        System.out.println("Saldo Budi = $ " + budi.getSaldo());

    }
}
