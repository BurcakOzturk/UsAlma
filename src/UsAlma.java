import java.util.Scanner;
public class UsAlma {

	public static void main(String[] args) {
		

		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Tabanı giriniz: ");
		        int taban = scanner.nextInt();
		        System.out.print("Üssü giriniz: ");
		        int us = scanner.nextInt();

		        int sonuc = usAlma(taban, us);
		        System.out.println("Sonuç: " + sonuc);
		    }

		    static int usAlma(int taban, int us) {
		        if (us == 0)
		            return 1;
		        else
		            return taban * usAlma(taban, us - 1);
		    }
		

	}


