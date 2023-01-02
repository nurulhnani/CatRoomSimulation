package catroomsimulation;

import javax.swing.JProgressBar;
import javax.swing.SwingWorker;

public class ProgressBarDecreaser extends SwingWorker<Void, Void> {

    private JProgressBar HealthProgressBar;

    public ProgressBarDecreaser(JProgressBar HealthProgressBar) {
        this.HealthProgressBar = HealthProgressBar;
    }

    ProgressBarDecreaser(ProgressBarDecreaser pb) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected Void doInBackground() throws Exception {
    // Perform a time-consuming task
      while (HealthProgressBar.getValue() >= 0) {
          // Update the progress bar using the setProgress() method
          HealthProgressBar.setValue(HealthProgressBar.getValue() - 1);
          Thread.sleep(1000);
          System.out.println("Health decrease to "+HealthProgressBar.getValue());
      }
      return null;}

    
}
