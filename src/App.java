import javafx.application.Application;
import javafx.stage.Stage;

public class App {
	
	
	public static void main(String[] args) {
		
		IPaiementStrategy ip;
		 double prix=2;
		 int qu=2;
		
		System.out.println("------carte-------");
		ip=new PaiementCarte();
		System.out.println(ip.payer(prix, qu));
		System.out.println("-------------");
		
		ip=new PaiementChique();
		System.out.println(ip.payer(prix, qu));
		System.out.println("-------------");
		
		ip=new PaimentPaypal();
		System.out.println(ip.payer(prix, qu));
	
		
		
	}


	
	

}
