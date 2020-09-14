package main;

import controller.ThreadSapo;

public class Principal {

	public static void main(String[] args) {
		int sapo=0;	
		for (int op= 1; op < 6; op++) {
			Thread ThreadSapo = new ThreadSapo(sapo, op);
	    	ThreadSapo.start();
		}
	}
}
