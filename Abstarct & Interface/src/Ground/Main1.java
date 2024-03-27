
package Ground;
public class Main1 {
    public static void main(String[] args) {
        BangunDatar segitiga = new Segitiga(20, 10);
        BangunDatar lingkaran = new Lingkaran(10);
        
        
        System.out.println("Luas dati bangun datar segitiga: " + segitiga.getLuas());
        System.out.println("Luas dari bangun datar Lingkaran : " + lingkaran.getLuas());
    }
}