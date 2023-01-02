
package catroomsimulation;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.swing.JOptionPane;

public class musicPlayerSingleton {

    //musicplayer - uniqueInstance
    static musicPlayerSingleton musicplayer;
    
    static Clip clip;
    float previousVolume = 0;
    float currentVolume = 0;
    static FloatControl fc;

    public musicPlayerSingleton() {
    }
    
    public static musicPlayerSingleton getInstance(){
        if(musicplayer == null){
            musicplayer = new musicPlayerSingleton();
        }
        return musicplayer;
    }
    
    public static void loadMusic(String filePath){
        try{
            File musicpath = new File("src\\catroomsimulation\\resources\\"+filePath);
            if(musicpath.exists()){
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicpath);
                clip = AudioSystem.getClip();
                clip.open(audioInput);
                fc = (FloatControl)clip.getControl(FloatControl.Type.MASTER_GAIN);
                clip.start();
                System.out.println("Music played");
            }else{
//                JOptionPane.showMessageDialog(null,musicpath);
                System.out.println("Music Path not exists");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void volumeUp(){
        currentVolume += 5.0f;
        System.out.println("current volume = "+currentVolume);
        if(currentVolume > 6.0f){
            currentVolume = 6.0f;
        }
        fc.setValue(currentVolume);
    }
    
    public void volumeDown(){
        currentVolume -= 5.0f;
        System.out.println("current volume = "+currentVolume);
        if(currentVolume < -80.0f){
            currentVolume = - 80.0f;
        }
        fc.setValue(currentVolume);
    }
}
