package catroomsimulation;

import javax.swing.ImageIcon;

public class SimpleBackgroundFactory {
    public ImageIcon createBackground(String selectedPlace){
        ImageIcon bgImg = null;
        
        switch(selectedPlace) {
          case "Cat Room":
              bgImg = new ImageIcon(getClass().getResource("resources/catroom.jpg"));
              break;
          case "Bed Room":
              bgImg = new ImageIcon(getClass().getResource("resources/bedroom.jpg"));
              break;
          case "Park":
              bgImg = new ImageIcon(getClass().getResource("resources/park.jpg"));
              break;
          case "Living Room":
              bgImg = new ImageIcon(getClass().getResource("resources/livingroom.jpg"));
              break;
          case "Play Room":
              bgImg = new ImageIcon(getClass().getResource("resources/playroom.jpg"));
              break;
          default:
            break;
        }  
    return bgImg;        
    }    
}
