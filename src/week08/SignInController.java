package week08;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class SignInController {
    @FXML
    private Button enterButton;
    @FXML
    private Label message;

    public SignInController() {

    }

    public void initialize() {
        enterButton.setOnAction(event -> {
            message.setText("Welcome to my application!");
        });
    }
}
