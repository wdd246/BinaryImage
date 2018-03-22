/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication68;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Image;
import java.awt.Robot;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class JavaApplication68 {

 public static void binary(String nazwa) throws FileNotFoundException, IOException, AWTException{
       RandomAccessFile file = new RandomAccessFile(nazwa, "rw");
Random r = new Random();
int cols = 100;
int rows = 100;
int max = 255;
file.writeBytes("P5 \r\n");
file.writeBytes(cols+" "+rows+" "+max+"\r\n");
       for (int i = 0; i < 100; i++) {
           for (int j = 0; j < 100; j++) {
               if(j%2==0 && i%2==0){
               file.writeByte(255);
              // System.out.println(colorb());
               }
               if(j%2==0 && i%2==1){
                file.writeByte(0);
               }
               if(j%2==1 && i%2==0){
               file.writeByte(0);
               }
               if(j%2==1 && i%2==1){
                file.writeByte(255);
               }
               else{
                 //file.writeByte(255);
               }
           
       }
           file.writeBytes("\r\n");
       }




//long pointer = file.getFilePointer();

file.close();
 }
    public static void main(String[] args) {
       try{
            binary("C:/Users/Student/Desktop/am/6b2.pgm");
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            //zamknąć strumień, zamnknąc połączenie
            //niezaleznie od błędu
        }
    
    }
    
}
