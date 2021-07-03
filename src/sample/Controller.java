package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;
import java.util.prefs.Preferences;

public class Controller {
    private final Runtime r = Runtime.getRuntime();
    private final Preferences prefs = Preferences.userNodeForPackage(Main.class);
    private final String defaultValue = "default string";
    private final String PREF_NAME = "pass";
    private String propertyValue;
    @FXML
    Button btnOK;
    @FXML
    TextField tfPass;
    @FXML
    CheckMenuItem miEditPass;
    @FXML
    CheckMenuItem cbHold;
    @FXML
    MenuItem miInstall;

    public void btnOKA() {
        String newValue = tfPass.getText();
        if (null != tfPass.getText()) {
            prefs.put(PREF_NAME, newValue);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Set Password");
            alert.setHeaderText("The password is set ok.");
            alert.setContentText("");
            alert.showAndWait();
            if (miEditPass.isSelected()) {
                miEditPass.setSelected(false);
                tfPass.setText("");
                tfPass.setDisable(true);
                btnOK.setDisable(true);
            }
        }
    }

    public void miCloseA() {
        Platform.exit();
    }

    public void miEditPassA() {
        if (miEditPass.isSelected()) {
            tfPass.setDisable(false);
            btnOK.setDisable(false);
        } else {
            tfPass.setDisable(true);
            btnOK.setDisable(true);
        }
    }

    public void miShowPassA() {
        propertyValue = prefs.get(PREF_NAME, defaultValue);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Password");
        alert.setHeaderText("Password:");
        alert.setContentText(propertyValue);
        DialogPane dp = alert.getDialogPane();
        dp.setStyle("-fx-background-color: greenyellow;");
        alert.showAndWait();
    }

    public void miContentsA() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Help");
        alert.setHeaderText("Linux com");
        alert.setContentText("???");
        DialogPane dp = alert.getDialogPane();
        dp.setStyle("-fx-background-color: greenyellow;");
        alert.showAndWait();
    }

    public void miAboutA() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("About");
        alert.setHeaderText("Linux com v1.6");
        alert.setContentText("Development: Stark C.");
        DialogPane dp = alert.getDialogPane();
        dp.setStyle("-fx-background-color: greenyellow;");
        alert.showAndWait();
    }

    public void btnUpgradeA() {
        propertyValue = prefs.get(PREF_NAME, defaultValue);
        String myScript = "echo " + propertyValue + " | sudo -S apt-get -y upgrade";
        String[] cmdArray = {"xterm", "-hold", "-e", myScript};
        String[] cmdArray2 = {"xterm", "-e", myScript};

        execR(cmdArray, cmdArray2);
    }

    public void btnUpdateA() {
        propertyValue = prefs.get(PREF_NAME, defaultValue);
        String myScript = "echo " + propertyValue + " | sudo -S apt-get -y update";
        String[] cmdArray = {"xterm", "-hold", "-e", myScript};
        String[] cmdArray2 = {"xterm", "-e", myScript};

        execR(cmdArray, cmdArray2);
    }

    public void btnDistUpgA() {
        propertyValue = prefs.get(PREF_NAME, defaultValue);
        String myScript = "echo " + propertyValue + " | sudo -S apt-get -y dist-upgrade -f";
        String[] cmdArray = {"xterm", "-hold", "-e", myScript};
        String[] cmdArray2 = {"xterm", "-e", myScript};

        execR(cmdArray, cmdArray2);
    }

    public void btnAutoremoveA() {
        propertyValue = prefs.get(PREF_NAME, defaultValue);
        String myScript = "echo " + propertyValue + " | sudo -S apt-get -y autoremove";
        String[] cmdArray = {"xterm", "-hold", "-e", myScript};
        String[] cmdArray2 = {"xterm", "-e", myScript};

        execR(cmdArray, cmdArray2);
    }

    private void execR(String[] cmdArray, String[] cmdArray2) {
        try {
            if (cbHold.isSelected()) {
                r.exec(cmdArray).waitFor();
            } else {
                r.exec(cmdArray2).waitFor();
            }
        } catch (InterruptedException | IOException e1) {
            e1.printStackTrace();
        }
    }

    public void btnCleanA() {
        propertyValue = prefs.get(PREF_NAME, defaultValue);
        String myScript = "echo " + propertyValue + " | sudo -S apt-get -y autoclean";
        String[] cmdArray = {"xterm", "-hold", "-e", myScript};
        String[] cmdArray2 = {"xterm", "-e", myScript};

        execR(cmdArray, cmdArray2);
    }

    public void miInstallA(ActionEvent ae) throws IOException {
        if (ae.getSource() == miInstall) {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("app.fxml")));
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.getIcons().add(new Image(Objects.requireNonNull(Main.class.getResourceAsStream("icon.png"))));
            stage.setResizable(false);
            stage.show();
        }
    }

    public void btnAllComA() {
        propertyValue = prefs.get(PREF_NAME, defaultValue);
        String myScript = "echo " + propertyValue + " | sudo -S apt-get -y upgrade && sudo apt-get -y update && " +
                "sudo apt-get -y dist-upgrade -f && sudo apt-get -y autoremove && sudo apt-get -y autoclean";
        String[] cmdArray = {"xterm", "-hold", "-e", myScript};
        String[] cmdArray2 = {"xterm", "-e", myScript};

        execR(cmdArray, cmdArray2);
    }
}
