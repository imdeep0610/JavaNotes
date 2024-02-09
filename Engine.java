package deep22;

public interface Engine {

    /*interface variable should always be static bcoz since we cant create obj
      in interface and final bcoz in interface construtor is not allowed so we cant
      initialize variable and final var is always initialized and cant be updated again
     */
    static final int PRICE=7800;
    void start();
    void stop();
    void accelerate();
}
