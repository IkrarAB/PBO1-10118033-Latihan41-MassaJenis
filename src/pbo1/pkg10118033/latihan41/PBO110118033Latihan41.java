
/**
 * 
 * @author 
 * NAMA  : Ikrar Anugrah Bastary
 * KELAS : PBO1
 * NIM   : 10118033
 * Deskripsi Program : Program ini berisi program untuk menampilkan volume dan
 *                     massa jenis kubus.
 *  
 */

package pbo1.pkg10118033.latihan41;

public class PBO110118033Latihan41 {
    public static void main(String[] args) {
        Kubus kubus = new Kubus();
        kubus.setSisi(5);
        kubus.setMassa(250);
        System.out.println("=====Massa Jenis Kubus=====");
        System.out.println("Sisi  : "+kubus.getSisi());
        System.out.println("Massa : "+kubus.getMassa());
        System.out.println("\n=====Hasil Perhitungan=====");
        System.out.println("Volume      : "+kubus.hitungVolume(kubus.getSisi()));
        System.out.println("Massa Jenis : "+kubus.hitungMassaJenis(kubus.getMassa(),kubus.hitungVolume(kubus.getSisi())));
        System.out.println("(Developed By : Ikrar AB)");
    }
}