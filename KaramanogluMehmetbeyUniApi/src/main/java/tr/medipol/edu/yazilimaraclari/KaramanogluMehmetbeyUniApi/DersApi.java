package tr.medipol.edu.yazilimaraclari.KaramanogluMehmetbeyUniApi;

import java.util.*;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ders")
public class DersApi {
	
	@GetMapping("/listele")
	public static List<Ders> Derslistele() {
		return DerslerVeriServisi.dersleriGetir();
	}
	
	@PostMapping("/ekle")
	public static Ders DersEkle(@RequestBody Ders ders) {
		DerslerVeriServisi.dersEkle(ders);
		return ders;
	}
	
	@DeleteMapping("/sil")
	public static Ders DersSil(@RequestBody Ders ders) {
		DerslerVeriServisi.dersSil(ders);
		return ders;
	}
	
}
