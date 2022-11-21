package AnthonySoprano;

import java.awt.List;
import java.util.ArrayList;

public class Sopranos {
		ArrayList<String> takmaisimler=new ArrayList<String>();
		
		public Sopranos() {
			// TODO Auto-generated constructor stub
		
		}
		
		public static void kullaniciEkle(ArrayList<String> liste,String username) {
			liste.add(username);
			System.out.println(username+" listeye eklendi");
			
		}
		public static void listeelemanlarýnýGor(ArrayList<String> liste){
			int sayac=1;
			for (int i = 0; i < liste.size(); i++) {
				System.out.println(sayac++ +"->"+ liste.get(i));
			}
		}
		
		public static boolean listedevarmi(ArrayList<String> liste,String username){
			boolean kontrol=false;
			for (int i = 0; i < liste.size(); i++) {
				if(liste.get(i).equals(username) ){
					kontrol=false;
					break;
				}
				else{
					kontrol=true;
				}
			}
			return kontrol;
		}
}
