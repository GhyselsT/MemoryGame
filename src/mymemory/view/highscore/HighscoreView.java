package mymemory.view.highscore;

import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import mymemory.model.Highscore;

public class HighscoreView extends BorderPane {
    private ListView<Highscore> highscoreListView;

    public HighscoreView() {
        initialiseNodes();
        layoutNodes();
    }

    private void initialiseNodes() {
        highscoreListView = new ListView<>();
    }
    private void layoutNodes() {
        this.setCenter(highscoreListView);
    }

    public ListView<Highscore> getHighscoreListView() {
        return highscoreListView;
    }
}

