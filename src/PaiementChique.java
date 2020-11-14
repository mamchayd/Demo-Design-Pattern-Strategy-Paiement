
public class PaiementChique implements IPaiementStrategy {
	private static double  reduction=0.3;

	@Override
	public double payer(double prix, int quantite) {
		// TODO Auto-generated method stub
		return prix*quantite*reduction;
	}

}
