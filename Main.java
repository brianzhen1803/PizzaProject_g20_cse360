import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

	Stage window;
	Scene homeSceen, scene2;
	public static void main(String[] args) {
		
		launch(args);
	}
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		
		BorderPane homeRoot = new BorderPane();
		
		homeRoot.setTop(homeHBox());
		homeRoot.setCenter(homeVBox());
		
		Scene homeScene = new Scene(homeRoot, 300, 200);
		
		window.setScene(homeScene);
		window.setTitle("Sun Devil Pizza");
		window.show();
	}
	


public HBox homeHBox() {
	  HBox hbox = new HBox();
	  hbox.setStyle("-fx-background-color: #8b0000;");
	  Button orderNow = new Button("Order Now");
	  orderNow.setPrefSize(100, 20);
		
	  hbox.getChildren().add(orderNow);
	
	return hbox;
}

public VBox homeVBox() {
	 VBox vbox = new VBox();
	 vbox.setSpacing(20);
	 Text title = new Text("Welcome to Sun Devil Pizza!");
	 Text text = new Text("Click Order Now in the top right to get started");
	 
	 vbox.getChildren().addAll(title, text);
		
	
	return vbox;
}

}