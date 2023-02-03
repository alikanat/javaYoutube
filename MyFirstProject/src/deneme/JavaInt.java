package deneme;

public class JavaInt {

	public static void main(String[] args) {
		//merhaba yazan program
		
		String metin = "Değişkenleri öğreniyorum.";
		String isim = "Ben Ali KANAT";
		int kilom = 50;  //virgüllü olmayan ama 4 byte yani 32 bit olduğu için (+2 üzeri 31-1 = 2,147,483,647(-2 147 483 648   …   2 147 483 648 aralığı)) sınırlı sayıda kapsama sahip
		
		
		System.out.println(metin + " " + isim); //boşluk bırakma yöntemi
		System.out.println("Benim kilom: " + kilom + "kg");

	}

}