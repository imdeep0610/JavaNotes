package deep22;

public class InNiceCar {
    private Media player=new InCdPlayer();
    private Engine engine;//this car has its own internal engine of Engine type

    public InNiceCar() {
        engine=new InPowerEngine();
    }

    public InNiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        engine.start();/*here engine can be both power or electric its on us which to initialized
        Each time when control come to this method, if its given the type of engine use that
        otherwise use the default type engine (here PowerEngine )
        */
    }

    public void stop(){
        engine.stop();
    }

    public void startMusic(){
        player.start();
    }
    public void stopMusic(){
        player.stop();
    }

    public void upgradeEngine(){
        this.engine=new InElectricEngine();
    }
}
