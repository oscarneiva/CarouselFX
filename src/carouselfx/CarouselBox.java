package carouselfx;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import sun.font.FontRunIterator;

public class CarouselBox {
    private Scene scene;
    private ImageView[] images;
    private Button leftArrow, rightArrow;
    private CarouselController carouselController;
    private HBox imageBox, mainBox;

    public CarouselBox(){
        carouselController = new CarouselController();
        images = new ImageView[5];
        initComponents();
    }

    public void initComponents(){
        imageBox = new HBox();

        int size = carouselController.read().size();
        for (int i = 0; i < images.length; i++) {
            images[i] = carouselController.read().get((size + i)%size);
        }

        images[2].setFitHeight(300);
        images[2].setFitWidth(300);
        images[2].setOpacity(1);

        images[1].setFitHeight(200);
        images[1].setFitWidth(200);
        images[1].setOpacity(0.6);

        images[3].setFitHeight(200);
        images[3].setFitWidth(200);
        images[3].setOpacity(0.6);

        images[0].setFitHeight(100);
        images[0].setFitWidth(100);
        images[0].setOpacity(0.3);

        images[4].setFitHeight(100);
        images[4].setFitWidth(100);
        images[4].setOpacity(0.3);

        imageBox.getChildren().addAll(images);
        imageBox.setSpacing(10);
        imageBox.setAlignment(Pos.CENTER);

        leftArrow = new Button("\u276E");
        leftArrow.setPrefSize(50,80);
        leftArrow.setStyle("-fx-background-color:rgba(255,254,254,0); -fx-text-fill:rgba(58,58,58,0.8); -fx-font-size:80pt ; -fx-effect: dropshadow(three-pass-box, rgba(0,0,0,0.38), 2, 0, 0, 0);");
        leftArrow.setOnAction(event -> {
            moveLeft();
        });

        rightArrow = new Button("\u276F");
        rightArrow.setPrefSize(50,80);
        rightArrow.setStyle("-fx-background-color:rgba(255,254,254,0); -fx-text-fill:rgba(58,58,58,0.8); -fx-font-size:80pt ; -fx-effect: dropshadow(three-pass-box, rgba(0,0,0,0.38), 2, 0, 0, 0);");
        rightArrow.setOnAction(event -> {
            moveRight();
        });

        mainBox = new HBox(10);
        mainBox.getChildren().addAll(leftArrow, imageBox, rightArrow);
        mainBox.setAlignment(Pos.CENTER);

        scene = new Scene(mainBox);
    }

    public void moveRight(){
        imageBox.getChildren().clear();
        ImageView aux = images[0];
        for (int i = 0; i < images.length-1; i++) {
            images[i] = images[i+1];
        }
        images[images.length-1] = aux;

        images[2].setFitHeight(300);
        images[2].setFitWidth(300);
        images[2].setOpacity(1);

        images[1].setFitHeight(200);
        images[1].setFitWidth(200);
        images[1].setOpacity(0.6);

        images[3].setFitHeight(200);
        images[3].setFitWidth(200);
        images[3].setOpacity(0.6);

        images[0].setFitHeight(100);
        images[0].setFitWidth(100);
        images[0].setOpacity(0.3);

        images[4].setFitHeight(100);
        images[4].setFitWidth(100);
        images[4].setOpacity(0.3);

        for (int i = 0; i < images.length; i++) {
            imageBox.getChildren().addAll(images[i]);
        }
        imageBox.setSpacing(10);
        imageBox.setAlignment(Pos.CENTER);
    }

    public void moveLeft(){
        imageBox.getChildren().clear();
        ImageView aux = images[images.length-1];
        for (int i = images.length-1; i > 0; i--) {
            images[i] = images[i-1];
        }
        images[0] = aux;

        images[2].setFitHeight(300);
        images[2].setFitWidth(300);
        images[2].setOpacity(1);

        images[1].setFitHeight(200);
        images[1].setFitWidth(200);
        images[1].setOpacity(0.6);

        images[3].setFitHeight(200);
        images[3].setFitWidth(200);
        images[3].setOpacity(0.6);

        images[0].setFitHeight(100);
        images[0].setFitWidth(100);
        images[0].setOpacity(0.3);

        images[4].setFitHeight(100);
        images[4].setFitWidth(100);
        images[4].setOpacity(0.3);

        for (int i = 0; i < images.length; i++) {
            imageBox.getChildren().addAll(images[i]);
        }
        imageBox.setSpacing(10);
        imageBox.setAlignment(Pos.CENTER);
    }

    public Scene getScene(){
        return scene;
    }
}
