package Screen;
import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SceneDemo extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'start'");

        BorderPane root = new BorderPane();

        Scene scene =new Scene(root,400,300,Color.RED);
        scene.setCursor(Cursor.CLOSED_HAND);
        stage.setScene(scene);

        stage.show();
    }
    public static void main(String[] args){

        launch(args);

    }
    
}
