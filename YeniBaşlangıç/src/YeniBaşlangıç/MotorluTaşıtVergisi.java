package YeniBaşlangıç;
import java.util.Scanner;
public class MotorluTaşıtVergisi extends VergilerVeResmiKurumlar{
	public int borc=100;
	BakiyeSorgula nesne5=new BakiyeSorgula();
	giris_Ekranı nesne6=new giris_Ekranı();
	public int motorluTasıtVergisi(int borc)
	{
		this.borc=borc;
		borc=100;
		Scanner scan=new Scanner(System.in);
		System.out.println("borç Sahibinin Adi Soyadi"+getAdSoyad());
		System.out.println("borç Sahibinin TC Numarasi"+getTc());
		System.out.println("borç Sahibinin Dogum Tarihi"+getDogumTarihi());
		System.out.println("lütfen araç Ruhsat Numarasi giriniz");
		int ruhsatNo=scan.nextInt();
		
	System.out.println(ruhsatNo+" Numaralı Aracinizin Vergi Borcu="+borc+"TL dir");
	System.out.println("Ödemek için 1'i Ana Menüye Dönmek İçin 2'yi Seçiniz");
	int choise=scan.nextInt();
	if(choise==1)
	{
		nesne5.azalt=100;
		nesne5.bakiyeAzalt(choise);
		borc=0;
		System.out.println("Borc Odeme Basarili Ana Menüye Yönlendirildiniz ...");
		nesne6.main(null);
		return borc;
		
	}
	else if(choise==2)
	{
		System.out.println("Ana Menüye Yönlendirildiniz ...");
		nesne6.main(null);
	}
	else
	{
		System.out.println("Yanliş Girdi Ana Menüye Yönlendirildiniz ...");
		nesne6.main(null);
	}
	return borc;
	
	}
	
	
	
	
	
	
	
	
	
	
	public MotorluTaşıtVergisi(String tc, String adSoyad, int dogumTarihi) {
		super(tc, adSoyad, dogumTarihi);
		
	}

}
