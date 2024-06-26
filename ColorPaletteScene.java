package edu.miracosta.cs112.stylesparkfx;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

public class ColorPaletteScene extends Scene{

    private static final int NUM_QUESTIONS = 4;
    private int answeredQuestions = 0;
    private Button nextButton;
    private ResultsScene resultsScene;

     String[] palettes = {
             "Winter Palette:\nBest Colors: Cool Colors, Jewel Tones, Cool Neutrals, Icy Pastels, and Metallics\nWorst Colors: Warm Colors",
             "Summer Palette:\nBest Colors: Cool Colors, Icy Pastels, and Cool Neutrals\nWorst Colors: Warm Tones, Bright, Bold Colors, Harsh Contrasts, and Earth Tones",
             "Spring Palette:\nbest Colors: Warm Colors, Coral, and Soft Neutrals\nWorst Colors: Cool Tones, Harsh Blacks, Jewel Tones, Muted Colors, and Grayish Browns",
             "Autumn Palette\nBest Colors: Earthy Greens, Warm colors, Mustard Yellow, and Burnt Orange\nWorst Colors: Cool Tones, Pastels, Bright White, and Cool Metallics",
     };

     protected int[] counts = new int[palettes.length];

     private RadioButton firsthair;
     private RadioButton secondHair;
     private RadioButton thirdHair;
     private RadioButton fourthHair;
     private RadioButton eyeOne;
     private RadioButton eyeTwo;
     private RadioButton eyeThree;
     private RadioButton eyeFour;
     private RadioButton skinOne;
     private RadioButton skinTwo;
     private RadioButton skinThree;
     private RadioButton skinFour;
     private RadioButton metalGold;
     private RadioButton metalSilver;

