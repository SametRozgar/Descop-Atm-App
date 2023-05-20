package YeniBaşlangıç;
import java.util.Scanner;
public class TrafikCezası extends VergilerVeResmiKurumlar{
	BakiyeSorgula nesne9=new BakiyeSorgula();
	giris_Ekranı geriGonder=new giris_Ekranı();
	public static int vergiBorcu=450;
	public void trafikcezasi()
	{
		Scanner scan=new Scanner(System.in);
	System.out.println(getTc()+"Tc Kimlik Numarali"+getAdSoyad()+"Adina Kayitli Trafik Cezasi ="+vergiBorcu+"Tl Dir");
	System.out.println("Trafik Borcunu Ödemek İçin 1'i Giris Ekranina Dönmek İçin 2'yi Seçiniz");
	int secim=scan.nextInt();
	if(secim==1)
	{
		nesne9.borcOdeme(secim);
		geriGonder.main(null);
	}
	else if(secim==2)
	{
		System.out.println("Giris Ekraninina Yönlendirliyorsunuz.....");
		geriGonder.main(null);
		
	}
	}
	
	
	
	
	
	
	
	
	
	public TrafikCezası(String tc, String adSoyad, int dogumTarihi) {
		super(tc, adSoyad, dogumTarihi);
		
	}

}
