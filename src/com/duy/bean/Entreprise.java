package com.duy.bean;

import java.util.Objects;

public class Entreprise {

	String noSiret = "";
	
	String denomination = "";
	
	//CA en double
	Double ca = new Double(0);

	public String getNoSiret() {
		return noSiret;
	}

	public void setNoSiret(String noSiret) {
		this.noSiret = noSiret;
	}

	public String getDenomination() {
		return denomination;
	}

	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}

	public Double getCa() {
		return ca;
	}

	public void setCa(Double ca) {
		this.ca = ca;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ca, denomination, noSiret);
	}

	//Le numéro Siret est unique pour entreprise
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entreprise other = (Entreprise) obj;
		return noSiret.equalsIgnoreCase(other.noSiret);
	}
	
	
	
	
	
}
