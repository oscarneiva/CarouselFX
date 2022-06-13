package carouselfx;

import javafx.application.Application;
import javafx.stage.Stage;

public class CarouselFX extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        CarouselBox carouselBox = new CarouselBox();
        primaryStage.setScene(carouselBox.getScene());
        primaryStage.show();
    }
}
