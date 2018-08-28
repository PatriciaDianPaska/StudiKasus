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
public class TokoBuku {
      public String nama_toko;
   public int id_barang;
   public String nama_barang;
   public int harga_barang;
   public String merk_barang;
   
   public TokoBuku(String nm_toko, int id_brg, String nm_brg, int hrg_brg,String merk_brg ){
       this.nama_toko = nm_toko;
       this.id_barang = id_brg;
       this.nama_barang = nm_brg;
       this.harga_barang = hrg_brg;
       this.merk_barang = merk_brg;
   }
       
 public void cetak ()
 {
     System.out.println("Nama Toko : " + this.nama_toko);
     System.out.println("Id Barang : " + this.id_barang);
     System.out.println("Nama Barang : " + this.nama_barang);
     System.out.println("Harga Barang : " + this.harga_barang);
     System.out.println("Merk Barang : " + this.merk_barang);
 }
}
