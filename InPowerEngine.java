package deep22;

public class InPowerEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Power engine starts");
    }

    @Override
    public void stop() {
        System.out.println("Power engine stops");
    }

    @Override
    public void accelerate() {
        System.out.println("Power engine accelerate");
    }
}
