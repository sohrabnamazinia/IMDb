package show;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class About {
    public static void about()
    {
        Stage window = new Stage();
        window.setTitle("Description");
        Label text = new Label("this Application handles one specefic part of the site \"IMDb\".\n" +
                "this part consists of the top 250 movies. this application has gathered information about these movies together.\n" +
                "you just need to click on the movie that you want to check its details.these details consists of the name of the movie, its rating, release date, rank, director, stars, etc.\n" +
                "hope you enjoy it!\n" +
                "Creator : Sohrab Namazi nia");
        text.setTextFill(Color.DARKBLUE);
        Button close = new Button("Close");
        BackgroundFill backgroundColor = new BackgroundFill(Color.LIGHTBLUE, CornerRadii.EMPTY, Insets.EMPTY);
        Background background = new Background(backgroundColor);
        BackgroundFill backgroundColorButton = new BackgroundFill(Color.DARKBLUE, CornerRadii.EMPTY, Insets.EMPTY);
        Background backgroundButton = new Background(backgroundColorButton);
        close.setBackground(backgroundButton);
        close.setOnAction(e -> window.close());
        close.setTextFill(Color.LIGHTBLUE);
        close.setTranslateX(3);
        close.setTranslateY(30);
        StackPane layout = new StackPane();
        layout.setBackground(background);
        layout.setPadding(new Insets(10,10,10,10));
        layout.getChildren().addAll(text, close);
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.setResizable(false);
        window.show();
    }
}
