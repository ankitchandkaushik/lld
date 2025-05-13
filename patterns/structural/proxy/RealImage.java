package patterns.structural.proxy;

public class RealImage implements Image{

    public String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadImage();
    }

    @Override
    public void display() {
        System.out.println("Displaying: " + fileName);
    }

    public void loadImage() {
        System.out.println("Loading image " + fileName);
    }
    
}
