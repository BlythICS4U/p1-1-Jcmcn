/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;
import java.util.Random;
import java.util.Scanner;
    
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        
        /*First Problem
        int onetosix = rand.nextInt(6) + 1;
        System.out.println(onetosix);
        int zeroone1 = rand.nextInt(2);
        System.out.println(zeroone1);
        int onetofifty1 = rand.nextInt(52) + 1;
        System.out.println(onetofifty1);
        int toseven1 = rand.nextInt(7) + 0;
        System.out.println(toseven1);
        int toten1 = rand.nextInt(10) + 1;
        System.out.println(toten1);
        int tohundred1 = rand.nextInt(100) + 1;
        System.out.println(tohundred1);
        int negative1 = rand.nextInt(10) - 10;
        System.out.println(negative1);
        int negativepositive1 = rand.nextInt(100) - 50;
        System.out.println(negativepositive1);
        */
        
        /*Second Problem part a
        double heads2 = 0;
        double tails2 = 0;
        for (int i2 = 1; i2<=1000;i2++)
        {
            int coin2 = rand.nextInt(2);
            if (coin2 == 1){
                heads2 ++;
            }
            else{
                tails2 ++;
            }
        }
        System.out.println("The percentage of tails is " + tails2/10);
        System.out.println("The percentage of heads is " + heads2/10);
        */
        
        /*Second Problem part b
        double heads2 = 0;
        double tails2 = 0;
        int flips2;
        System.out.println("Enter the amount of flips");
        flips2 = scan.nextInt();
        for (int i2 = 1; i2<=flips2;i2++)
        {
            int coin2 = rand.nextInt(2);
            if (coin2 == 1){
                heads2 ++;
            }
            else{
                tails2 ++;
            }
        }
        System.out.println("The percentage of tails is " + tails2/flips2*100);
        System.out.println("The percentage of heads is " + heads2/flips2*100);
        */
        
        /*Second Problem part c
        double heads2 = 0;
        double tails2 = 0;
        int flips2;
        System.out.println("Enter the amount of flips");
        flips2 = scan.nextInt();
        if (flips2 < 0)
        {
            System.out.println("Try again");
            flips2 = scan.nextInt();
            while (flips2 < 0)
            {
                System.out.println("Try again");
                flips2 = scan.nextInt();
            }
        }
        for (int i2 = 1; i2<=flips2;i2++)
        {
            int coin2 = rand.nextInt(2);
            if (coin2 == 1){
                heads2 ++;
            }
            else{
                tails2 ++;
            }
        }
        System.out.println("The percentage of tails is " + tails2/flips2*100);
        System.out.println("The percentage of heads is " + heads2/flips2*100);
        */
        
        /*Third Problem part a
        int two3 = 0;
        int three3 = 0;
        int four3 = 0;
        int five3 = 0;
        int six3 = 0;
        int seven3 = 0;
        int eight3 = 0;
        int nine3 = 0;
        int ten3 = 0;
        int eleven3 = 0;
        int twelve3 = 0;
        for (int i3=1;i3<=1000;i3++){
            int diceadd3;
            int dice13 = rand.nextInt(6) + 1;
            int dice23 = rand.nextInt(6) + 1;
            diceadd3 = dice13+dice23;
            if (diceadd3 == 2)
            {
                two3++;
            }
            else if (diceadd3 == 3)
            {
                three3++;
            }
            else if (diceadd3 == 4)
            {
                four3++;
            }  
            else if (diceadd3 == 5)
            {
                five3++;
            }  
            else if (diceadd3 ==6)
            {
                six3++;
            }  
            else if (diceadd3 == 7)
            {
                seven3++;
            }  
            else if (diceadd3 == 8)
            {
                eight3++;
            }  
            else if (diceadd3 == 9)
            {
                nine3++;
            }  
            else if (diceadd3 == 10)
            {
                ten3++;
            }  
            else if (diceadd3 == 11)
            {
                eleven3++;
            }  
            else
            {
                twelve3++;
            }
        }
        System.out.println("Twos: " + two3);
        System.out.println("Threes: " + three3);
        System.out.println("Fours: " + four3);
        System.out.println("Fives: " + five3);
        System.out.println("Sixes: " + six3);
        System.out.println("Sevens: " + seven3);
        System.out.println("Eights: " + eight3);
        System.out.println("Nines: " + nine3);
        System.out.println("Tens: " + ten3);
        System.out.println("Elevens: " + eleven3);
        System.out.println("Twelves: " + twelve3);
        */
            
        /*    
        int two3 = 0;
        int three3 = 0;
        int four3 = 0;
        int five3 = 0;
        int six3 = 0;
        int seven3 = 0;
        int eight3 = 0;
        int nine3 = 0;
        int ten3 = 0;
        int eleven3 = 0;
        int twelve3 = 0;
        int quantity3;
        System.out.println("How many pairs are you rolling");
        quantity3 = scan.nextInt();
        for (int i3=1;i3<=quantity3;i3++){
            int diceadd3;
            int dice13 = rand.nextInt(6) + 1;
            int dice23 = rand.nextInt(6) + 1;
            diceadd3 = dice13+dice23;
            if (diceadd3 == 2)
            {
                two3++;
            }
            else if (diceadd3 == 3)
            {
                three3++;
            }
            else if (diceadd3 == 4)
            {
                four3++;
            }  
            else if (diceadd3 == 5)
            {
                five3++;
            }  
            else if (diceadd3 ==6)
            {
                six3++;
            }  
            else if (diceadd3 == 7)
            {
                seven3++;
            }  
            else if (diceadd3 == 8)
            {
                eight3++;
            }  
            else if (diceadd3 == 9)
            {
                nine3++;
            }  
            else if (diceadd3 == 10)
            {
                ten3++;
            }  
            else if (diceadd3 == 11)
            {
                eleven3++;
            }  
            else
            {
                twelve3++;
            }
        }
        StringBuilder s1 = new StringBuilder("*");   
        StringBuilder s2 = new StringBuilder("");
        StringBuilder s3 = new StringBuilder("");
        StringBuilder s4 = new StringBuilder("");
        StringBuilder s5 = new StringBuilder("");
        StringBuilder s6 = new StringBuilder("");
        StringBuilder s7 = new StringBuilder("");
        StringBuilder s8 = new StringBuilder("");
        StringBuilder s9 = new StringBuilder("");
        StringBuilder s10 = new StringBuilder("");
        StringBuilder s11 = new StringBuilder("");
        StringBuilder s12 = new StringBuilder("");
            for(int i=1;i<=two3;i++){
                s2.append(s1);
            }
            for(int i=1;i<=three3;i++){
                s3.append(s1);
            }
            for(int i=1;i<=four3;i++){
                s4.append(s1);
            }
            for(int i=1;i<=five3;i++){
                s5.append(s1);
            }
            for(int i=1;i<=six3;i++){
                s6.append(s1);
            }
            for(int i=1;i<=seven3;i++){
                s7.append(s1);
            }
            for(int i=1;i<=eight3;i++){
                s8.append(s1);
            }
            for(int i=1;i<=nine3;i++){
                s9.append(s1);
            }
            for(int i=1;i<=ten3;i++){
                s10.append(s1);
            }
            for(int i=1;i<=eleven3;i++){
                s11.append(s1);
            }
            for(int i=1;i<=twelve3;i++){
                s12.append(s1);
            }
        System.out.println("Twos: " + s2);
        System.out.println("Threes: " + s3);
        System.out.println("Fours: " + s4);
        System.out.println("Fives: " + s5);
        System.out.println("Sixes: " + s6);
        System.out.println("Sevens: " + s7);
        System.out.println("Eights: " + s8);
        System.out.println("Nines: " + s9);
        System.out.println("Tens: " + s10);
        System.out.println("Elevens: " + s11);
        System.out.println("Twelves: " + s12);
        */
    }     
}
