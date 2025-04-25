package org.example.canteen2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.canteen2.Controllers.ControllerNames;
import org.example.canteen2.Controllers.SceneControllerPairs;
import org.example.canteen2.Models.Account;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class HelloApplication extends Application {
    private static Collection<SceneControllerPairs> scenes = new ArrayList<>();
    private static Stage primaryStageHolder = null;

    @Override
    public void start(Stage stage) throws IOException {
        primaryStageHolder = stage;

        //Loads our LoginView.fxml as our first Scene
        FXMLLoader LoginViewLoader = new FXMLLoader(getClass().getResource("LoginView.fxml"));
        Parent LoginViewPane = LoginViewLoader.load();
        Scene overViewScene = new Scene(LoginViewPane, 800, 600);

        //Adds out scenes to the UI when needed
        scenes.add(new SceneControllerPairs(
                new Lazy<>(() -> buildScene("LoginView.fxml")),
                ControllerNames.LoginView
        ));

        scenes.add(new SceneControllerPairs(
                new Lazy<>(() -> buildScene("MenuView.fxml")),
                ControllerNames.MenuView
        ));

        scenes.add(new SceneControllerPairs(
                new Lazy<>(() -> buildScene("ChoosePaymentView.fxml")),
                ControllerNames.PaymentView
        ));


        stage.setTitle("Green Canteen");
        stage.setScene(overViewScene);
        stage.show();




    }

    /**
     * changes between the different Scenes
     * @param sceneName What scene is chosen from our enum list
     */
    public static void changeScene(ControllerNames sceneName) {
        primaryStageHolder.setTitle(sceneName.toString());

        for (SceneControllerPairs sceneCtrlNamePair : scenes) {
            if (sceneCtrlNamePair.getName().equals(sceneName)) {
                primaryStageHolder.setScene(sceneCtrlNamePair.getScene());
            }
        }
    }

    /**
     * Loads and builds the scenes from our fxml-files.
     * @param resource the path to the FXML file.
     * @return the constructed Scene from on the FXML file or null in non found.
     */
    private Scene buildScene(String resource) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(resource));
            Parent root = loader.load();
            Scene scene = new Scene(root, 800, 600);
            return scene;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    public static void main(String[] args) {
        Account account = new Account(0.0 , 1111);
        account.checkBalance();
        account.updateBalance(500.0);
        System.out.println("Balance after update: " + account.getBalance());

        launch();
    }
}