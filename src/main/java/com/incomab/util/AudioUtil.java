/*
 * Developed by: Alexis Peralta Holyoak.
 */
package com.incomab.util;
import java.io.*;
import javax.sound.sampled.*;
/**
 *
 * @author peral
 */
/*
Example of use:
AudioUtil.playSound("/sounds/error.wav");
*/
public class AudioUtil {
     public static synchronized void playSound(final String url) {
    new Thread(new Runnable() { // the wrapper thread is unnecessary, unless it blocks on the Clip finishing, see comments
      public void run() {
        try {
          Clip clip = AudioSystem.getClip();
          BufferedInputStream myStream = new BufferedInputStream(getClass().getResourceAsStream("/sounds/"+url)); 
          AudioInputStream inputStream = AudioSystem.getAudioInputStream(myStream);
          clip.open(inputStream);
          clip.start(); 
        } catch (Exception e) {
          System.err.println(e.getMessage());
        }
      }
    }).start();
  }
   
}
