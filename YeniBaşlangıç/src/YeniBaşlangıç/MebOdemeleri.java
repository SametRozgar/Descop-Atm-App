package YeniBaşlangıç;
import java.util.Scanner;
public class MebOdemeleri implements EğitimInterface {
public int ogrenciNo;
public int tc;
public static int mebBorcu=100;
BakiyeSorgula nesne11=new BakiyeSorgula();
Scanner scan=new Scanner(System.in);
EğitimVeSınavÖdemeleri basaDondur=new EğitimVeSınavÖdemeleri(0, null);
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
		System.out.println(ogrenciNo+"Numaralı Ogrencinin Harc Borcu ="+mebBorcu+"Tl dir");
		System.out.println("Harc Borcunu Ödemek İçin 1'i Giris Ekranina Dönmek İçin 2'yi Seçiniz");
		int secim=scan.nextInt();
		if(secim==1)
		{
			nesne11.borcOdeme(secim);
			basaDondur.EgitimOdemesi();
		}
		else if(secim==2)
		{
			System.out.println("Giris Ekraninina Yönlendirliyorsunuz.....");
			basaDondur.EgitimOdemesi();
			
		}
	}
}
