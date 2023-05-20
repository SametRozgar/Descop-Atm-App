package YeniBaşlangıç;
import java.util.Scanner;

public class EğitimVeSınavÖdemeleri {
	ResmiÖdemeler nesne15=new ResmiÖdemeler();
	public EğitimVeSınavÖdemeleri(int ogrenciNumarasi, String ogretimTipi) {
		super();
		this.ogrenciNumarasi = ogrenciNumarasi;
		this.ogretimTipi = ogretimTipi;
	}

	int ogrenciNumarasi;
	String ogretimTipi;
	
	public void EgitimOdemesi()
	{
		 ÜniversiteHarcVeSınavÖdemeleri nesne12=new  ÜniversiteHarcVeSınavÖdemeleri();
		 MebOdemeleri nesne13=new MebOdemeleri();
		Scanner egitimSecim=new Scanner(System.in);
		        System.out.println("1---Üniversite Harc Ve Sınav Ödemeleri---");
	                System.out.println("2---MEB Ödemeleri---");
	                  
	             
	            System.out.println("lütfen yapmak istediğiniz islemi seciniz");
	            int egitimlist=egitimSecim.nextInt();
	            if(egitimlist==1)
	    		{
	    			nesne12.ogrenciNo();
	    			nesne12.kisiselBilgiler();
	    			nesne12.borcOde();
	    			
	    		}
	    		else if(egitimlist==2)
	    		{
	    			nesne13.ogrenciNo();
	    			nesne13.kisiselBilgiler();
	    			nesne13.borcOde();
	    		}
	    		
	    		else
	    		{
	    			System.out.println("hatali tuslama yaptiniz Menuye Yonlendirliyorsunuz.....");
	    			nesne15.secimList();
	    		}
	}
}
