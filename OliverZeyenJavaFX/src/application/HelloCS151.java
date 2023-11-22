package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.StrokeType;
import javafx.stage.Stage;
/*
 * IMPORTANT: This one is just silly for fun I am having a good day
 */
public class HelloCS151 extends Application {
	public static int meanCounter;
	
	public static void main(String[] args) {
		HelloCS151.meanCounter = 0;
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Hello CS 151!");
		Button hi = new Button();
		Button notHi = new Button();
		hi.setText("Say 'Hello CS 151!'");
		hi.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				System.out.println("Thanks for saying hello CS 151!");
			}
		});
	
		notHi.setText("Don't say 'Hello CS 151' (Don't)");
		notHi.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if (meanCounter == 0) {
					System.out.println("WOW! Don't be so mean. Please say 'Hi'");
				}
				else if (meanCounter == 1) {
					System.out.println("Wow... Did I do something wrong?");
				}
				else if (meanCounter == 2) {
					System.out.println("You know we can talk things out...right?");
				}
				else if (meanCounter == 3) {
					System.out.println("Whatever... I guess... I was having a bad day but it's ok... I suppose...");
				}
				else {
					System.out.println("...");
				}
				HelloCS151.meanCounter++;
			}
		});
		StackPane root = new StackPane();
		root.getChildren().add(hi);
		root.getChildren().add(notHi);
		primaryStage.setScene(new Scene(root, 500, 250));
		
		Group circles = new Group();
		for (int i = 0; i < 15; i++) {
			Circle c = new Circle(250, Color.web("blue", 0.05));
			c.setStrokeType(StrokeType.OUTSIDE);
			c.setStroke(Color.web("blue", 0.05));
			c.setStrokeWidth(5);
			circles.getChildren().add(c);
		}
		primaryStage.show();
	}
}
