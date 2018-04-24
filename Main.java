/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letmecodeinjava;

import java.util.Scanner;

/**
 *
 * @author doom
 */
public class Main {

    public static void main(String[] args) {
        SLDEGLinkedList l = new SLDEGLinkedList();
        int[] arr = {1, 3, 4, 6, 9};
        for(int a: arr){
            l.addAtStart(a);
            l.display();
        }
        Scanner s = new Scanner(System.in);
        int n;
        do{
            System.out.print("Enter a number to delete from list: ");
            n = s.nextInt();
            l.remove(n);
            l.display();
        }while(n > 0);
    }
    
}
