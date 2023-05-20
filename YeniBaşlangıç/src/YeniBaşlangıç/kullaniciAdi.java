package YeniBaşlangıç;

public class kullaniciAdi {
String isim;


public void isimkontrol(String isim)
{
	this.isim=isim;
	System.out.println("Hoşgeldiniz  "+isim);
}


public String getIsim() {
	return isim;
}


public void setIsim(String isim) {
	this.isim = isim;
}
}
