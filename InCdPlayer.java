package deep22;

public class InCdPlayer implements Media {
//this class implements all the things in media interfaces
    @Override
    public void start() {
        System.out.println("Music starts");
    }

    @Override
    public void stop() {
        System.out.println("Music stops");
    }
}
