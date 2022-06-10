package carouselfx;

import javafx.application.Application;
import javafx.stage.Stage;
import view.CarouselBox;

public class CarouselFX extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        CarouselBox carouselBox = new CarouselBox();
        stage.setScene(carouselBox.getScene());
        stage.setHeight(600);
        stage.setWidth(1000);
        stage.show();
    }
}
