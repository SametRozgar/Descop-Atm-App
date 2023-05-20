package YeniBaşlangıç;
import java.util.Scanner;
public class PsaportHarcıOde extends VergilerVeResmiKurumlar {
public static  int pasaportBorc=100;
Scanner scan=new Scanner(System.in);
	public int pasaportBorc(int pasaportBorc)
	{
		giris_Ekranı geriGonder=new giris_Ekranı();
		BakiyeSorgula nesne7=new BakiyeSorgula();
		System.out.println(getTc()+" Tc Kimlik Numarali Pasaport Bedeli ="+pasaportBorc);
		this.pasaportBorc=pasaportBorc;
		System.out.println("Pasaport Borcunu Ödemek İçin 1'i Giris Ekranina Dönmek İçin 2'yi Seçiniz");
		int pasaportsecim=scan.nextInt();
		
		if(pasaportsecim==1)
		{
			nesne7.borcOdeme(pasaportBorc);
			geriGonder.main(null);
		}
		else if(pasaportsecim==2)
		{
			System.out.println("Giris Ekraninina Yönlendirliyorsunuz.....");
			geriGonder.main(null);
			
		}
		
		
		
		
		
		
		return pasaportBorc;
	}
	
	
	
	public PsaportHarcıOde(String tc, String adSoyad, int dogumTarihi) {
		super(tc, adSoyad, dogumTarihi);
		
	}

}
