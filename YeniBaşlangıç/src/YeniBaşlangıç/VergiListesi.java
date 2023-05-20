package YeniBaşlangıç;
import java.util.Scanner;
public class VergiListesi {
	VergiOdeme odemeGonder=new VergiOdeme(null, null, 0);
	MotorluTaşıtVergisi nesne5=new MotorluTaşıtVergisi(null, null, 0);
	VergilerVeResmiKurumlar vergiyeGonder=new VergilerVeResmiKurumlar(null, null, 0);
	PsaportHarcıOde pasaportaGonder=new PsaportHarcıOde(null, null, 0);
	SurucuBelgesiTahsilati surucuyeGonder=new SurucuBelgesiTahsilati(null, null, 0);
	public void VergilisteGoster()
	{
		System.out.println("1---Vergi Ödeme---");
	    System.out.println("2---Motorlu Taşıt Vergisi---");
	         System.out.println("3---Sürücü Belgesi Tahislatı---");
	            System.out.println("4---Pasaport Harcı---");
	         System.out.println("5---Trafik cezası---");
        Scanner vergi=new Scanner(System.in);
	System.out.println("lütfen Yapmak İstedğiniz İşlemi Seçiniz");
	int vergiSecim=vergi.nextInt();
	if(vergiSecim==1)
	{
		
		odemeGonder.bilgiGoster();
	}
	else if(vergiSecim==2)
	{
		nesne5.motorluTasıtVergisi(vergiSecim);
	}
	else if(vergiSecim==3)
	{
		surucuyeGonder.surucuOdemesi();
	}
	else if(vergiSecim==4)
	{
		pasaportaGonder.pasaportBorc(vergiSecim);
	}
	else if(vergiSecim==5)
	{
		
	}
	else 
	{
		System.out.println("hatali giris yaptiniz Sistem Kapatılıyor");
		System.exit(0);
	}
	}
}
