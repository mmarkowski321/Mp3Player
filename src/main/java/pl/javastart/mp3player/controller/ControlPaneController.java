package pl.javastart.mp3player.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.MouseEvent;

public class ControlPaneController {

    @FXML
    private Button nextButton;

    @FXML
    private ToggleButton playButton;

    @FXML
    private Button previousButton;

    @FXML
    private Slider progressSlider;

    @FXML
    private Slider volumeSlider;

    public void initialize(){
        System.out.println("Control controller created");
        configureButtons();
        configureVolume();
    }
    private void configureButtons(){
        previousButton.setOnAction(actionEvent -> {
            System.out.println("Poprzednia piosenka");
        });
        playButton.setOnAction(actionEvent -> {
            if (playButton.isSelected())
                System.out.println("Play");
            else
                System.out.println("Stop");
        });
        nextButton.setOnAction(actionEvent -> {
            System.out.println("Nastepna piosenka");
        });
    }
    private void configureVolume(){
        volumeSlider.addEventFilter(MouseEvent.MOUSE_PRESSED, mouseEvent -> {
            System.out.println("Wcisnieto przycisk na suwaku glosnosci");
        });
    }
}
