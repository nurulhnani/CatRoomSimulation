//package catroomsimulation;
//import javax.swing.ImageIcon;
//
//
//public class SimpleBackgroundFactory {
//    
//    State lightsOnState;
//    State lightsOffState;
//    
//    State state;
//    
//    public SimpleBackgroundFactory() {
//        lightsOnState = new LightsOnState(this);
//        lightsOffState = new LightsOffState(this);
//        state = lightsOnState;
//    }
//    
//    public void clickButton() {
//        state.clickButton();
//    }
//    
//    public String getFolder() {
//        return state.getFolder();
//    }
//    
//    public ImageIcon getIcon() {
//        return state.getIcon();
//    }
//    
//    public void setState(State state){
//        this.state = state;
//    }
//    
//    public State getState() {
//        return state;
//    }
//    
//    public State getLightsOnState() {
//        return lightsOnState;
//    }
//    
//    public State getLightsOffState() {
//        return lightsOffState;
//    }
//    
//    public ImageIcon createBackground(String selectedPlace){
//        ImageIcon bgImg = null;
//                
//        switch(selectedPlace) {
//          case "Cat Room":
//                bgImg = new ImageIcon(getClass().getResource("resources/" + getFolder() +"/catroom.jpg"));
//              break;
//            case "Bed Room":
//                bgImg = new ImageIcon(getClass().getResource("resources/" + getFolder() +"/bedroom.jpg"));
//              break;
//            case "Park":
//                bgImg = new ImageIcon(getClass().getResource("resources/" + getFolder() +"/park.jpg"));
//              break;
//            case "Living Room":
//                bgImg = new ImageIcon(getClass().getResource("resources/" + getFolder() +"/livingroom.jpg"));
//              break;
//            case "Play Room":
//                bgImg = new ImageIcon(getClass().getResource("resources/" + getFolder() +"/playroom.jpg"));
//              break;
//            default:
//                bgImg = new ImageIcon(getClass().getResource("resources/" + getFolder() +"/catroom.jpg"));
//                break;        }  
//    return bgImg;        
//    }    
//}
package catroomsimulation;


public class SimpleBackgroundFactory {

    Background background;

    public Background createBackground(String selectedPlace) {
        background = null;

        switch (selectedPlace) {
            case "Cat Room":
                background = new BackgroundCatRoom();
                break;
            case "Bed Room":
                background = new BackgroundBedRoom();
                break;
            case "Park":
                background = new BackgroundPark();
                break;
            case "Living Room":
                background = new BackgroundLivingRoom();
                break;
            case "Play Room":
                background = new BackgroundPlayRoom();
                break;
            default:
                background = new BackgroundCatRoom();
                break;
        }

        return background;
    }
}
