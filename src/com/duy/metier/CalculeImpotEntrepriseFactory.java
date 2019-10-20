package com.duy.metier;

import com.duy.bean.AutoEntreprise;
import com.duy.bean.Entreprise;
import com.duy.bean.SasEntreprise;

public class CalculeImpotEntrepriseFactory {
	
	public static CalculImpotEntreprise getImpotEntrepriseCalculator(Entreprise entreprise){
		
		if(entreprise instanceof AutoEntreprise) {
			return new CalculImportAutoEntreprise();
		}
		if(entreprise instanceof SasEntreprise) {
			return new CalculImportSasEntreprise();
		}
		
		return null;
	}
}
