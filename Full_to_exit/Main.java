package Full_to_exit;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args){

        launch(args);
        
    }

    @Override
    public void start(Stage stage) throws Exception {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'start'");
        Group root=new Group(); 
        
        Scene scene=new Scene(root);
        stage.setScene(scene);
       
        stage.setTitle("This is My some Title");
        //Image image=new Image(E:\mohit backup\Pictures\Saved Pictures);
        //stage.getIcons().add(image);
        stage.setWidth(500);
        stage.setHeight(500);
        stage.setX(50);
        stage.setY(50);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("Press E to Exit Full Screen");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("E"));


        stage.show();
    }
    
}
