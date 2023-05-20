package YeniBaşlangıç;
import java.util.Scanner;

public class giris_Ekranı {

	public static void main(String[] args) {
		
	kullaniciAdi kullanici=new kullaniciAdi();	
	SifreKontrol sifreGonder=new SifreKontrol();
	BakiyeSorgula bakiyeyeGonder=new BakiyeSorgula();
	ParaYatırma yatırmayaGonder=new ParaYatırma();
	ResmiÖdemeler resmiyeGonder=new ResmiÖdemeler();	
	Scanner kullaniciAdi=new Scanner(System.in);
	Scanner sifreleme=new Scanner(System.in);
	Scanner secim=new Scanner(System.in);
		
System.out.println("Lütfen Kullanıcı Adı Ve Şifre Giriniz");

System.out.println("kullanıcı adı:");
String isim=kullaniciAdi.next();
kullanici.isimkontrol(isim);


System.out.println("Lütfen Şifrenizi Giriniz");
int sifre=sifreleme.nextInt();

sifreGonder.SifreGecerlilik(sifre);


System.out.println("1---Bakiye Sorgula---");
System.out.println("2---Para Yatırma---");
System.out.println("3---para Çekme---");
System.out.println("4---Resmi Ödemeler--");
System.out.println("5---Kredi KArtı Nakit Avans---");
System.out.println("6---Kredi Kartı borç sorgula---");




System.out.println("lütfen Yapmak istediğiniz işlemi seçiniz");
int secilen=secim.nextInt();

if(secilen==1)
{
	bakiyeyeGonder.bakiyeGoster();
	
}
else if(secilen==2)
{
	bakiyeyeGonder.BakiyeArttır(0);
}
else if(secilen==3)
{
	bakiyeyeGonder.bakiyeAzalt(secilen);
}
else if(secilen==4)
{
	resmiyeGonder.secimList();
}
else if(secilen==5)
{
	
}
else if(secilen==6)
{
	
}
else
{
	System.out.println("Hatali giris Yaptiniz! lütfen tekrar deneyiniz");
}
bakiyeyeGonder.bakiyeGoster();




	}
	

}
