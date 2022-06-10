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
        leftArrow.setGraphic(getCarouselImage(images));
        leftArrow.setId("leftArrow");

        Button imageCarousel = new Button();
        imageCarousel.setGraphic(getCarouselImage(images));
        imageCarousel.setId("imageCarousel");

        Button rightArrow = new Button();
        rightArrow.setGraphic(getCarouselImage(images));
        rightArrow.setId("rightArrow");

        HBox mainBox = new HBox(10);
        mainBox.getChildren().addAll(leftArrow, imageCarousel, rightArrow);
        mainBox.setAlignment(Pos.CENTER);

        scene = new Scene(mainBox, 600,1000);
    }

    public ImageView getCarouselImage(LinkedList<ImageView> images){
        ImageView image = images.get(1);
        return image;
    }

    public Scene getScene(){
        return scene;
    }
}
