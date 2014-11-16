/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmsc723poject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author rashmi
 */
public class Read {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        Scanner sc=new Scanner(System.in);
        BufferedReader br=new BufferedReader(new FileReader(sc.next()));
        String[][] tweets=new String[8000][3];
        Scanner in;
        int i=0;
        
        while(br.ready()){
        in=new Scanner(br.readLine());
        in.next();
        tweets[i][0]=in.next();
        tweets[i][1]=in.next();
        tweets[i][2]="";
        while(in.hasNext())
            tweets[i][2]+=" "+in.next();
        i++;
        }
        System.out.println(tweets[7000][0]+" "+tweets[7000][1]+" "+tweets[7000][2]);
    }
    
}
    
