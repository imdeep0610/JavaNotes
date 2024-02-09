package deep22;

public class InElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Elctric engine starts");
    }

    @Override
    public void stop() {
        System.out.println("Elctric engine stops");
    }

    @Override
    public void accelerate() {
        System.out.println("Elctric engine accelerate");
    }
}
