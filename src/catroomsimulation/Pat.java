package catroomsimulation;

import javax.swing.JProgressBar;

public class Pat extends HealthDecorator{

    Pat(JProgressBar HealthProgressBar) {
        pb = HealthProgressBar;
    }
    
    @Override
    public  void healthProgress() {
        increaseHealth(5);
    }

    
}
