package mymemory.view;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;

public class MyMemoryview extends BorderPane {
    private MenuSubview menuSubview;
    private final static int WIDTH = 5;
    private final static int HEIGHT = 2;
    private Button[][] buttons;

    public MyMemoryview() {
        initialiseNodes();
        layoutNodes();
    }



    private void initialiseNodes() {
        // Init Menuitems
        menuSubview = new MenuSubview();


        Image picture = new Image("file:../resources/back_of_card.png");
        this.buttons = new Button[WIDTH][HEIGHT];
        for (int i = 0; i < WIDTH ; i++) {
            for (int j = 0; j <HEIGHT ; j++) {
                ImageView imageView = new ImageView(picture);
                buttons[i][j] = new Button();
                buttons[i][j].setGraphic(imageView);
                buttons[i][j].setBackground(Background.fill(Color.rgb(180,214,211)));
            }
        }
    }
    private void layoutNodes() {
        //background
        setBackground(Background.fill(Color.rgb(73,81,89)));

        //top layout
        setTop(menuSubview);


        GridPane gpCenter = new GridPane();
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                buttons[i][j].setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
                gpCenter.add(buttons[i][j], i, j);
                GridPane.setHgrow(buttons[i][j], Priority.ALWAYS);
                GridPane.setVgrow(buttons[i][j], Priority.ALWAYS);
            }
        }
        gpCenter.setHgap(10);
        gpCenter.setVgap(10);
        setCenter(gpCenter);
        BorderPane.setMargin(gpCenter, new Insets(10));
    }

    public MenuSubview getMenuSubview() {
        return menuSubview;
    }
}
