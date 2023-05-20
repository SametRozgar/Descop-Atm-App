package YeniBaşlangıç;
import java.util.Scanner;
public class ResmiÖdemeler {
public void secimList()
{
	
	VergilerVeResmiKurumlar nesne1=new VergilerVeResmiKurumlar(null, null, 0);
	EğitimVeSınavÖdemeleri nesne11=new EğitimVeSınavÖdemeleri(0, null);
	VergiListesi nesne3=new VergiListesi();
	Scanner resmiSecenek=new Scanner(System.in);
	System.out.println("1---Vergiler Ve Resmi Kurumlar---");
	System.out.println("2---Eğitim Ve Sınav Ödemeleri---");
	System.out.println("Lütfen Yapmak İstediğiniz İşlemi Seciniz");
	int resmiSecim=resmiSecenek.nextInt();	
	if(resmiSecim==1)
	{
		
		
		
		nesne1.bilgiAl();
		nesne3.VergilisteGoster();
		
	}
	else if(resmiSecim==2)
	{
		nesne11.EgitimOdemesi();
	}
	else
	{
		System.out.println("hatali giris Yaptiniz sistem Kapatiliyor");
		System.exit(0);
	}
}
}
