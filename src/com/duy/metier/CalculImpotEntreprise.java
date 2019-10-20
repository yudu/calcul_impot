package com.duy.metier;

import com.duy.bean.Entreprise;

public interface CalculImpotEntreprise extends Calcul {
	
	public Double calculeImpotEntreprise(Entreprise entreprise);
	
	public void printInfo(Entreprise entreprise, Double impot);
}
