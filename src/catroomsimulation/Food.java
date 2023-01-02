package catroomsimulation;

import javax.swing.JProgressBar;

public class Food extends HealthDecorator{
    
    Food(JProgressBar HealthProgressBar) {
        pb = HealthProgressBar;
    }
    
    @Override
    public  void healthProgress() {
        increaseHealth(10);
    }
}
