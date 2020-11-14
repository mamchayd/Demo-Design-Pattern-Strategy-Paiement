
public class PaiementCarte implements IPaiementStrategy{
	
	private static double  reduction=0.1;

	@Override
	public double payer(double prix, int quantite) {
		
		return prix*quantite*reduction;
	}

}
