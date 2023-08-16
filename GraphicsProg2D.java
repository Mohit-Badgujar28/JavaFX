import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.shape.*;    // import all shape class

public class GraphicsProg2D extends Application {

    public void start(Stage primaryStage){
        Group root=new Group();

      /*   Drow Text

        Text text= new Text();
        text.setText("Welcome");  // text 
        text.setX(300);
        text.setY(300);
        text.setFont(Font.font("Times New Roman",60));  // text font , font size
        text.setFill(Color.RED);  // text color
        text.setStroke(Color.BLACK);   // Border color
        text.setStrokeWidth(.5);  // Border Width size
        text.setStrikethrough(true);  // line on text or not     
        
        root.getChildren().add(text);   */

        /*       Drow Line....

        Line line=new Line();   // line object

        line.setStartX(100);
        line.setStartY(100);
        line.setEndX(200);
        line.setEndY(200);
        line.setStrokeWidth(5);  // change thickness
        line.setStroke(Color.RED);    // change color
        line.setOpacity(0.5);   // create transperent line

        root.getChildren().add(line);  // add line in root       */

        /*           Rectangle....

        Rectangle rectangle=new Rectangle();  // Rectangle class

        rectangle.setX(100);  // change position
        rectangle.setY(100);  /// change position
        rectangle.setWidth(200);  // Rectangle Width
        rectangle.setHeight(100);   // Rectangle Height
        rectangle.setFill(Color.YELLOW);   // Rectangle Fill Color
        rectangle.setStroke(Color.RED);    // Rectangle Border Color
        rectangle.setStrokeWidth(5);  // Width change
        rectangle.setArcWidth(20);  // Arc change (rounded corner)
        rectangle.setArcHeight(20);  // Arc change (rounded corner)

        root.getChildren().add(rectangle);         */


        /*                // Triangle...

        Polygon polygon=new Polygon(100,200,300,200,200,100);  // Triangle class

        polygon.setFill(Color.GREEN);  // Triangle fill color
        polygon.setStroke(Color.YELLOW);  // Triangle border color
        polygon.setStrokeWidth(5);  // Triangle border Width size

        root.getChildren().add(polygon);        

                        // open area triangle..
        Polyline polyline=new Polyline(100,400,300,400,400,100);  // Triangle class

        polygon.setFill(Color.GREEN);  // Triangle fill color
        polygon.setStroke(Color.YELLOW);  // Triangle border color
        polygon.setStrokeWidth(5);  // Triangle border Width size

        root.getChildren().add(polyline);           */

     /*              Circle ....

        Circle circle=new Circle();     // Circle class
        circle.setCenterX(200);    // 
        circle.setCenterY(200);
        circle.setRadius(100);     // circle Radius
        circle.setFill(Color.PINK);   // circle color
        circle.setStroke(Color.BLACK);   // circle border color
        circle.setStrokeWidth(3);    // circle border width

        root.getChildren().add(circle);   */

        /*         Ellipse...   

        Ellipse ellipse=new Ellipse();
        ellipse.setCenterX(300);    // ellipse center
        ellipse.setCenterY(200);
        ellipse.setRadiusX(200);  // 
        ellipse.setRadiusY(100);     // ellipse Radius
        ellipse.setFill(Color.PINK);   // ellipse color
        ellipse.setStroke(Color.BLACK);   // ellipse border color
        ellipse.setStrokeWidth(3); 

        root.getChildren().add(ellipse);       */

        //        Arc...    

        Arc arc=new Arc();
        arc.setCenterX(100);
        arc.setCenterY(500);
        arc.setRadiusX(300);
        arc.setRadiusY(500);
        arc.setStartAngle(10);
        arc.setLength(60);
        arc.setFill(Color.PINK);   // ellipse color
        arc.setStroke(Color.BLACK);   // ellipse border color
        arc.setStrokeWidth(3);
        arc.setType(ArcType.OPEN);
        arc.setType(ArcType.CHORD);
        arc.setType(ArcType.ROUND);

        root.getChildren().add(arc);       


       

        Scene scene=new Scene(root,800,600,Color.WHITE);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setTitle("Graphics Programming");


    }
    




    public static void main(String[] args){

    launch(args);
    
}

}