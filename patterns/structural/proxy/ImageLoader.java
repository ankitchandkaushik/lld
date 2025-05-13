package patterns.structural.proxy;

public class ImageLoader {
    
    Image image;
    String fileName;

    public ImageLoader(String fileName) {
        this.fileName = fileName;
    }

    public void display() {
        if(image == null) {
            image = new RealImage(fileName);
        }
        image.display();
    }

}
