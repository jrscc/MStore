package View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

	public class SceneBuilderJanelaPagamento extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage primaryStage)throws Exception{
		
		Parent root = FXMLLoader.load(getClass().getResource("TelaPagamento.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("MStore");
		primaryStage.initModality(Modality.APPLICATION_MODAL);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}