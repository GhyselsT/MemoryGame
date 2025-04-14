package mymemory.view;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;

public class MenuSubview extends MenuBar {
    private MenuItem easy;
    private MenuItem medium;
    private MenuItem hard;
    private MenuItem exit;
    private MenuItem highscores;

    public MenuSubview() {
        initialiseNodes();
        layoutNodes();
    }

    private void layoutNodes() {
        final Menu gamemode = new Menu("Gamemodes");
        final Menu settings = new Menu("Settings");
        gamemode.getItems().addAll(this.easy,this.medium,this.hard);
        settings.getItems().addAll(this.exit,this.highscores);
        this.getMenus().addAll(settings,gamemode);
        this.setBackground(Background.fill(Color.rgb(215, 253, 240)));
    }

    private void initialiseNodes() {
        this.easy = new MenuItem("Easy");
        this.medium = new MenuItem("Medium");
        this.hard = new MenuItem("Hard");
        this.exit = new MenuItem("Exit");
        this.highscores = new MenuItem("HighScores");


    }

    public MenuItem getEasy() {
        return easy;
    }

    public MenuItem getMedium() {
        return medium;
    }

    public MenuItem getHard() {
        return hard;
    }

    public MenuItem getExit() {
        return exit;
    }

    public MenuItem getHighscores() {
        return highscores;
    }
}
