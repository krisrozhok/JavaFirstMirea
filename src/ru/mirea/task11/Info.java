package ru.mirea.task11;

import javax.sound.midi.SysexMessage;
import java.util.*;

public class Info {
    public static void main(String[] argv){
        Date info = new Date();
        String aboutMe = "Lykova.\nTask taked: 12.10.2022 - 15:00.";
        System.out.println(aboutMe);
        System.out.println("Task finished: " + info);
    }
}
