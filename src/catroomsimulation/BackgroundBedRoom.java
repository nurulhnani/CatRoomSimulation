package catroomsimulation;

import javax.swing.ImageIcon;

public class BackgroundBedRoom extends Background {

    @Override
    public ImageIcon getBackground() {
        return new ImageIcon(getClass().getResource("resources/" + getFolder() + "/bedroom.jpg"));
    }

}
