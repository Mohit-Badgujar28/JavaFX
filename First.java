import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class First extends Application {

    public static void main(String[] mohit){
        launch(mohit);

    }
    public void start(Stage primaryStage)throws Exception {
        Button button=new Button("Say, hello World");
        StackPane root=new StackPane(button);
        Scene scene=new Scene(root,600,400);
        primaryStage.setScene(scene);
        primaryStage.show();

        button.setOnAction(new EventHandler<ActionEvent>() {
            
            public void handle(ActionEvent arg){
                System.out.println("Hellow World");
            }
        });
    }

}
