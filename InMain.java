package deep22;

public class InMain {
    public static void main(String[] args) {
        InCar car = new InCar();
        car.start();
        car.accelerate();
        car.stop();

        Engine eng = new InCar();
        /*overriding depends on type of obj , here obj is type of Car class and ref var is of
        type Engine interface
        which version to be accessed depends on obj nd what to access depends on ref var type
        means which methods to be accessed depends on Engine interface
         */
        eng.start();
        eng.accelerate();
        eng.stop();

        /*Engine engine=new Engine();
        we cant do this bcoz here in interfaces methods are not defined and if we create obj of
        interfaces it can call those methods which give error
         */

        Media media=new InCar();
        media.stop();/* I stop car engine like a normal car
        Its not good when we try to run a method to stop music system it showng that engine stops
        So we can create separate classes for these interfaces*/

        InNiceCar car1=new InNiceCar();
        car1.start();/* here control goes to strt() of InNiceCar where it goes to default
        constructor and find type of engine=PowerEngine so control goes to PowerEngine class
        and start() of that class strts
        */
        car1.startMusic();/* here when we go to startMusic() of InNiceCar class, it calls
        player.stop(), then we see player is of which type =InCdPlayer type
        we will go to that class and call start() of that class
        */
        car1.upgradeEngine();//this line changes the engine into elctric engine only
        car1.start();/*then here car1.start() goes to strt() of InNiceCar class
        where engine type=ElectricaEngine(above line) and thn goes to strt method of
        Electrical engine class*/
    }

}
