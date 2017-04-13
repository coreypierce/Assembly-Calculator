import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ErrorMessage {
	static boolean answer;
	public static boolean display(String title, String message){
		Stage window = new Stage();
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle("File Created");
		window.setMinWidth(250);
		Label label = new Label();
		label.setText(message);
		
		//create two buttons 
		Button okButton = new Button("Try Again!");
		
		okButton.setOnAction(e -> {
			answer = true;
			window.close();
		});
		
		VBox layout = new VBox(10);
		layout.getChildren().addAll(label,okButton);
		layout.setAlignment(Pos.CENTER);
		Scene scene = new Scene(layout);
		window.setScene(scene);
		window.showAndWait();
		
		return answer;
	}
	
	
}

