package mymemory;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import mymemory.view.MyMemoryview;

public class Main extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        MyMemoryview myMemoryview = new MyMemoryview();
        Scene scene = new Scene(myMemoryview);

        stage.setScene(scene);
        stage.setTitle("Memory");
        stage.setWidth(1000);
        stage.setHeight(1000);
        stage.setMinWidth(400);
        stage.setMinHeight(500);
        stage.show();
    }
}
