/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media;

/**
 *
 * @author banet
 */
public class Radio {
    
   private double fmFrequency;
	private int amFrequency;
	private char band;
	
	public Radio() {
		fmFrequency = 91.8;
		amFrequency = 600;
		band = 'f';
	}
	
	public Radio(double fm, int am, char b) {
		fmFrequency = fm;
		amFrequency = am;
		band = b;
	}
	
	public double getFmFrequency() {
		return fmFrequency;
	}
	
	public int getAmFrequency() {
		return amFrequency;
	}
	
	public char getBand() {
		return band;
	}
	
	public void setFmFrequency(double fm) {
		fmFrequency = fm;
	}
	
	public void setAmFrequency(int am) {
		amFrequency = am;
	}
	
	public void setBand(char b) {
		band = b;
	} 
    
}
