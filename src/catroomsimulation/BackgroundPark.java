package catroomsimulation;

import javax.swing.ImageIcon;

public class BackgroundPark extends Background {

    @Override
    public ImageIcon getBackground() {
        return new ImageIcon(getClass().getResource("resources/" + getFolder() + "/park.jpg"));
    }

}
