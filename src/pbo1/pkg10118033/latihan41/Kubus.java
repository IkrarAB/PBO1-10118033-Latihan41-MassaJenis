package pbo1.pkg10118033.latihan41;

public class Kubus {
    private int sisi, massa;
    
    public int getSisi() {
        return sisi;
    }

    public int getMassa() {
        return massa;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }
    
    public int hitungVolume(int parSisi){
        parSisi = sisi*sisi*sisi;
        return parSisi;
    }
    
    public int hitungMassaJenis(int parMassa, int volume){
        return parMassa / volume;
    }
}