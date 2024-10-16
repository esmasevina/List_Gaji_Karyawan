/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listkaryawan;

/**
 *
 * @author master
 */
public class Karyawan {
    private String nik;
    private String nama;
    private String golongan;
    
    public double getGajiPokok(){
        double gaji=0;
        
        switch (getGolongan()){
            case "A":
                gaji=2500000;
                break;
            case "B":
                gaji=2000000;
                break;
            case "C":
                gaji=1500000;
                break;
        }
        return gaji;
    }
    
    public double getTunjangan(){
        double tunjangan=0;
        
        switch (getGolongan()){
            case "A":
                tunjangan=200000;
                break;
            case "B":
                tunjangan=150000;
                break;
            case "C":
                tunjangan=100000;
                break;
        }
        return tunjangan;
    }
    
    public double getTotalGaji(){
        double totalGaji;
        
        totalGaji=getGajiPokok()+getTunjangan();
        return totalGaji;
    }

    /**
     * @param nik the nik to set
     */
    public void setNik(String nik) {
        this.nik = nik;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @param golongan the golongan to set
     */
    public void setGolongan(String golongan) {
        this.golongan = golongan;
    }

    /**
     * @return the nik
     */
    public String getNik() {
        return nik;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @return the golongan
     */
    public String getGolongan() {
        return golongan;
    }
}

