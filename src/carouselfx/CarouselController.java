package carouselfx;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class CarouselController {
    private LinkedList<ImageView> images;

    CarouselController(){
        read();
    }

    public void read(){
        try{
            FileReader fileReader = new FileReader("./src/carouselfx/images.csv");
            Scanner scanner = new Scanner(fileReader);
            images = new LinkedList<>();

            while(scanner.hasNext()){
                String data = scanner.nextLine();
                images.add(new ImageView(new Image(data)));
            }

            scanner.close();
            fileReader.close();
        }catch(IOException error){
            System.out.println("Read error");
        }
    }

    public LinkedList<ImageView> getImages() {
        return images;
    }
}
