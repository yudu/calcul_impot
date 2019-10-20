package com.duy.metier;

import com.duy.bean.Entreprise;

public class CalculImportSasEntreprise implements CalculImpotEntreprise {
	
	@Override
	public Double calculeImpotEntreprise(Entreprise entreprise) {

		Double ca = entreprise.getCa();
		Double impot = ca * 0.33;
		printInfo(entreprise, impot);
		return impot;
	}
	
	@Override
	public void printInfo(Entreprise entreprise, Double impot) {
		StringBuilder sb = new StringBuilder();
		sb.append("SAS  Entreprise : ").append(entreprise.getNoSiret()).append(" / ").append(entreprise.getDenomination()).append(" : ").append(FORMATTER.format(impot));
		System.out.println(sb.toString());
	}

}
