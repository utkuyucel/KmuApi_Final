package tr.medipol.edu.yazilimaraclari.KaramanogluMehmetbeyUniApi;

public class Ders {
	private String dersIsmi;
	private String dersKodu;
	
	public Ders(String dersIsmi, String dersKodu) {
		super();
		this.dersIsmi = dersIsmi;
		this.dersKodu = dersKodu;
	}

	public String getDersIsmi() {
		return dersIsmi;
	}

	public String getDersKodu() {
		return dersKodu;
	}
	
	

}
