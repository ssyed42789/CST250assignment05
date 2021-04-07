/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cst250assignment05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


/**
 *
 * @author ssyed
 */
public class CST250assignment05 {
    
    
   public static void main(String [] args) throws FileNotFoundException 
   {
      String row1 = "It might seem crazy what I am 'bout to say";
      String row2 = "Sunshine she's here, you can take a break";
      String row3 = "I'm a hot air balloon that could go to space";
      String row4 = "With the air, like I don't care, baby by the way";
      String row5 = "Huh (Because I'm happy)";
      String row6 = "Clap along if you feel like a room without a roof";
      String row7 = "(Because I'm happy)";
      String row8 = "Clap along if you feel like happiness is the truth";
      String row9 = "(Because I'm happy)";
      String row10 = "Clap along if you know what happiness is to you";
      String row11 = "(Because I'm happy)";
      String row12 = "Clap along if you feel like that's what you wanna do";
      String row13 = "Here come bad news talking this and that (Yeah)";
      String row14 = "Well give me all you got, don't hold back (Yeah)";
      String row15 = "Well I should probably warn you I'll be just fine (Yeah)";
      String row16 = "No offence to you don't waste your time";
      String row17 = "Here's why";
      String row18 = "Clap along if you feel like a room without a roof";
      String row19 = "(Because I'm happy)";
      String row20 = "Clap along if you feel like happiness is the truth";
      String row21 = "Because I'm happy";
      String row22 = "Clap along if you know what happiness is to you";
      String row23 = "(Because I'm happy)";
      String row24 = "Clap along if you feel like that's what you wanna do";
      String row25 = "Uh, bring me down";
      String row26 = "Can't nothing, bring me down";
      String row27 = "My level's too high to bring me down";
      String row28 = "Can't nothing, bring me down, I said";
      String row29 = "Bring me down, can't nothing";
      String row30 = "Bring me down";
      String row31 = "My level's too high to bring me down";
      String row32 = "Can't nothing, bring me down, I said";
      String row33 = "Clap along if you feel like a room without a roof";
      String row34 = "(Because I'm happy)";
      String row35 = "Clap along if you feel like happiness is the truth";
      String row36 = "(Because I'm happy)";
      String row37 = "Clap along if you know what happiness is to you";
      String row38 = "(Because I'm happy)";
      String row39 = "Clap along if you feel like that's what you wanna do";
      String row40 = "Clap along if you feel like a room without a roof";
      String row41 = "(Because I'm happy)";
      String row42 = "Clap along if you feel like happiness is the truth";
      String row43 = "(Because I'm happy)";
      String row44 = "Clap along if you know what happiness is to you";
      String row45 = "(Because I'm happy)";
      String row46 = "Clap along if you feel like that's what you wanna do ";
      String row47 = "Uh, bring me down (Happy, happy, happy, happy)";
      String row48 = "Can't nothing (Happy, happy, happy, happy)";
      String row49 = "Bring me down, my level's too high";
      String row50 = "To bring me down (Happy, happy, happy, happy)";
      String row51 = "Can't nothing (Happy, happy, happy, happy)";
      String row52 = "Bring me down, I said";
      String row53 = "Clap along if you feel like a room without a roof";
      String row54 = "(Because I'm happy)";
      String row55 = "Clap along if you feel like happiness is the truth";
      String row56 = "(Because I'm happy)";
      String row57 = "Clap along if you know what happiness is to you (ayy, ayy, ayy)";
      String row58 = "(Because I'm happy)";
      String row59 = "Clap along if you feel like that's what you wanna do";
      String row60 = "Clap along if you feel like a room without a roof";
      String row61 = "(Because I'm happy)";
      String row62 = "Clap along if you feel like happiness is the truth";
      String row63 = "(Because I'm happy)";
      String row64 = "Clap along if you know what happiness is to you (hey)";
      String row65 = "(Because I'm happy)";
      String row66 = "Clap along if you feel like that's what you wanna do";
      String row67 = "Come on";
      
      
      

      //print verse 1
      System.out.println(row1);
      System.out.println(row2);
      System.out.println(row3);
      System.out.println(row4);
      System.out.println("");
      
       //print verse 2
      System.out.println(row5);
      System.out.println(row6);
      System.out.println(row7);
      System.out.println(row8);
      System.out.println("");
      
      //print verse 3
      System.out.println(row9);
      System.out.println(row10);
      System.out.println(row11);
      System.out.println(row12);
      System.out.println("");
      
      //print verse 4
      System.out.println(row13);
      System.out.println(row14);
      System.out.println(row15);
      System.out.println("");
      
      //print verse 5
      System.out.println(row16);
      System.out.println(row17);
      System.out.println(row18);
      System.out.println(row19);
      System.out.println(row20);
      System.out.println(row21);
      System.out.println("");
      
      //print verse 6
      System.out.println(row22);
      System.out.println(row23);
      System.out.println(row24);
      System.out.println(row25);
      System.out.println("");      

      //print verse 7
      System.out.println(row26);
      System.out.println(row27);
      System.out.println(row28);
      System.out.println("");
      
      //print verse 8
      System.out.println(row29);
      System.out.println(row30);
      System.out.println(row31);
      System.out.println(row32);
      System.out.println(row33);
      System.out.println(row34);
      System.out.println(""); 
      
      //print verse 9
      System.out.println(row35);
      System.out.println(row36);
      System.out.println(row37);
      System.out.println(row38);
      System.out.println("");
      
      //print verse 10
      System.out.println(row39);
      System.out.println(row40);
      System.out.println(row41);
      System.out.println(row42);
      System.out.println("");
      
      //print verse 11
      System.out.println(row43);
      System.out.println(row44);
      System.out.println(row45);
      System.out.println(row46);
      System.out.println(row47);
      System.out.println(row48);
      System.out.println(""); 
      
       //print verse 12
      System.out.println(row49);
      System.out.println(row50);
      System.out.println(row51);
      System.out.println(row52);
      System.out.println(row53);
      System.out.println(row54);
      System.out.println(""); 
      
       //print verse 13
      System.out.println(row55);
      System.out.println(row56);
      System.out.println(row57);
      System.out.println(row58);
      System.out.println(row59);
      System.out.println(row60);
      System.out.println("");
       //print verse 14
      System.out.println(row61);
      System.out.println(row62);
      System.out.println(row63);
      System.out.println(row64);
      System.out.println("");  
      
       //print verse 15
      System.out.println(row65);
      System.out.println(row66);
      System.out.println(row67);
      System.out.println("");  
      
      String str = "happy = 34 words = 416 ";
      String[] strArray = str.split("\\s+");
      Map<String, String> hMap = new LinkedHashMap<>();
       for (String strArray1 : strArray) {
           if (!hMap.containsKey(strArray1)) {
               hMap.put(strArray1, "words");
           }
       }
      System.out.println(hMap);
      
   
   }
}
      

      
    
  