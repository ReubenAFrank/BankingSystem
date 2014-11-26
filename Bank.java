import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;


public class Bank extends Application{

@Override
    public void start(Stage primaryStage) {
    	GridPane grid = LoginScene.getDefaultLoginGridPane();
    	
        Scene scene = new Scene(grid, 300, 275);

        primaryStage.setTitle("DB Banking");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
    /*
     *Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        Scene scene = new Scene(grid, 300, 275);
        root.getChildren().add(btn);
     */
}
