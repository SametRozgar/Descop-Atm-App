package YeniBaşlangıç;

public class SifreKontrol {
	int sifre;
public void SifreGecerlilik(int sifre)
{
	this.sifre=sifre;
	
	
	if(sifre>1000 && sifre<10000)
	{
		System.out.println("Sifre Kabul Edildi");
	}
	else
	{
		System.out.println("Hatali Giris Sistem Kapatılıyor");
		  System.exit(0);
	}
	
	
}



public int getSifre() {
	return sifre;
}
public void setSifre(int sifre) {
	this.sifre = sifre;
}
}
