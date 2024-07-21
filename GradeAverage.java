package asds;
import java.util.Scanner;

public class GradeAverage {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			// Kullanıcıdan derslerin puanlarını al
			System.out.print("Matematik notunu giriniz: ");
			int matematik = scanner.nextInt();

			System.out.print("Fizik notunu giriniz: ");
			int fizik = scanner.nextInt();

			System.out.print("Kimya notunu giriniz: ");
			int kimya = scanner.nextInt();

			System.out.print("Türkçe notunu giriniz: ");
			int turkce = scanner.nextInt();

			System.out.print("Tarih notunu giriniz: ");
			int tarih = scanner.nextInt();

			System.out.print("Müzik notunu giriniz: ");
			int muzik = scanner.nextInt();

			// Notların ortalamasını hesapla
			double ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6.0;

			// Ortalamayı ekrana yazdır
			System.out.println("Ortalamanız: " + ortalama);

			// Sınıfı geçip geçmediğini kontrol et ve ekrana yazdır
			String sonuc = ortalama > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
			System.out.println("Sonuç: " + sonuc);
		}
    }
}
