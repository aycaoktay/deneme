package dorduncuhaftaprojeler;

import java.util.Scanner;

public class kureselisinma {
	static void soru1() {
		System.out.println("Kuresel isinma zararli midir?");
		System.out.println("1-Evet");
		System.out.println("2-Hayir");
		System.out.println("3-Duruma gore degisir.");
		System.out.println("4-Ilgilenmiyorum");
	}
	static void soru2() {
		
	}
	static void soru3() {
		
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int sayac = 0;
		int[] dizi = new int[5];
		soru1();
		dizi[0] = sc.nextInt();
		if(dizi[0]== 1) {
		sayac++;	
		 System.out.println("Dogru");
		 
		}
		else {
			System.out.println("Yanlis");
			
		}
		System.out.println();
		
		System.out.println("Kuresel isinma kutuplara zarar verir mi?");
		System.out.println("1-Hayir");
		System.out.println("2-Evet");
		System.out.println("3-Duruma gore degisir.");
		System.out.println("4-Ilgilenmiyorum");
		dizi[1] = sc.nextInt();
		 if(dizi[1] == 2) {
			 sayac++;
			 System.out.println("Dogru");
		 }
		 else {
			 System.out.println("Yanlis");
		 }
		 System.out.println();
		
		 System.out.println("Kuresel isinma engellenebilir mi?");
		 System.out.println("1-Evet");
		 System.out.println("2-Hayir");
		 System.out.println("3-Duruma gore degisir.");
		 System.out.println("4-Ilgilenmiyorum");
		 dizi[2] = sc.nextInt();
		 if(dizi[2] == 3) {
			 sayac++;
			 System.out.println("Dogru");
		 }
		 else {
			 System.out.println("Yanlis");
		 }
		 System.out.println();
			
		 System.out.println("Kuresel isinma dunyayi isitir mi?");
		 System.out.println("1-Evet");
		 System.out.println("2-Hayir");
		 System.out.println("3-Duruma gore degisir.");
		 System.out.println("4-Ilgilenmiyorum");
		 dizi[3] = sc.nextInt();
		 if(dizi[3] == 4) {
			 sayac++;
			 System.out.println("Dogru");
		 }
		 else {
			 System.out.println("Yanlis");
		 }
		 System.out.println();
			
		 System.out.println("Kuresel isinma nedir?");
		 System.out.println("1-Dunyada meydana gelen isi artisidir.");
		 System.out.println("2-Dunyada meydana gelen isi azalisidir.");
		 System.out.println("3-Bilmiyorum.");
		 System.out.println("4-Ilgilenmiyorum");
		 dizi[4] = sc.nextInt();
		 if(dizi[4] == 1) {
			 sayac++;
			 System.out.println("Dogru");
		 }
		 else {
			 System.out.println("Yanlis");
		 }
		 System.out.println();
		 
		 if(sayac == 5) {
			 System.out.println("Mukemmel");
		 }
		 else if(sayac == 4){
			 System.out.println("Cok iyi");
		 }
		 else {
			 System.out.println("Kuresel isinma hakkinda bilgilerini tazelemen lazim.");
		 }
		
	}
}
