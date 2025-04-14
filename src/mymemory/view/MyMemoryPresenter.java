package mymemory.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import mymemory.view.highscore.HighscoreView;

public class MyMemoryPresenter {
    private MyMemoryview view;

    public MyMemoryPresenter(MyMemoryview view) {
        this.view = view;
        addEventHandlers();
        updateView();
    }

    private void updateView() {
    }

    private void addEventHandlers() {
        view.getMenuSubview().getExit().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
        view.getMenuSubview().getHighscores().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                HighscoreView highscoreView = new HighscoreView();
                //HighscorePresenter highscorePresenter = new HighscorePresenter(world,highscoreView);
                Stage newStage = new Stage();
                newStage.setScene(new Scene(highscoreView));
                newStage.initOwner(view.getScene().getWindow());
                //newStage.initModality(Modality.APPLICATION_MODAL);
                newStage.showAndWait();
            }
        });

        
    }
}
