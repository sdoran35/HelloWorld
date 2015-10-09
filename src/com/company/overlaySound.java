package com.company;
import sounds.APSoundClip;
import sounds.Sample;
import java.util.Scanner;
/**
 * Created by student on 9/24/15.
 */
public class overlaySound {
    public static void main(String[]args){
        APSoundClip clip = new APSoundClip("/Users/student/OneDrive/AP Comp Sci/Media Computing/money.wav");
        APSoundClip clip1 = new APSoundClip("/Users/student/OneDrive/AP Comp Sci/Media Computing/BlueBossa.wav");
        APSoundClip overlay = clip1.clone();
        int pos = 0;
        for (Sample s: clip)
        {
            int first = s.getValue();
            int second = clip1.getSample(pos).getValue();
            int newValue = first + second;
            overlay.getSample(pos).setValue(newValue);
            pos ++;
        }
        overlay.draw();
    }
}

