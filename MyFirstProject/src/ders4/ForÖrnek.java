package ders4;

public class ForÖrnek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i<5; i++) {
			for(int j=5; j>i; j--) {
				System.out.print("-");
			}
			System.out.println();	
		}
		
		for(int a=5;a>0;a--) {
			for(int b=6; b>a; b--) {
				System.out.print("-");
			}
			System.out.println();
		}
		/*for (int i=5 ; i>0 ; i--) {
			for (int j=5 ; j>=i ; j--)
				System.out.print("*");
			System.out.println();
		}*/
	}
}
