import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application{
	
	IPaiementStrategy ip;
	double prix;
	int quantite;
	double prixTotal;
	public static void main(String[] args) {
		
		/*IPaiementStrategy ip;
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
	
		*/
		Application.launch(args); 
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Label lblprix=new Label("Prix");
		Label lblQuantite=new Label("Quantite");
		Label lblTypePay=new Label("Type de Paiement");
		Label lblResultaPay=new Label();
		
		Label lblRreducCarte=new Label("* pour le paiement par carte reduction : 10% ");
		Label lblReductPaypal=new Label("* pour le paiement par paypal reduction : 20% ");
		Label lblReductChiq=new Label("* pour paiement par chique reduction : 30% ");
		
		TextField txtPrix=new TextField();
		TextField txtQuantite=new TextField();
		
		Button btnPayCart=new Button("Carte");
		Button btnPayChi=new Button("Chique");
		Button btnPAypal=new Button("PAypal");
		
		HBox hbxPrix=new HBox(45);
		hbxPrix.getChildren().addAll(lblprix,txtPrix);
		HBox hbxQuantite=new HBox(10);
		hbxQuantite.getChildren().addAll(lblQuantite,txtQuantite);
		HBox hbxbtn=new HBox(10);
		hbxbtn.getChildren().addAll(btnPayCart,btnPayChi,btnPAypal);
		
		btnPayCart.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				
				ip=new PaiementCarte();
				prix=Double.valueOf(txtPrix.getText());
				quantite=Integer.valueOf(txtQuantite.getText());
				prixTotal=ip.payer(prix, quantite);
				lblResultaPay.setText(prixTotal+"");
				
			}
		});
		
		btnPayChi.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				
				ip=new PaiementChique();
				prix=Double.valueOf(txtPrix.getText());
				quantite=Integer.valueOf(txtQuantite.getText());
				prixTotal=ip.payer(prix, quantite);
				lblResultaPay.setText(prixTotal+"");
				
			}
		});
		
		btnPAypal.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				
				ip=new PaimentPaypal();
				prix=Double.valueOf(txtPrix.getText());
				quantite=Integer.valueOf(txtQuantite.getText());
				prixTotal=ip.payer(prix, quantite);
				lblResultaPay.setText(prixTotal+"");
				
			}
		});
		
		
		HBox hbxPriTotal=new HBox();
		hbxPriTotal.getChildren().add(lblResultaPay);
		
		
		VBox vbxContent=new VBox(10);
		
		VBox vbxCondition=new VBox(10);
		vbxContent.getChildren().addAll(hbxPrix,hbxQuantite,hbxbtn,hbxPriTotal,vbxCondition);
		vbxCondition.getChildren().addAll(lblReductChiq,lblReductPaypal,lblRreducCarte);
		
		
		
		final Pane root = new Pane(); 
		root.getChildren().add(vbxContent);
		final Scene scene = new Scene(root, 350, 350); 
		primaryStage.setTitle("Demo Design pattern Strategy"); 
		primaryStage.setScene(scene); 
		primaryStage.show(); 
	}


	
	

}