     public ColorPaletteScene() {
        super(new GridPane(), 930, 700);




        GridPane gridPane = new GridPane();
        gridPane.setMinSize(930,700);
        gridPane.setStyle("-fx-background-color:rgb(243,220,223);");
        gridPane.setPadding(new Insets(5));
        //try to add in font



        ImageView coolHair = new ImageView("hair1st.jpg");
        coolHair.setFitHeight(100);
        coolHair.setPreserveRatio(true);
        ImageView ashyHair = new ImageView("hair2nd.jpg");
        ashyHair.setFitHeight(100);
        ashyHair.setPreserveRatio(true);
        ImageView hair3rd = new ImageView("hair3rd.jpg");
        hair3rd.setFitHeight(100);
        hair3rd.setPreserveRatio(true);
        ImageView hair4th = new ImageView("hair4th.jpg");
        hair4th.setFitHeight(100);
        hair4th.setPreserveRatio(true);


        ImageView firstEye= new ImageView("1stquestion.jpg");
        firstEye.setFitHeight(100);
        firstEye.setPreserveRatio(true);
        ImageView secondEye = new ImageView("2ndquestion.jpg");
        secondEye.setFitHeight(100);
        secondEye.setPreserveRatio(true);
        ImageView thirdEye = new ImageView("3rdquestion.jpg");
        thirdEye.setFitHeight(100);
        thirdEye.setPreserveRatio(true);
        ImageView fourthEye = new ImageView("4thquestion.jpg");
        fourthEye.setFitHeight(100);
        fourthEye.setPreserveRatio(true);


        ImageView firstSkin = new ImageView("1stskin.jpg");
        firstSkin.setFitHeight(100);
        firstSkin.setPreserveRatio(true);
        ImageView secondSkin = new ImageView("2ndskin.jpg");
        secondSkin.setFitHeight(100);
        secondSkin.setPreserveRatio(true);
        ImageView thirdSkin = new ImageView("skin3rd.jpg");
        thirdSkin.setFitHeight(100);
        thirdSkin.setPreserveRatio(true);
        ImageView fourthSkin = new ImageView("skin4th.jpg");
        fourthSkin.setFitHeight(100);
        fourthSkin.setPreserveRatio(true);


        ImageView silver = new ImageView("1800x1000_white_gold_vs_sterling_silver copy.png");
        silver.setFitHeight(100);
        silver.setPreserveRatio(true);
        ImageView gold = new ImageView("Gold-Jewelry.jpg");
        gold.setFitHeight(100);
        gold.setPreserveRatio(true);

        Label firstQuestion = new Label("1. What is your natural hair color?");
        //firstQuestion.setFont(girlyFont);
        firstQuestion.setFont(Font.font("Arial", 16));
        ToggleGroup hairToggleGroup = new ToggleGroup();


        firsthair = new RadioButton();
        firsthair.setToggleGroup(hairToggleGroup);
        firsthair.setGraphic(coolHair);

        secondHair = new RadioButton();
        secondHair.setGraphic(ashyHair);
        secondHair.setToggleGroup(hairToggleGroup);

        thirdHair = new RadioButton();
        thirdHair.setGraphic(hair3rd);
        thirdHair.setToggleGroup(hairToggleGroup);

        fourthHair = new RadioButton();
        fourthHair.setGraphic(hair4th);
        fourthHair.setToggleGroup(hairToggleGroup);

        Label secondQuestion = new Label("2. What color are your eyes?");
        secondQuestion.setFont(Font.font("Arial", 16));
        ToggleGroup eyeToggleGroup = new ToggleGroup();

        eyeOne = new RadioButton();
        eyeOne.setGraphic(firstEye);
        eyeOne.setToggleGroup(eyeToggleGroup);

        eyeTwo = new RadioButton();
        eyeTwo.setGraphic(secondEye);
        eyeTwo.setToggleGroup(eyeToggleGroup);

        eyeThree = new RadioButton();
        eyeThree.setGraphic(thirdEye);
        eyeThree.setToggleGroup(eyeToggleGroup);

        eyeFour = new RadioButton();
        eyeFour.setGraphic(fourthEye);
        eyeFour.setToggleGroup(eyeToggleGroup);

        Label thirdQuestion = new Label("3. How would you describe your skin tone?");
        thirdQuestion.setFont(Font.font("Arial", 16));
        ToggleGroup skinToggleGroup = new ToggleGroup();

        skinOne = new RadioButton();
        skinOne.setGraphic(firstSkin);
        skinOne.setToggleGroup(skinToggleGroup);

        skinTwo = new RadioButton();
        skinTwo.setGraphic(secondSkin);
        skinTwo.setToggleGroup(skinToggleGroup);

        skinThree = new RadioButton();
        skinThree.setGraphic(thirdSkin);
        skinThree.setToggleGroup(skinToggleGroup);

        skinFour = new RadioButton();
        skinFour.setGraphic(fourthSkin);
        skinFour.setToggleGroup(skinToggleGroup);

        Label fourthQuestion = new Label("4. Which metal tone do you look best with?");
        fourthQuestion.setFont(Font.font("Arial", 16));
        ToggleGroup metalToggleGroup = new ToggleGroup();

        metalSilver = new RadioButton();
        metalSilver.setGraphic(silver);
        metalSilver.setToggleGroup(metalToggleGroup);

        metalGold = new RadioButton();
        metalGold.setGraphic(gold);
        metalGold.setToggleGroup(metalToggleGroup);

        Label welcome = new Label("Welcome to the Color Palette Quiz! Answer the following questions.");
        welcome.setFont(Font.font("Tahoma", 16));
        gridPane.add(welcome, 1, 0);
        GridPane.setColumnSpan(welcome, 5);

        nextButton = new Button("Next");
        nextButton.setFont(Font.font("Arial"));
        nextButton.setStyle("-fx-background-color: #deeca8; -fx-text-fill: #333;");
        nextButton.setDisable(true);
        nextButton.setOnAction(event -> handleNextButtonClick());

        nextButton.setPrefSize(100, 40);
        gridPane.add(nextButton,3,8);
        GridPane.setHalignment(nextButton, HPos.RIGHT);
        GridPane.setValignment(nextButton, VPos.BOTTOM);



        gridPane.setVgap(10);
        gridPane.setHgap(50);

        gridPane.add(firstQuestion, 0, 1);
        GridPane.setColumnSpan(firstQuestion, 2);
        GridPane.setHalignment(firstQuestion, HPos.CENTER);
        gridPane.add(firsthair,0,2);
        gridPane.add(secondHair,1,2);
        gridPane.add(thirdHair,0,3);
        gridPane.add(fourthHair,1,3);


        gridPane.add(secondQuestion, 3,1);
        GridPane.setColumnSpan(secondQuestion, 2);
        GridPane.setHalignment(secondQuestion, HPos.CENTER);
        gridPane.add(eyeOne, 3,2);
        gridPane.add(eyeTwo, 4,2);
        gridPane.add(eyeThree, 3,3);
        gridPane.add(eyeFour, 4,3);

        gridPane.add(thirdQuestion, 0,4);
        GridPane.setColumnSpan(thirdQuestion, 2);
        GridPane.setHalignment(thirdQuestion, HPos.CENTER);
        gridPane.add(skinOne,0,5);
        gridPane.add(skinTwo,1,5);
        gridPane.add(skinThree,0,6);
        gridPane.add(skinFour,1,6);

        gridPane.add(fourthQuestion, 3,4);
        GridPane.setColumnSpan(fourthQuestion, 2);
        GridPane.setHalignment(fourthQuestion, HPos.CENTER);
        gridPane.add(metalSilver,3,5);
        gridPane.add(metalGold,4,5);


        firsthair.setOnAction(event -> handleRadioButtonSelection());
        secondHair.setOnAction(event -> handleRadioButtonSelection());
        thirdHair.setOnAction(event -> handleRadioButtonSelection());
        fourthHair.setOnAction(event -> handleRadioButtonSelection());

        eyeOne.setOnAction(event -> handleRadioButtonSelection());
        eyeTwo.setOnAction(event -> handleRadioButtonSelection());
        eyeThree.setOnAction(event -> handleRadioButtonSelection());
        eyeFour.setOnAction(event -> handleRadioButtonSelection());

        skinOne.setOnAction(event -> handleRadioButtonSelection());
        skinTwo.setOnAction(event -> handleRadioButtonSelection());
        skinThree.setOnAction(event -> handleRadioButtonSelection());
        skinFour.setOnAction(event -> handleRadioButtonSelection());

        metalSilver.setOnAction(event -> handleRadioButtonSelection());
        metalGold.setOnAction(event -> handleRadioButtonSelection());
        this.setRoot(gridPane);

    }

