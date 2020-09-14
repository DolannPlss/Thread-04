package controller;

public class ThreadSapo extends Thread{
	private int sapo;
	private int op;
	private int ale;
	private static int posi;
	private static int[] vt = new int[5] ;
	
	public ThreadSapo(int sapo, int op) {
		this.sapo=sapo;
		this.op=op;
	}
	public void run() {
		while (sapo<=100) {      
		    ale=(int) (Math.random()*51);
			sapo=sapo+ale;
			if(sapo<100){
				System.out.println("sapo "+ op +" aondou "+ale +" metros, falta "+(100-sapo)+" metros, total= "+sapo);
			}if (sapo >100) {
				colocacao();
				System.out.println("sapo "+ op +" andou "+ale+" metros e cruzou a linha de chegada em "+ posi+" lugar");
			}
		}
	}
	public void colocacao(){
		posi++;
	}
}
