package tr.medipol.edu.yazilimaraclari.KaramanogluMehmetbeyUniApi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.springframework.boot.test.context.SpringBootTest;

import io.micrometer.core.ipc.http.HttpSender.Response;

@SpringBootTest
class KaramanogluMehmetbeyUniApiApplicationTests {

	@Test
	public void dersListeleTest() throws IOException {
		// Given
		URL url = new URL("/ders/listele");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		
		// When
		int responseCode = con.getResponseCode();
	
		// Then
		assertEquals(200, responseCode);
	}
	
	@Test
	public void dersEkleTest() {
		int eskiSayi = DersApi.Derslistele().size();
		
		Ders denemeDers = new Ders("Deneme Dersi", "DNM101");
		DersApi.DersEkle(denemeDers);
		
		int yeniSayi = DersApi.Derslistele().size();
		
		int sonuc = (yeniSayi - eskiSayi);
		
		assertEquals(1, sonuc);
		
	}
	
	@Test
	public void dersSilTest() {
		int eskiSayi = DersApi.Derslistele().size();
		
		Ders silinecekDers = new Ders("Muhendislik Temelleri", "MUH101");
		DersApi.DersSil(silinecekDers);
		
		int yeniSayi = DersApi.Derslistele().size();
		int sonuc = (eskiSayi - yeniSayi);
		
		assertEquals(1, sonuc);

	}

}
