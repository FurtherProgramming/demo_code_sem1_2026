package week08;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

public class MyFirstApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Button button = new Button("Click me to reveal the second stage");
        Scene scene = new Scene(button, 300, 300);
        stage.setScene(scene);
        stage.show();
//        stage.close();
        button.setOnAction(event -> {
            Stage secondStage = new Stage();
            secondStage.setTitle("This is the second stage");
            Scene secondScene = new Scene(new PasswordField(), 200, 200);
            secondStage.setScene(secondScene);
            secondStage.showAndWait();
        });



        Stage thirdStage = new Stage();
        thirdStage.setTitle("Message");
        Scene thirdScene = new Scene(new Label("Thanks for completing your order"), 200, 200);
        thirdStage.setScene(thirdScene);
        thirdStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
