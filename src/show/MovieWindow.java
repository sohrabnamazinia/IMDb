package show;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class MovieWindow
{
    static ArrayList<String> directors = new ArrayList<>();
    static ArrayList<String> imgURLs = new ArrayList<>();
    static ArrayList<String> titles = new ArrayList<>();
    static ArrayList<String> ratings = new ArrayList<>();
    static ArrayList<String> actores = new ArrayList<>();
    static ArrayList<String> dates = new ArrayList<>();
    static Font font = Font.font("vinet.ttf", 20);
    static void create (int i) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("Directors.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String director = line.substring(0, line.indexOf('(') -1);
                String actor = line.substring(line.indexOf(')') + 2);
                directors.add(director);
                actores.add(actor);
            }
        } catch (Exception e) {

        }
        try {
            BufferedReader br = new BufferedReader(new FileReader("Images.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                imgURLs.add(line);
            }
        } catch (Exception e) {

        }
        try {
            BufferedReader br = new BufferedReader(new FileReader("Movies.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String date = line.substring(line.indexOf('(') + 1, line.indexOf(')'));
                dates.add(date);
                titles.add(line);
            }
        } catch (Exception e) {
        }
        try {
            BufferedReader br = new BufferedReader(new FileReader("Rating.txt"));
            String rating;
            while ((rating = br.readLine()) != null) {
                ratings.add(rating);
            }
        } catch (Exception e) {

        }
            Stage window;
            window = new Stage();
            window.setTitle(titles.get(i).substring(titles.get(i).indexOf(".") + 1, titles.get(i).indexOf("(")));
            GridPane layout = new GridPane();
            layout.setPadding(new Insets(10, 10, 10, 10));
            layout.setVgap(8);
            layout.setHgap(8);
            Label title = new Label(titles.get(i).substring(titles.get(i).indexOf(".") + 1, titles.get(i).indexOf("(")));
            title.setTextFill(Color.DARKBLUE);
            title.setFont(font);
            ImageView photo = new ImageView(imgURLs.get(i));
            Label dir = new Label("Director : ");
            Label director = new Label(directors.get(i));
            Label rnk = new Label("Rank : ");
            Label rank = new Label(titles.get(i).substring(0,titles.get(i).indexOf('.')));
            Label rat = new Label("Rating : ");
            Label rating = new Label(ratings.get(i));
            Label strs = new Label("Stars : ");
            Label stars = new Label(actores.get(i));
            Label date = new Label("Release Date : ");
            Label releaseDate = new Label(dates.get(i));
            Button close = new Button("Close");
            close.setOnAction(e -> window.close());
            BackgroundFill bgColor = new BackgroundFill(Color.DARKBLUE, CornerRadii.EMPTY, Insets.EMPTY);
            Background backgroundClose = new Background(bgColor);
            dir.setTextFill(Color.DARKBLUE);
            rnk.setTextFill(Color.DARKBLUE);
            strs.setTextFill(Color.DARKBLUE);
            rat.setTextFill(Color.DARKBLUE);
            date.setTextFill(Color.DARKBLUE);
            director.setTextFill(Color.DARKGREEN);
            rank.setTextFill(Color.DARKGREEN);
            rating.setTextFill(Color.DARKGREEN);
            stars.setTextFill(Color.DARKGREEN);
            releaseDate.setTextFill(Color.DARKGREEN);
            close.setTextFill(Color.LIGHTBLUE);
            close.setBackground(backgroundClose);
            GridPane.setConstraints(title, 0, 0);
            GridPane.setConstraints(rnk, 0, 1);
            GridPane.setConstraints(rank, 1, 1);
            GridPane.setConstraints(rat, 0, 2);
            GridPane.setConstraints(rating, 1, 2);
            GridPane.setConstraints(dir, 0, 3);
            GridPane.setConstraints(director, 1, 3);
            GridPane.setConstraints(strs, 0, 4);
            GridPane.setConstraints(stars, 1, 4);
            GridPane.setConstraints(date, 0, 5);
            GridPane.setConstraints(releaseDate, 1, 5);
            GridPane.setConstraints(close, 1, 6);
            GridPane.setConstraints(photo, 0, 6);
            layout.getChildren().addAll(photo, title, dir, director, rnk, rank, rat, rating, strs, stars, date, releaseDate, close);
            window.setResizable(false);
            Scene scene = new Scene(layout);
            window.setScene(scene);
            BackgroundFill background_fill = new BackgroundFill(Color.LIGHTBLUE, CornerRadii.EMPTY, Insets.EMPTY);
            Background background = new Background(background_fill);
            layout.setBackground(background);
            window.show();

        }


    public static void main(String[] args) {

    }

}
