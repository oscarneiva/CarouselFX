package carouselfx;

import javafx.application.Application;
import javafx.stage.Stage;
import view.CarouselBox;

public class CarouselFX extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        CarouselBox carouselBox = new CarouselBox();
        primaryStage.setScene(carouselBox.getScene());
        primaryStage.show();
    }
}
