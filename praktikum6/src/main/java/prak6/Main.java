package prak6;

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
        TableView<Mahasiswa> tabel = new TableView<>();

        // Kolom NIM
        TableColumn<Mahasiswa, String> kolomNIM = new TableColumn<>("NIM");
        kolomNIM.setCellValueFactory(
                new PropertyValueFactory<>("nim")
        );

        // Kolom Nama
        TableColumn<Mahasiswa, String> kolomNama = new TableColumn<>("Nama");
        kolomNama.setCellValueFactory(
                new PropertyValueFactory<>("nama")
        );

        tabel.getColumns().addAll(kolomNIM, kolomNama);

        tabel.getItems().add(new Mahasiswa(1, "Rizky", "2310817310011"));
        tabel.getItems().add(new Mahasiswa(2, "Dewi", "2310817310022"));
        tabel.getItems().add(new Mahasiswa(3, "Farhan", "2310817310033"));
        tabel.getItems().add(new Mahasiswa(4, "Nadia", "2310817310044"));
        tabel.getItems().add(new Mahasiswa(5, "Rian", "2310817310055"));
        tabel.getItems().add(new Mahasiswa(6, "Siti", "2310817310066"));
        tabel.getItems().add(new Mahasiswa(7, "Lutfi", "2310817310077"));
        tabel.getItems().add(new Mahasiswa(8, "Aisyah", "2310817310088"));
        tabel.getItems().add(new Mahasiswa(9, "Dimas", "2310817310099"));
        tabel.getItems().add(new Mahasiswa(10, "Putri", "2310817310100"));


        VBox box = new VBox(tabel);

        Scene scene = new Scene(box);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Tabel Mahasiswa");
        primaryStage.show();
    }

    public static class Mahasiswa {
        private int id;
        private String nama;
        private String nim;

        // Constructor
        public Mahasiswa(int id, String nama, String nim) {
            this.id = id;
            this.nama = nama;
            this.nim = nim;
        }

        // Getter and Setter methods
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNim() {
            return nim;
        }

        public void setNim(String nim) {
            this.nim = nim;
        }

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }
    }
}