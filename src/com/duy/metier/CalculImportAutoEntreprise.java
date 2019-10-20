package com.duy.metier;

import com.duy.bean.Entreprise;

public class CalculImportAutoEntreprise implements CalculImpotEntreprise {

	@Override
	public Double calculeImpotEntreprise(Entreprise entreprise) {
		
		Double ca = entreprise.getCa();
		Double impot = ca * 0.25;
		printInfo(entreprise, impot);
		return impot;
	}

	@Override
	public void printInfo(Entreprise entreprise, Double impot) {
		StringBuilder sb = new StringBuilder();
		sb.append("Auto Entreprise : ").append(entreprise.getNoSiret()).append(" / ").append(entreprise.getDenomination()).append(" : ").append(FORMATTER.format(impot));
		System.out.println(sb.toString());
	}

}
