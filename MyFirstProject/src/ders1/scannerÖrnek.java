package ders1;

import java.util.Scanner;

public class scannerÖrnek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sayesinde kullanıcıdan bir girdi istiyebiliyoruz
		//Scanner adlı classı kullanmak için Scanner yazdıktan sonra üzerine tıkladığımızda "import Scanner(java.util)" bu kaynağı import etmemiz lazım.
		
		Scanner okuyucu = new Scanner(System.in);
		System.out.println("İsminiz nedir?");
		String isim = okuyucu.next(); //bir sonraki string değerine atıyor, yazılan girdiyi.
		
		//Scanner yaşOkuyucu = new Scanner(System.in); //buna gerek yokmuş, kod yine çalışıyor
		System.out.println("Yaşınız nedir?");
		int yaş = okuyucu.nextInt();
		System.out.println("Merhaba, " + isim + " " + "yaşın " + yaş);
		
		
	}

}
