/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylistexercise2;

/**
 *
 * @author rokom
 */
public class Journal extends LibraryItem {
    private String vol;
    
    Journal() {
        vol = "";
    }

    public String getVol() {
        return vol;
    }

    public void setVol(String vol) {
        this.vol = vol;
    }
    
    @Override
    protected String printDetails() {
        return super.printDetails() + "Volume: " + vol;
    }
}
