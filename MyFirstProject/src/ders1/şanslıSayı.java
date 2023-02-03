package ders1;

import java.util.Scanner;

public class şanslıSayı {

	public static void main(String[] args) {
		
		
		Scanner okuyucu = new Scanner(System.in);
		System.out.println("Adınız nedir?: ");
		String isim = okuyucu.next();
		System.out.println("Hoşgeldin " + isim);
		System.out.println("Yaşın nedir?: ");
		int yaş = okuyucu.nextInt();
		System.out.println("Şanslı sayınızı hemen buluyorum.");
		
		
		int harfSayısı = isim.length();
		int şanslıSayı = 0;
		
		if(yaş<18) {
			şanslıSayı = (yaş * harfSayısı) % 10;
		}
		else if(yaş<25) {
			şanslıSayı = (harfSayısı - yaş) % 10;
		}
		else if(yaş<45) {
			şanslıSayı = (yaş / harfSayısı) % 10;
		}
		else if(yaş<65) {
			şanslıSayı = (harfSayısı * 2) % 10;
		}
		else {
			şanslıSayı = (yaş * 2) % 10;
		}
		
		if (şanslıSayı<0)
			şanslıSayı *=-1;  //şanslıSaysı = şanslıSayı * -1; diye yazılabilir ama c de bu şekilde hatırladığım için böyle yazdım.
		
		System.out.println(şanslıSayı);
		
	}
}
