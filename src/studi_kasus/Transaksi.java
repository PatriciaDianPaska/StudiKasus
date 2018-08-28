/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studi_kasus;

/**
 *
 * @author ASUS
 */
public class Transaksi extends Pembeli {
    public int total;

    public Transaksi(
            String nm_toko, 
            int id_brg,
            String nama_brg, 
            int harga_brg, String 
            merk_brg,
            int id_pem,
            String nama_pem,
            String amt, 
            int no_tep,
            int tot)
    {
        super(
                nm_toko, 
                id_brg,
                nama_brg,
                harga_brg, 
                merk_brg, 
                id_pem, 
                nama_pem,
                amt,
                no_tep);
        this.total = tot; 
    }
    public void cetak ()
    {
        super.cetak();
        System.out.println("Total Harga :" + this.total);
    }
    
    public static void main (String[] args)
    {
        System.out.println("Transaksi Pembelian Barang :  ");
        Transaksi bb = new Transaksi("Terang Dunia", 23, "Buku", 2000, "SIDU", 12, "Patricia", "Ranau", 99, 2000);
        bb.cetak();
    }
}
