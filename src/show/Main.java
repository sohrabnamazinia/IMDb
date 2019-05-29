/**
 * Sohrab Namazi nia
 * IUST
 */

package show;

import information.Directors;
import information.Images;
import information.Movies;
import information.Rating;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main extends Application
{
    static BackgroundFill backgroundButton = new BackgroundFill(Color.PINK, CornerRadii.EMPTY, Insets.EMPTY);
    static Background background = new Background(backgroundButton);
    static Button button;
    static ArrayList<String> lines = new ArrayList<>();
    public static void pageTwo() throws IOException
    {
        Stage window;
        FileReader fr = new FileReader("Movies.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null)
        {
            lines.add(line);
        }
        window = new Stage();
        window.setTitle("IMDb");
        GridPane layout = new GridPane();
        layout.setPadding(new Insets(5, 5, 5, 5));
        layout.setVgap(20);
        layout.setHgap(20);
        int j = 0;
        int k = 0;
        for (int i = 50; i < 101 ; i++)
        {
            String title = lines.get(i).substring(lines.get(i).indexOf(".") + 1, lines.get(i).indexOf("("));
            button.setBackground(background);
            button = new Button(title);
            button.setTextFill(Color.DARKBLUE);
            int finalI = i;
            button.setOnAction(e ->
            {
                MovieWindow.create(finalI);
            });
            GridPane.setConstraints(button, k, j);
            layout.getChildren().add(button);
            k++;
            if ((i-49) % 4 == 0)
            {
                j++;
                k = 0;
            }

        }

        button = new Button("Next Page");
        button.setTextFill(Color.DARKBLUE);
        button.setBackground(background);
        button.setOnAction(e ->
        {
            try {
                pageThree();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });
        GridPane.setConstraints(button, 2,12);
        layout.getChildren().add(button);
        button = new Button("Close");
        button.setTextFill(Color.DARKBLUE);
        button.setBackground(background);
        button.setOnAction(e -> window.close());
        GridPane.setConstraints(button, 3,12);
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 1100,600);
        window.setScene(scene);
        window.setResizable(false);
        BackgroundFill background_fill = new BackgroundFill(Color.DARKBLUE, CornerRadii.EMPTY, Insets.EMPTY);
        Background background = new Background(background_fill);
        layout.setBackground(background);
        window.show();

    }

    public static void pageThree() throws IOException {
        Stage window;
        ArrayList<String> lines = new ArrayList<>();
        FileReader fr = new FileReader("Movies.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null)
        {
            lines.add(line);
        }
        window = new Stage();
        window.setTitle("IMDb");
        GridPane layout = new GridPane();
        layout.setPadding(new Insets(5, 5, 5, 5));
        layout.setVgap(20);
        layout.setHgap(20);
        int j = 0;
        int k = 0;
        for (int i = 100; i < 150 ; i++)
        {
            String title = lines.get(i).substring(lines.get(i).indexOf(".") + 1, lines.get(i).indexOf("("));
            button = new Button(title);
            button.setTextFill(Color.DARKBLUE);
            button.setBackground(background);
            int finalI = i;
            button.setOnAction(e ->
            {
                MovieWindow.create(finalI);
            });
            GridPane.setConstraints(button, k, j);
            layout.getChildren().add(button);
            k++;
            if ((i-99) % 4 == 0)
            {
                j++;
                k = 0;
            }

        }

        button = new Button("Next Page");
        button.setTextFill(Color.DARKBLUE);
        button.setBackground(background);
        button.setOnAction(e ->
        {
            try {
                pageFour();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });
        GridPane.setConstraints(button, 2,12);
        layout.getChildren().add(button);
        button = new Button("Close");
        button.setTextFill(Color.DARKBLUE);
        button.setBackground(background);
        button.setOnAction(e -> window.close());
        GridPane.setConstraints(button, 3,12);
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 1100,600);
        window.setScene(scene);
        window.setResizable(false);
        BackgroundFill background_fill = new BackgroundFill(Color.DARKBLUE, CornerRadii.EMPTY, Insets.EMPTY);
        Background background = new Background(background_fill);
        layout.setBackground(background);
        window.show();
    }
    public static void pageFour() throws IOException {
        Stage window;
        ArrayList<String> lines = new ArrayList<>();
        FileReader fr = new FileReader("Movies.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null)
        {
            lines.add(line);
        }
        window = new Stage();
        window.setTitle("IMDb");
        GridPane layout = new GridPane();
        layout.setPadding(new Insets(5, 5, 5, 5));
        layout.setVgap(20);
        layout.setHgap(20);
        button = new Button("Next Page");
        button.setTextFill(Color.DARKBLUE);
        button.setBackground(background);
        button.setOnAction(e ->
        {
            try {
                pageFive();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });
        int j = 0;
        int k = 0;

        for (int i = 150; i < 200 ; i++)
        {
            String title = lines.get(i).substring(lines.get(i).indexOf(".") + 1, lines.get(i).indexOf("("));
            button = new Button(title);
            button.setTextFill(Color.DARKBLUE);
            button.setBackground(background);
            int finalI = i;
            button.setOnAction(e ->
            {
                MovieWindow.create(finalI);
            });
            GridPane.setConstraints(button, k, j);
            layout.getChildren().add(button);
            k++;
            if ((i - 149) % 4 == 0)
            {
                j++;
                k = 0;
            }

        }



        button = new Button("Next Page");
        button.setTextFill(Color.DARKBLUE);
        button.setBackground(background);
        button.setOnAction(e ->
        {
            try {
                pageFive();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });
        GridPane.setConstraints(button, 2,12);
        layout.getChildren().add(button);
        button = new Button("Close");
        button.setTextFill(Color.DARKBLUE);
        button.setBackground(background);
        button.setOnAction(e -> window.close());
        GridPane.setConstraints(button, 3,12);
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 1100,600);
        window.setScene(scene);
        window.setResizable(false);
        BackgroundFill background_fill = new BackgroundFill(Color.DARKBLUE, CornerRadii.EMPTY, Insets.EMPTY);
        Background background = new Background(background_fill);
        layout.setBackground(background);
        window.show();

    }
    public static void pageFive() throws IOException {
        Stage window;
        ArrayList<String> lines = new ArrayList<>();
        FileReader fr = new FileReader("Movies.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null)
        {
            lines.add(line);
        }
        window = new Stage();
        window.setTitle("IMDb");
        GridPane layout = new GridPane();
        layout.setPadding(new Insets(5, 5, 5, 5));
        layout.setVgap(20);
        layout.setHgap(20);
        int j = 0;
        int k = 0;
        for (int i = 200; i < 250 ; i++)
        {
            String title = lines.get(i).substring(lines.get(i).indexOf(".") + 1, lines.get(i).indexOf("("));
            button = new Button(title);
            button.setTextFill(Color.DARKBLUE);
            button.setBackground(background);
            int finalI = i;
            button.setOnAction(e ->
            {
                MovieWindow.create(finalI);
            });
            GridPane.setConstraints(button, k, j);
            layout.getChildren().add(button);
            k++;
            if ((i - 199) % 4 == 0)
            {
                j++;
                k = 0;
            }

        }
        button = new Button("Close");
        button.setTextFill(Color.DARKBLUE);
        button.setBackground(background);
        button.setOnAction(e -> window.close());
        GridPane.setConstraints(button, 2,12);
        layout.getChildren().add(button);
        button = new Button("Description");
        button.setOnAction(e -> About.about());
        button.setBackground(background);
        button.setTextFill(Color.DARKBLUE);
        GridPane.setConstraints(button, 3,12);
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 1100,600);
        window.setScene(scene);
        window.setResizable(false);
        BackgroundFill background_fill = new BackgroundFill(Color.DARKBLUE, CornerRadii.EMPTY, Insets.EMPTY);
        Background background = new Background(background_fill);
        layout.setBackground(background);
        window.show();
    }

    @Override
    public void start(Stage stage) throws Exception
    {
        Stage window;
        ArrayList<String> lines = new ArrayList<>();
        FileReader fr = new FileReader("Movies.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null)
        {
            lines.add(line);
        }
        window = stage;
        window.setTitle("IMDb");
        GridPane layout = new GridPane();
        layout.setPadding(new Insets(5, 5, 5, 5));
        layout.setVgap(20);
        layout.setHgap(20);
        int j = 0;
        int k = 0;
        for (int i = 0; i < 50 ; i++)
        {
            String title = lines.get(i).substring(lines.get(i).indexOf(".") + 1, lines.get(i).indexOf("("));
            button = new Button(title);
            button.setTextFill(Color.DARKBLUE);
            button.setBackground(background);
            int finalI = i;
            button.setOnAction(e ->
            {
                MovieWindow.create(finalI);
            });
            GridPane.setConstraints(button, k, j);
            layout.getChildren().add(button);
            k++;
            if ((i+1) % 4 == 0)
            {
                j++;
                k = 0;
            }

        }

        button = new Button("Next Page");
        button.setTextFill(Color.DARKBLUE);
        button.setBackground(background);
        button.setOnAction(e ->
        {
            try {
                pageTwo();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });
        GridPane.setConstraints(button, 2,12);
        layout.getChildren().add(button);
        button = new Button("Exit");
        button.setTextFill(Color.DARKBLUE);
        button.setBackground(background);
        button.setOnAction(e -> System.exit(0));
        GridPane.setConstraints(button, 3,12);
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 1100,600);
        window.setScene(scene);
        window.setResizable(false);
        BackgroundFill backgroundPage = new BackgroundFill(Color.DARKBLUE, CornerRadii.EMPTY, Insets.EMPTY);
        Background background = new Background(backgroundPage);
        layout.setBackground(background);
        window.show();
    }


    public static void main(String[] args) throws IOException {
        Directors.direcrors();
        Images.images();
        Movies.movies();
        Rating.rating();
        launch(args);

    }
}
