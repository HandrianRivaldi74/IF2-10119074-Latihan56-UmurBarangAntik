/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if2.pkg10119074.latihan56.umurbarangantik;

/**
 *
 * @author Acer
 * Nama  : HANDRIAN RIVALDI
 * Kelas : PBOIF2
 * NIM   : 10119074
 * Deskrifsi :
 */
public class IF210119074Latihan56UmurBarangAntik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Radio objRadio = new Radio(234);
        objRadio.setName("Radio AM");

        System.out.println("Nama Barang Antik : "+objRadio.getName());
        objRadio.tampilUmur();
    }
    
}
