import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Pelanggan extends DataPelanggan{

    //method menginput data pelanggan
    public void InputDataPelanggan(){
        Scanner scanStr = new Scanner(System.in);
        Scanner scanIn = new Scanner(System.in);
        System.out.print(" No faktur = ");
        faktur = scanStr.next();
        System.out.print("Nama pelanggan = ");
        nama = scanStr.next();
        System.out.print(" No HP = ");
        noHP = scanStr.next();
        System.out.print("Alamat = ");
        alamat = scanStr.next();
        System.out.print("Nama barang = ");
        namaBarang = scanStr.next();
        System.out.print("Harga barang = ");
        hargaBarang = scanIn.nextInt();
        System.out.print("Jumlah barang = ");
        jumlahBarang = scanIn.nextInt();
        scanStr.close();
        scanIn.close();
    }

    //mencetak struk
    @Override
    public void Struk() {
        Integer totalBayar = hargaBarang*jumlahBarang;
        this.totalBayar = totalBayar;

        //date
        Date date = new Date();
        SimpleDateFormat hari = new SimpleDateFormat("'Hari/Tanggal \t:' EEEEEEEEEE dd-mm-yyyy");
        SimpleDateFormat jam = new SimpleDateFormat("'Waktu \t\t:' hh:mm:ss z");

        System.out.println("----------- Hamuti Market -----------");
        System.out.println(hari.format(date));
        System.out.println(jam.format(date));
        System.out.println("Nomor Faktur \t\t: " + faktur);
        System.out.println("=====================================");
        System.out.println("---------- DATA PELANGGAN ----------");
        System.out.println("Nama Pelanggan \t: " + nama);
        System.out.println("No HP \t\t: " + noHP);
        System.out.println("Alamat \t\t: " + alamat);
        System.out.println("------- DATA PEMBELIAN --------");
        System.out.println("Nama Barang \t: " + namaBarang);
        System.out.println("Harga \t\t: " + hargaBarang);
        System.out.println("Jumlah \t\t: " + jumlahBarang);
        System.out.println("Total Bayar\t: " + this.totalBayar);
        System.out.println("------------------------------------");
        System.out.println("Nama Kasir \t: Niken Khalilah \n");
        System.out.println("------------------------------------");
        //string
        System.out.println("toUppercase\t: " + nama.toUpperCase() );
        System.out.println("length\t\t: " + nama.length() );
        System.out.println("equals\t\t: " + hari.equals(jam) );

    }
    

}
