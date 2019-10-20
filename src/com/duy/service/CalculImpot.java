package com.duy.service;

import java.util.Set;

import com.duy.bean.AutoEntreprise;
import com.duy.bean.Entreprise;
import com.duy.bean.SasEntreprise;
import com.duy.metier.CalculImportAutoEntreprise;
import com.duy.metier.CalculImpotEntreprise;
import com.duy.metier.CalculeImpotEntrepriseFactory;
/**
 * Calcul impôt
 * @author duy
 *
 */
public class CalculImpot {

	Set<Entreprise> entrepriseSet;
	
	CalculImpotEntreprise calculator;
	
	public CalculImpot(Set<Entreprise> entrepriseSet) {
		this.entrepriseSet = entrepriseSet;
		calculator = new CalculImportAutoEntreprise();
	};
	
	public Double calcule() {
		
		if(!entrepriseSet.isEmpty()) {
			//Vu la volume du nombre d'entreprise, parallelStream() pourrait être plus performent que stream()
			return entrepriseSet.parallelStream()
					 .filter(x -> x.getCa() > 0.0 && (x instanceof AutoEntreprise || x instanceof SasEntreprise))
					 .mapToDouble(e -> CalculeImpotEntrepriseFactory.getImpotEntrepriseCalculator(e).calculeImpotEntreprise(e))
					 .sum();
						 
		}
		
		System.out.println("Non entreprise existe !");
		return 0.0;
	}
}
