package AnthonySoprano;

import java.util.Scanner;

public class TheSopranos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sopranos user1=new Sopranos();
		Futbolcu soccer1=new Futbolcu();
		Dikdortgen bir=new Dikdortgen();
		bir.setBoy(12);
		bir.setEn(20);
		System.out.println("alan:"+Dikdortgen.alan(bir.getBoy(), bir.getEn()));
		
		
		Sopranos.kullaniciEkle(user1.takmaisimler,"messi");
		Sopranos.kullaniciEkle(user1.takmaisimler,"ronaldo");
		Sopranos.kullaniciEkle(user1.takmaisimler,"neymar");
		Sopranos.listeelemanlar�n�Gor(user1.takmaisimler);
		
		//soccer1.ismi="Lionel Messi";
		//soccer1.yasi=35;
		
		System.out.println(Sopranos.listedevarmi(user1.takmaisimler, "messi"));
		System.out.println(Sopranos.listedevarmi(user1.takmaisimler, "benzema"));
		
		soccer1.setYasi(23);
		System.out.println(soccer1.getYasi());
		System.out.println(soccer1.unvan);
		
		boolean kontrol=true;
		while(kontrol){
			System.out.println("kay�t olmak istedi�iniz kullan�c� ad�n� giriniz:(��kmak i�in Q bas�n�z)");
			Scanner scan=new Scanner(System.in);
			String username=scan.nextLine();
			
			if(username.equals("Q")){
				kontrol=false;
				break;
				
			}
			else {
				boolean kullanicivarlik=Sopranos.listedevarmi(user1.takmaisimler, username);
				if(kullanicivarlik){
					Sopranos.kullaniciEkle(user1.takmaisimler, username);
			}
				else{
					System.out.println("kullan�c� ad� daha �nce kay�t edilmi�");
			}
			}
		
		}
		Sopranos.listeelemanlar�n�Gor(user1.takmaisimler);
	}

}
