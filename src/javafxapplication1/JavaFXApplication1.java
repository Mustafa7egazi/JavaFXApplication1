package javafxapplication1;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.geometry.Insets;
import javafx.geometry.Pos;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.ToggleButton;
import javafx.stage.Stage;

public class JavaFXApplication1 extends Application {

    @Override
    public void start(Stage stage) {

        Text nameLabel = new Text("Name");

        TextField nameText = new TextField();

        Text dobLabel = new Text("Date of birth");

        DatePicker datePicker = new DatePicker();

        datePicker.setStyle("-fx-background-color: AQUA; -fx-textfill: GREEN;");

        Text genderLabel = new Text("gender");

        ToggleGroup groupGender = new ToggleGroup();
        RadioButton male = new RadioButton("male");
        male.setToggleGroup(groupGender);
        RadioButton female = new RadioButton("female");
        female.setToggleGroup(groupGender);

        Text reservationLabel = new Text("Reservation");

        ToggleButton Reservation = new ToggleButton();
        ToggleButton yes = new ToggleButton("Yes");

        yes.setStyle("-fx-background-color: AQUA; -fx-textfill: GREEN;");

        ToggleButton no = new ToggleButton("No");

        no.setStyle("-fx-background-color: AQUA; -fx-textfill: GREEN;");

        ToggleGroup groupReservation = new ToggleGroup();
        yes.setToggleGroup(groupReservation);
        no.setToggleGroup(groupReservation);

        Text technologiesLabel = new Text("Technologies Known");

        CheckBox CheckBox1 = new CheckBox("Java");
        CheckBox1.setIndeterminate(false);

        CheckBox CheckBox2 = new CheckBox("Kotlin");
        CheckBox2.setIndeterminate(false);

        Text educationLabel = new Text("Educational qualification");

        ObservableList<String> names = FXCollections.observableArrayList(
                "Engineering", "MCA", "MBA", "Graduation", "MTECH", "Mphil", "Phd");
        ListView<String> educationListView = new ListView<String>(names);

        Text locationLabel = new Text("location");

        ChoiceBox choiceBox3 = new ChoiceBox();
       choiceBox3.getItems().addAll("Hyderabad", "Chennai", "Delhi", "Mumbai", "Vishakhapatnam");

        choiceBox3.setStyle("-fx-background-color: AQUA; -fx-textfill: GREEN;");

        Button buttonRegister = new Button("Register");

        GridPane gridPane = new GridPane();

        gridPane.setMinSize(500, 500);

        gridPane.setPadding(new Insets(10, 10, 10, 10));

        gridPane.setVgap(5);
        gridPane.setHgap(5);

        gridPane.setAlignment(Pos.CENTER);

        gridPane.add(nameLabel, 0, 0);
        gridPane.add(nameText, 1, 0);
        gridPane.add(dobLabel, 0, 1);
        gridPane.add(datePicker, 1, 1);
        gridPane.add(genderLabel, 0, 2);
        gridPane.add(male, 1, 2);
        gridPane.add(female, 2, 2);
        gridPane.add(reservationLabel, 0, 3);
        gridPane.add(yes, 1, 3);
        gridPane.add(no, 2, 3);
        gridPane.add(technologiesLabel, 0, 4);
        gridPane.add(CheckBox1, 1, 4);
        gridPane.add(CheckBox2, 2, 4);
        gridPane.add(educationLabel, 0, 5);
        gridPane.add(educationListView, 1, 5);
        gridPane.add(locationLabel, 0, 6);
        gridPane.add(choiceBox3, 1, 6);
        gridPane.add(buttonRegister, 2, 8);

        buttonRegister.setStyle(
                "-fx-background-color: AQUA; -fx-textfill: GREEN;");
        nameLabel.setStyle("-fx-font: italic bold 15px 'Time new roman' ");
        dobLabel.setStyle("-fx-font: italic bold 15px 'Time new roman' ");
        genderLabel.setStyle("-fx-font: italic bold 15px 'Time new roman' ");
        reservationLabel.setStyle("-fx-font: italic bold 15px 'Time new roman' ");
        technologiesLabel.setStyle("-fx-font: italic bold 15px 'Time new roman' ");
        educationLabel.setStyle("-fx-font: italic bold 15px 'Time new roman' ");
        locationLabel.setStyle("-fx-font: italic bold 15px 'Time new roman' ");
        gridPane.setStyle("-fx-background-color: WHITE;");

        Scene scene = new Scene(gridPane);
        stage.setTitle("MY Form");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String args[]) {
        launch(args);
    }
}
