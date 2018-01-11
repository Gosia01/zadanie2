package Tablice;

import java.util.Random;

public class OdwrotnaKolejnosc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tbl []=new int [10];
		Random rnd=new Random();
		for(int i=0; i<tbl.length; i++){
			tbl[i]=rnd.nextInt(21)-10;
			System.out.println(tbl[i]);
		}
		//wyœwietlenie liczb w odwrotnej kolejnoœci
		for(int i=tbl.length-1; i<=9; i--){
			System.out.println(tbl[i]);
			}
	}

}
