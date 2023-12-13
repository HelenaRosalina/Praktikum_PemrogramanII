package com.example.PRAKTIKUM6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        TableView tableView = new TableView();

        TableColumn<Mahasiswa, String> column1 =
                new TableColumn<>("NIM");

        column1.setCellValueFactory(
                new PropertyValueFactory<>("nim"));

        TableColumn<Mahasiswa, String> column2 =
                new TableColumn<>("Nama");

        column2.setCellValueFactory(
                new PropertyValueFactory<>("name"));

        tableView.getColumns().add(column1);
        tableView.getColumns().add(column2);

        tableView.getItems().add(
                new Mahasiswa(1, "Helena", "1010"));
        tableView.getItems().add(
                new Mahasiswa(2, "Jay", "1011"));
        tableView.getItems().add(
                new Mahasiswa(3, "James", "1012"));
        tableView.getItems().add(
                new Mahasiswa(4, "Keshi", "1013"));
        tableView.getItems().add(
                new Mahasiswa(5, "Ariana", "1014"));
        tableView.getItems().add(
                new Mahasiswa(6, "Jake", "1015"));
        tableView.getItems().add(
                new Mahasiswa(7, "Bazzi", "1016"));
        tableView.getItems().add(
                new Mahasiswa(8, "Lauv", "1017"));
        tableView.getItems().add(
                new Mahasiswa(9, "Somi", "1018"));
        tableView.getItems().add(
                new Mahasiswa(10, "SongKang", "1019"));

        VBox vbox = new VBox(tableView);
        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}