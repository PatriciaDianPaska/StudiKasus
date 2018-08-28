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
class Pembeli extends TokoBuku {
   public int id_pembeli;
   public String nama_pembeli;
   public String alamat;
   public int no_telp;
 
   public Pembeli(
        String nm_toko,
        int id_brg,
        String nama_brg,
        int harga_brg, 
        String merk_brg,
        int id_pem,
        String nama_pem,
        String amt,
        int no_tep)
   {
       super(nm_toko, id_brg, nama_brg, harga_brg, merk_brg);
       this.id_pembeli = id_pem;
       this.nama_pembeli = nama_pem;
       this.alamat = amt;
       this.no_telp = no_tep;
   }
   
   public void cetak ()
   {
       super.cetak();
       System.out.println("ID Pembeli : " + this.id_pembeli);
       System.out.println("Nama Pembeli : " + this.nama_pembeli);
       System.out.println("Alamat : " +this.alamat);
       System.out.println("No Telepon : " +this.no_telp);
       
   }
}
       