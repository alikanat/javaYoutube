package deneme;

public class JavaDouble {

	public static void main(String[] args) {
		//merhaba yazan program
		
		String metin = "Değişkenleri öğreniyorum.";
		String isim = "Ben Ali KANAT";
		double boyum = 197.4;   //virgüllü sayıları da kapsayan ama 8 byte yani 64 bit olduğu için (5.0 * 10-324   -    1.7 * 10308 aralığında) int'e göre daha kapsamlı
		
		System.out.println(metin + " " + isim); //boşluk bırakma yöntemi
		System.out.println("Benim boyum: " + boyum + "cm");

	}

}