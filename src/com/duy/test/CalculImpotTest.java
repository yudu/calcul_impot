package com.duy.test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import com.duy.bean.AutoEntreprise;
import com.duy.bean.Entreprise;
import com.duy.bean.SasEntreprise;
import com.duy.service.CalculImpot;

public class CalculImpotTest {

Set<Entreprise> entrepriseSet;
	
	private CalculImpot calculImport;
	
	@Before
	public void setUp() {
		calculImport = new CalculImpot(generateEntreprises());
	}
	
	private Set<Entreprise> generateEntreprises() {
		
		Set<Entreprise> entrepriseSet = new HashSet<Entreprise>();
		
		Entreprise e1 = new AutoEntreprise();
		e1.setNoSiret("602036444");
		e1.setDenomination("Accor");
		e1.setCa(3610000.0);
		entrepriseSet.add(e1);
		
		Entreprise e2 = new SasEntreprise();
		e2.setNoSiret("529957482");
		e2.setDenomination("CEETIZ");
		e2.setCa(3025844.0);
		entrepriseSet.add(e2);
		
		return entrepriseSet;
	}
	
	@Test
	public void testCalcul() {
		assertNotEquals(calculImport.calcule(), 0.0); 
	}


}
