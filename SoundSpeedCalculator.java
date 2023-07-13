package com.soundspeed;
import java.util.Scanner;

public class SoundSpeedCalculator {

  public static void main(String[] args) {
  final int sound_speed = 343;//m/s²
   Scanner in = new Scanner(System.in);
   System.out.println("enter the time: ");
   int time = in.nextInt();
   
   System.out.println("the distance traveled is: "+sound_speed*time+"m/s²");
   System.out.println(sound_speed*time/1000+" km/h");
   
  }
}
