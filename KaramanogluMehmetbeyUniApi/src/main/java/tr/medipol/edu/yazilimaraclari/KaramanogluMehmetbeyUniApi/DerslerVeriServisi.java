package tr.medipol.edu.yazilimaraclari.KaramanogluMehmetbeyUniApi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DerslerVeriServisi {
	
	private static List<Ders> DERSLER = new ArrayList<>();
	
	static {
		DERSLER.add(new Ders("Matematik1", "MAT101"));
		DERSLER.add(new Ders("Fizik1", "FIZ101"));
		DERSLER.add(new Ders("Muhendislik Temelleri", "MUH101"));
		DERSLER.add(new Ders("Ingilizce 1", "ING101"));
		DERSLER.add(new Ders("Veri Yapilari", "VPI101"));
		DERSLER.add(new Ders("Web Programlama", "WEB101"));
	}
	
	
	
	public static List<Ders> dersleriGetir() {
		return DERSLER;
	}
	
	public static void dersEkle(Ders ders) {
		DERSLER.add(ders);
	}
	
	public static void dersSil (Ders ders) { 	
		Iterator<Ders> itr = DERSLER.iterator();
		while (itr.hasNext()){
		   Ders ci_itr = itr.next();
		   if (ci_itr.getDersKodu().equals(ders.getDersKodu())){
		      itr.remove();
		      return;
		    }
	
		}	
	}	
}
