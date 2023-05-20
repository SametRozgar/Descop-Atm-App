package YeniBaşlangıç;
import java.util.Scanner;
public class VergilerVeResmiKurumlar {
	private static String tc="";
	private static String adSoyad;
	private static int dogumTarihi;
	
	
	
	public void bilgiAl()
	{
		
		Scanner bilgial=new Scanner(System.in);
		System.out.println("Hoşgeldiniz Lütfen TC No Giriniz");
		tc=bilgial.next();
		if(tc.length()>10 && tc.length()<12)
		{
			System.out.println("Tc Numarasi Gecerli ");
		}
		else
		{
			System.out.println("Tc Numarasi Gecersiz Tekrar Deneyiniz");
			
			
		}
		System.out.println("Hoşgeldiniz Lütfen Ad Soyad Giriniz");
		adSoyad=bilgial.next();
		
		System.out.println("Hoşgeldiniz Lütfen Dogum Yili Giriniz");
		dogumTarihi=bilgial.nextInt();
		
		
	}



	public VergilerVeResmiKurumlar(String tc, String adSoyad, int dogumTarihi) {
		super();
		this.tc = tc;
		this.adSoyad = adSoyad;
		this.dogumTarihi = dogumTarihi;
	}



	public String getTc() {
		return tc;
	}



	public void setTc(String tc) {
		this.tc = tc;
	}



	public String getAdSoyad() {
		return adSoyad;
	}



	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}



	public int getDogumTarihi() {
		return dogumTarihi;
	}



	public void setDogumTarihi(int dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}


	

	
	
	

}
