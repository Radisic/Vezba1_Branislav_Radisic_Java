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
public class Television {
    
    private int volume = 0;
	private int currentProgram = 0;
	private boolean turnOn;
	
	public Television() {
		volume = 0;
		currentProgram = 0;
		turnOn = false;
	}
	
	public Television(int vol, int cur, boolean turn) {
		volume = vol;
		currentProgram = cur;
		turnOn = turn;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public int getCurrentProgram() {
		return currentProgram;
	}
	
	public boolean getTurnOn() {
		return turnOn;
	}
	
	public void setVolume(int vol) {
		volume = vol;
	}
	
	public void setCurrentProgram(int cur) {
		currentProgram = cur;
	}
	
	public void setTurnOn(boolean to) {
		turnOn = to;
	}
    
}
