
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Runner {
    public static void main(String args[])
    {
//        LinkedList list = new LinkedList();
//        list.insert(1);
//        list.insert(2);
//        list.insert(3);
//        list.show();
//        list.insertAt(2,100);
//        list.show();
//        list.deleteAt(100);
//        list.show();
        
         System.out.println("Enter the string");
         Scanner sc = new Scanner(System.in);
         String s =sc.nextLine();
         SubString t = new SubString();
         System.out.println(t.lengthOfLongestSubstring(s));
    
   
        
        
        
    }
}
