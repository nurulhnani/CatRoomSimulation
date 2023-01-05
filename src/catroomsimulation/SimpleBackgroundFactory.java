package catroomsimulation;

//import javax.swing.ImageIcon;

import javax.swing.ImageIcon;


public class SimpleBackgroundFactory {
    
    public Background createBackground(String selectedTime){
        Background bg = null;
        
        switch(selectedTime) {
          case "Day":
              bg = new DayBackground();
              break;
          case "Night":
              bg = new NightBackground();
              break;
          default:
            break;
        }  
    return bg;        
    }
    
    public ImageIcon getBackground(String selectedPlace, Background bg){
        ImageIcon bgImg = null;
        
        switch(selectedPlace) {
          case "Cat Room":
                bgImg = bg.CatRoom();
              break;
            case "Bed Room":
                bgImg = bg.BedRoom();
              break;
            case "Park":
                bgImg = bg.Park();
              break;
            case "Living Room":
                bgImg = bg.LivingRoom();
              break;
            case "Play Room":
                bgImg = bg.PlayRoom();
              break;
            default:
                bgImg = bg.CatRoom();
                break;        }  
    return bgImg;        
    }    
}
