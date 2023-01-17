package catroomsimulation;

import javax.swing.JProgressBar;
import javax.swing.SwingWorker;

public class SwingWork extends SwingWorker<Void, Void> {

    private JProgressBar pb;
    int reductionVal = 0;

    public SwingWork(JProgressBar HealthProgressBar, int val) {
        this.pb = HealthProgressBar;
        this.reductionVal = val;
    }

    @Override
    protected Void doInBackground() throws Exception {
    // Perform a time-consuming task
      while (pb.getValue() >= 0) {
          // Update the progress bar using the setProgress() method
          pb.setValue(pb.getValue() - reductionVal);
          Thread.sleep(1000);
          System.out.println("Health decrease to "+pb.getValue());
      }
      return null;}
     
}
