
import media.Radio;
import media.Television;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author banet
 */
public class Main {

   
        
        public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television tv1 = new Television(25,3,false);
		
		System.out.println("TV1 -> \n Vrednost volume: " + tv1.getVolume() + "\n Vrednost currentProgram: " + tv1.getCurrentProgram() + "\n Vrednost turnOn: " + tv1.getTurnOn());
		
		tv1.setVolume(30);
		tv1.setCurrentProgram(12);
		tv1.setTurnOn(true);
		
		System.out.println("\n\n\n NAKON PROMENE VREDNOSTI");
		System.out.println("TV1 -> \n Vrednost volume: " + tv1.getVolume() + "\n Vrednost currentProgram: " + tv1.getCurrentProgram() + "\n Vrednost turnOn: " + tv1.getTurnOn());
		
		
		Radio r1 = new Radio(91.5, 500, 'f');
		
		System.out.println("\n\n\n");
		System.out.println("R1 -> \n Vrednost fm: " + r1.getFmFrequency() + "\n Vrednost am: " + r1.getAmFrequency() + "\n Vrednost band: " + r1.getBand());
		
		r1.setFmFrequency(102.4);
		r1.setAmFrequency(200);
		r1.setBand('a');
		
		System.out.println("\n\n\n NAKON PROMENE VREDNOSTI");
		System.out.println("R1 -> \n Vrednost fm: " + r1.getFmFrequency() + "\n Vrednost am: " + r1.getAmFrequency() + "\n Vrednost band: " + r1.getBand());
		
	}
        
        
        
        
    }
    
    
    
    

