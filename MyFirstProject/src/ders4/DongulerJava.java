package ders4;

public class DongulerJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<10;i++)
			System.out.println(i);
		
		
		int sayi = 2;
		while (sayi < 10) {
			System.out.println(sayi);
			sayi +=2;
		}
		
		int degisken = 2;
		do {
			System.out.println(degisken);
			degisken *=2;
		}while(degisken != 8); //degisken, süslü parantez içindeki işlemleri gördükten sonra 8e eşitse devam etmiyor, != demek eşit değil anlamına gelir.
	}

}
