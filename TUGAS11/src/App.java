public class App {
    public static void main(String[] args) {

        DataPelanggan D1 = new Pelanggan(); //polymorphism
 
        //exception
    try {
        D1.InputDataPelanggan();
    } 
    catch (Exception e){
        System.out.println("Data yang di isi salah");
    }

        //mencetak struk
        D1.Struk();

    }
}
