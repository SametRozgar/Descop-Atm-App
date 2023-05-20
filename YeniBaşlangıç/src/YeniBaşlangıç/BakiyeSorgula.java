package YeniBaşlangıç;
import java.util.Scanner;

public class BakiyeSorgula {
	public static int varlık=1000;
	public static int islem;
	public static int azalt;
public int Bakiye( int varlık)
{
	this.varlık=varlık;
	
	varlık=1000;
	
	
	return varlık;
}
public int BakiyeArttır(int islem)
{
	Scanner tutarsec=new Scanner(System.in);
	System.out.println("lütfen eklenecek tutari giriniz");
	islem=tutarsec.nextInt();
	
	this.islem=islem;
	varlık=varlık+islem;
	System.out.println("İşlem Başarılı Yeni Bakiyeniz ="+varlık);
	return varlık;
}
public int bakiyeAzalt(int azalt)
{
	Scanner dusur=new Scanner(System.in); 
	System.out.println("Lütfen Çekmek istediğiniz tutarı giriniz");
	azalt=dusur.nextInt();	
	
	if(azalt>varlık)
	{
		System.out.println("Bakiye Yetersiz Sistem Kapatılıyor");
		System.exit(0);
	}
	else
	{
		varlık=varlık-azalt;
		System.out.println("İşlem Başarılı Kalan Bakiyeniz="+varlık);
	}
	this.azalt=azalt;
	return varlık;
}
public int borcOdeme(int borcx)
{
	Scanner tutucu=new Scanner(System.in);
	System.out.println("Lütfen Ödenecek Borc Tutarini Giriniz");
	borcx=tutucu.nextInt();
	if(varlık>borcx)
	{
		varlık=varlık-borcx;
		System.out.println("Borç Başarı İle Ödendi Kalan Bakiyeniz="+varlık);
		
	}
	else
	{
		System.out.println("Borç Ödenemedi Bakiyeniz Yetersiz");
	}
	return varlık;
}
public void bakiyeGoster()
{
	System.out.println("son bakiye"+varlık);
	
}

}
