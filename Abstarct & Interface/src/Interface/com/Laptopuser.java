//indah puspitasari_20220040095
package InterFace.com;

public class Laptopuser {
    private Laptop laptop;

    public Laptopuser(Laptop laptop) {
        this.laptop = laptop;
    }
    
    void turnOnLaptop(){
        this.laptop.powerOn();
    }
    void makeLaptopLouder(){
        this.laptop.volumeUp();
    }
    
    void makeLaptopSilent(){
        this.laptop.volumeDown();
    }

    void turnOffLaptop() {
         this.laptop.powerOff(); 
    }

}