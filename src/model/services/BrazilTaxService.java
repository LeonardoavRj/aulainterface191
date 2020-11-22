package model.services;

public class BrazilTaxService implements TaxService{
	
	public double tax(double amont) {
		if(amont <= 100.0) {
			return amont * 0.2;
		}
		else {
			return amont * 0.15;
		}
	}
}