    private void handleRadioButtonSelection() {
        answeredQuestions++;

        System.out.println("Answered Questions: " + answeredQuestions);

        if (answeredQuestions >= NUM_QUESTIONS) {
            System.out.println("Enable the Next Button");
            nextButton.setDisable(false);
        }
    }


    private void handleNextButtonClick() {

         if (firsthair.isSelected()) {
              counts[0]++;
         } else if (secondHair.isSelected()) {
              counts[1]++;
         } else if (thirdHair.isSelected()) {
              counts[3]++;
         } else if (fourthHair.isSelected()) {
              counts[2]++;
         }

         if (eyeOne.isSelected()) {
              counts[1]++;
         } else if (eyeTwo.isSelected()) {
              counts[2]++;
         } else if (eyeThree.isSelected()) {
              counts[3]++;
         } else if (eyeFour.isSelected()) {
              counts[0]++;
         }

         if (skinOne.isSelected()) {
              counts[0]++;
         } else if (skinTwo.isSelected()) {
              counts[1]++;
         } else if (skinThree.isSelected()) {
              counts[2]++;
         } else if (skinFour.isSelected()) {
              counts[3]++;
         }

         if (metalGold.isSelected()) {
              counts[0]++;
              counts[1]++;
         } else if (metalSilver.isSelected()) {
              counts[2]++;
              counts[3]++;
         }

         int maxCount = counts[0];
         for (int i = 1; i < counts.length; i++) {
              if (counts[i] > maxCount) {
                   maxCount = counts[i];
              }
         }

         System.out.println("\nYour best-suited color palettes are:");

         for (int i = 0; i < counts.length; i++) {
              if (counts[i] == maxCount) {
                   System.out.println(palettes[i]);
              }
         }

         ViewNavigator.loadScene("Your Results!", new ResultsScene(counts,palettes));
    }


}