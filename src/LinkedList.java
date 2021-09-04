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
    
    void insertAt(int index, int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;
        
        if(index == 0)
        {
            node.next = head;
            head = node;
            System.out.println("Node Inserted at the head");
        }
        else
        {
        Node n = head;
        for (int i=0; i<index-1; i++)
        {
            n = n.next;
        }
        
        node.next = n.next;
        n.next = node;
        System.out.println("Element Inserted at: "+index);
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
    
    
    void deleteAt(int index)
    {
       try
       {
           if (index == 0)
        {
            head = head.next;
        }
        else
        {
            Node n = head;
            for (int i=0; i<index-1 ;i++)
            {
               n = n.next;
            }
            Node temp = n.next;
            n.next = temp.next;
            temp.next=null;
            System.out.println("Item Deleted!");
            
        }
       }
       catch(Exception e)
       {
           System.out.println("Array index not present!  Delete Operation cannot be performed :(");
       }
       
        
    }
    
    void show()
    {
        Node n = head;
        int i=0;
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
