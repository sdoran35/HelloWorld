package com.company;

import sounds.APSoundClip;
import sounds.*;
/**
 * Created by student on 9/24/15.
 */
public class reverseSound {
    public static void main(String[] args) {
        APSoundClip clip = new APSoundClip("/Users/student/OneDrive/AP Comp Sci/Media Computing/money.wav");
        int right = clip.getLength() - 1;
        int left = 1;

        while (left < right) {
            Sample leftSample = clip.getSample(left);
            Sample rightSample = clip.getSample(right);
            clip.setSample(left, rightSample);
            clip.setSample(right, leftSample);
            left++;
            right--;

        }
        clip.draw();

    }
}



