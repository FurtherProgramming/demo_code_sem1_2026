package week09;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginViewController {
    @FXML
    private Button login;

    @FXML
    private TextField username;

    @FXML
    private PasswordField userPassword;

    @FXML
    private Label message;


    public void initialize() {
        login.setOnAction(event -> {
            String usernameEntered = username.getText();
            String passwordEntered = userPassword.getText();

            if(UserDao.findUser(usernameEntered, passwordEntered)) {
                message.setText("");
                Stage homeStage = new Stage();
                homeStage.setTitle("Dashboard");
                homeStage.show();

            }else{
                message.setText("Wrong username or password");
            }
        });

    }
}
