/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.*;
public class SubString 
{
    public int lengthOfLongestSubstring(String s) 
    {
        
        
       
        StringBuilder sb = new StringBuilder(s);
        int length1=0;
       
        for(int i=0;i<sb.length();i++)
        {
            for (int j=i+1;j<sb.length();j++)
            {
                
                String temp = sb.substring(i,j);
                if(unique(temp)==0 && temp.length()>length1)
                {
                    length1= temp.length();
                }
                
            }
        }
        
        return length1;
    }
    
     public int unique(String temp)
    {   
        
        
        int flag=0;
        int[] count = new int[27];
        StringBuilder s = new StringBuilder(temp);
        
        StringBuilder space = new StringBuilder(" ");
        
        for(int i=0;i<s.length();i++)
        {
            if((int)s.charAt(i)-(int)space.charAt(0)==0)
            {
                count[26]+=1;
                
            }
            count[(int)s.charAt(i)-(int)'a']+=1;
        }
        
        for(int i=0;i<count.length;i++)
        {
            if(count[i]>1)
            {
                flag=1;
            }
        }
        return flag;
    }
     
    
}
