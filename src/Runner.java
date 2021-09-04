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
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
 
        list.show();
        list.insertAtStart(69);
        list.show();
        list.insertAtEnd(69);
        list.show();
        
        
        
    }
}
