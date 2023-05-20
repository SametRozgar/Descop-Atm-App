package YeniBaşlangıç;

public class VergiOdeme extends VergilerVeResmiKurumlar {
	 giris_Ekranı basaDöndür=new  giris_Ekranı();
	VergilerVeResmiKurumlar nesne4=new VergilerVeResmiKurumlar(getTc(), getAdSoyad(), getDogumTarihi());
public void bilgiGoster()
{
	System.out.println("Vergi Borç Sahibi="+getAdSoyad());
	System.out.println("Tc Kimlik Numarasi="+getTc());
	System.out.println("Vergi Borcunuz Bulunmamaktadır");
	basaDöndür.main(null);
}

public VergiOdeme(String tc, String adSoyad, int dogumTarihi) {
	super(tc, adSoyad, dogumTarihi);
	
}





}
