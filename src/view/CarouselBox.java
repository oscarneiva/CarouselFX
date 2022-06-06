package view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

import java.util.LinkedList;


public class CarouselBox {
    private Scene scene;
    private int carouselIndex;
    private LinkedList<ImageView> images;

    public CarouselBox(){
        carouselIndex = 0;
        images = new LinkedList<>();
        images.add(new ImageView("https://www.amsterdamduckstore.com/wp-content/uploads/2019/08/Ducktrix-rubber-duck-front-Amsterdam-Duck-Store-1.jpg"));
        images.add(new ImageView("https://cdn11.bigcommerce.com/s-91br/images/stencil/original/products/1742/21757/IMG_5491__31051.1589004052.jpg?c=2"));
        images.add(new ImageView("https://cdn.shopify.com/s/files/1/1011/8106/products/RubberDuckPoliceman1_600x600_crop_center.jpg?v=1613735099"));
        images.add(new ImageView("http://cdn.shopify.com/s/files/1/0604/4801/products/IMG_2644_clipped_rev_1_1200x1200.jpeg?v=1514696446"));
        images.add(new ImageView("https://i.pinimg.com/originals/4a/89/87/4a8987be4322e435d4512728d7dc9276.jpg"));
        initComponents();
    }

    public void initComponents(){
        Button leftArrow = new Button();
        leftArrow.setStyle("-fx-background-color: rgba(255,255,255,0)");
        leftArrow.setGraphic(getCarouselImage(images));
        //leftArrow.setScaleX(0.5);
        //leftArrow.setScaleY(0.5);

        Button image = new Button();
        image.setStyle("-fx-background-color: rgba(255,255,255,0)");
        image.setGraphic(getCarouselImage(images));

        Button rightArrow = new Button();
        rightArrow.setStyle("-fx-background-color: rgba(255,255,255,0)");
        rightArrow.setGraphic(getCarouselImage(images));
        //rightArrow.setScaleX(0.5);
        //rightArrow.setScaleY(0.5);

        HBox mainBox = new HBox(10);
        mainBox.getChildren().addAll(leftArrow, image, rightArrow);
        mainBox.setAlignment(Pos.CENTER);

        scene = new Scene(mainBox);
    }

    public ImageView getCarouselImage(LinkedList<ImageView> images){
        ImageView image = images.get(4);
        return image;
    }

    public Scene getScene(){
        return scene;
    }
}
