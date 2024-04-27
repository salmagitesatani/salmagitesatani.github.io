package edu.miracosta.cs112.stylesparkfx;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class ResultsScene extends Scene {

    private ImageView aiPhoto;
    private String results;
    public ResultsScene(int[] counts, String[] palettes) {
        super(new GridPane(), 900, 700);
        ComboBox<String> stylesOptions = new ComboBox<>();
        //stylesOptions.getSelectionModel().selectedItemProperty().addListener((obsVal, oldVal, newVal) -> getAiImage(newVal));


        GridPane gridPane = new GridPane();
        gridPane.setStyle("-fx-background-color:rgb(243,220,223);");
        gridPane.setVgap(10);
        gridPane.setHgap(50);
        //try to add in font


        Label resultLabel = new Label("");
        resultLabel.setStyle("-fx-font-size: 15; -fx-text-fill: #333;");
        gridPane.add( new Label("Here is your result!"),0,0);
        gridPane.add(resultLabel,1,0);


        int maxCount = counts[0];
        for (int i = 1; i < counts.length; i++) {
            if (counts[i] > maxCount) {
                maxCount = counts[i];
            }
        }
        results = "";
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] == maxCount) {
                results += palettes[i] + "\n";
            }
        }
        resultLabel.setText(results);


        Label stylesLabel = new Label("Pick your styles here:");
        stylesLabel.setStyle("-fx-font-size: 18; -fx-text-fill: #333;");
        stylesOptions.getItems().addAll("Boho","Goth", "Chic", "Indie", "Coquette", "Acubi", "Streetwear", "Y2k", "Preppy", "Vintage", "Business Casual", "Minimalist", "Formal", "Old Money", "Camp", "Modest");
        stylesOptions.getSelectionModel().select(0);
        gridPane.add(stylesLabel, 0,3);
        gridPane.add(stylesOptions, 0,4);

        aiPhoto = new ImageView();
        aiPhoto.setFitHeight(400);
        aiPhoto.setPreserveRatio(true);
        gridPane.add(aiPhoto, 0, 7);

        Button generateAIImageButton = new Button("Generate AI Image...");
        generateAIImageButton.setOnAction(e -> getAiImage(stylesOptions.getSelectionModel().getSelectedItem()));
        gridPane.add(generateAIImageButton, 0, 8);


        this.setRoot(gridPane);
    }



    public void getAiImage(String style) {
        try {
            //System.out.println(System.getProperty("os.name"));

            Path relPath = Paths.get("");
            String directory = relPath.toAbsolutePath().toString();
            System.out.println(directory);
            //commands[0] = "cd " + directory;

            System.out.println("Style: " + style);
            System.out.println("Results: " + results);


            String[] commands = {"python3", directory + File.separator + "clothes.py"};

            ProcessBuilder pb = new ProcessBuilder(commands).redirectErrorStream(true);
            pb.directory(new File(directory));
            pb.redirectError(new File(directory + File.separator + "output.txt"));
            Process process = pb.start();
            System.out.println(process);
            BufferedReader stdOut = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String s;
            while ((s = stdOut.readLine()) != null) {
                System.out.println("Result from Dall-e: " + s);
                aiPhoto.setImage(new Image(s));
            }


        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }


}
