package YeniBaşlangıç;
import java.util.Scanner;
public class ÜniversiteHarcVeSınavÖdemeleri implements EğitimInterface {
Scanner scan=new Scanner(System.in);
BakiyeSorgula nesne10=new BakiyeSorgula();
giris_Ekranı geriGonder=new giris_Ekranı();
EğitimVeSınavÖdemeleri basaDondur=new EğitimVeSınavÖdemeleri(0, null);
public static int uniHarc=358;
public static int ogrenciNo;
	@Override
	public void ogrenciNo() {
		System.out.println("lütfen Ogrenci Numarasi giriniz =");
		ogrenciNo=scan.nextInt();
		if (ogrenciNo>10000)
		{

		}
		else
		{
			System.out.println("hatali Giris Yaptiniz Menüye Yönlendiriliyorsunuz.....");
			basaDondur.EgitimOdemesi();
			
		}
		
	}



	public ÜniversiteHarcVeSınavÖdemeleri() {
	
	}



	@Override
	public void kisiselBilgiler() {
		System.out.println();
		System.out.println("Tc Kimlik NO Giriniz=");
		String tc=scan.next();
		if(tc.length()<12 && tc.length()>10)
		{
			System.out.println("TC No Kabul Edildi");
		}
		else
		{
			System.out.println("Geçersiz Giris Menüye Yönlendirliyorsunuz.....");
			basaDondur.EgitimOdemesi();
		}
	
	
	}
	public void borcOde()
	{
		System.out.println(ogrenciNo+"Numaralı Ogrencinin Harc Borcu ="+uniHarc+"Tl dir");
		System.out.println("Harc Borcunu Ödemek İçin 1'i Giris Ekranina Dönmek İçin 2'yi Seçiniz");
		int secim=scan.nextInt();
		if(secim==1)
		{
			nesne10.borcOdeme(secim);
			geriGonder.main(null);
		}
		else if(secim==2)
		{
			System.out.println("Giris Ekraninina Yönlendirliyorsunuz.....");
			geriGonder.main(null);
			
		}
	}

}
