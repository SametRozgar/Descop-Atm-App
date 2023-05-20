package YeniBaşlangıç;
import java.util.Scanner;
public class SurucuBelgesiTahsilati extends VergilerVeResmiKurumlar {
public static int borc=300;
	public void surucuOdemesi()
	{
		borc=300;
		giris_Ekranı geriGonder=new giris_Ekranı();
		BakiyeSorgula nesne8=new BakiyeSorgula();
		Scanner scan=new Scanner(System.in);
		System.out.println(getTc()+"Numarali Tc Kimlik Üzerine Kayitli Sürücü Belgesi İçin Borç="+borc+"Tl dir");
		System.out.println("Pasaport Borcunu Ödemek İçin 1'i Giris Ekranina Dönmek İçin 2'yi Seçiniz");
		int secim=scan.nextInt();
		if(secim==1)
		{
			nesne8.borcOdeme(secim);
			geriGonder.main(null);
		}
		else if(secim==2)
		{
			System.out.println("Giris Ekraninina Yönlendirliyorsunuz.....");
			geriGonder.main(null);
			
		}
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	public SurucuBelgesiTahsilati(String tc, String adSoyad, int dogumTarihi) {
		super(tc, adSoyad, dogumTarihi);
		
	}

}
