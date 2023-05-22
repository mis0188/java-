package org.dhb;

import org.omg.CORBA.SetOverrideType;

import javax.sound.midi.Soundbank;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
       Scanner a=new Scanner(System.in);
       int p=a.nextInt();
       int g=a.nextInt();
       System.out.println(p+g);
       System.out.printf("%03d",p+g);
    }

}