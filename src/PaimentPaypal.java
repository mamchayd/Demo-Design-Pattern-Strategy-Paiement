
public class PaimentPaypal implements IPaiementStrategy {
	
	private static double  reduction=0.2;

	@Override
	public double payer(double prix, int quantite) {
		
		return prix*quantite*reduction;
	}

}
