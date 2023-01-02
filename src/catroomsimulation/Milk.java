package catroomsimulation;

import javax.swing.JProgressBar;

public class Milk extends HealthDecorator{
    
    Milk(JProgressBar HealthProgressBar) {
        pb = HealthProgressBar;
    }
    
    @Override
    public  void healthProgress() {
        increaseHealth(2);
    }
}
