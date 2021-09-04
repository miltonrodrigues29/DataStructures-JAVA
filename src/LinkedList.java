/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class LinkedList {
    
    Node head;
    
    void insert(int data)
    {
       Node node = new Node();
       node.data = data;
       node.next = null;
       
       if(head == null)
       {
           head= node;
           System.out.println("Node "+ data +" Inserted Successfully!");
           
       }
       else
       {
          Node n = head;
          while(n.next!=null)
          {
              n = n.next;
          }
          n.next= node;
          System.out.println("Node "+ data +" Inserted Successfully!");
          
       }
    }
    
    void insertAtStart(int data)
    {
     
        Node node = new Node();
        node.data = data;
        node.next = null;
        
        if(head == null)
        {
            head = node;
            System.out.println("Node Inserted at the head");
        }
        else
        {
            node.next = head;
            head = node;
            System.out.println("Node Inserted at the head");
        }
        
       
    }
    
    void insertAtEnd(int data)
    {
        Node node  = new Node();
        node.data = data;
        node.next = null;
        
        if(head == null)
        {
            head = node;
        }
        else
        {
            Node n = head;
            while(n.next!=null)
            {
                n = n.next;
            }
            n.next = node;
            System.out.println("Item Successfully appended at the end");
            
            
        }
    }
    
    void show()
    {
        Node n = head;
        int i=1;
        if (n == null)
        {
            System.out.println("LinkedList is Empty!");
        }
        else
        {
            System.out.println("List Elements are: ");
            while(n.next!=null)
            {
                System.out.println("Item "+i+":"+n.data);
                i++;
                n = n.next;
                
            }
             System.out.println("Item "+i+":"+n.data);
            
        }
        
        
    }
}
