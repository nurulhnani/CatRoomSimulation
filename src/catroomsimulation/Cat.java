package catroomsimulation;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Cat {

    public Cat() {
    }
    
    public void setName(JLabel catNameLabel, String catName) {
        catNameLabel.setText("Hi " + catName + " ♡");
    }
    
    public void setType(JLabel catLabel, String catType) {
        catLabel.setText("");
        switch (catType) {
            case "blackCat":
                catLabel.setIcon(new ImageIcon(getClass().getResource("resources/blackCat.png")));
                break;
            case "whiteCat":
                catLabel.setIcon(new ImageIcon(getClass().getResource("resources/whiteCat.png")));
                break;
        }
    }

}
