/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anti_palindrome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author DELL
 */
public class Anti_palindrome {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        char c1;
        String s1="",s2="";
        for(int i=0;i<t;i++)
        {
        String s=br.readLine();
        int l=s.length();
        for(int j=97;j<=122;j++)
        {
        c1=(char)j;
        for(int i1=0;i1<l;i1++)
        {
        char c=s.charAt(i1);
        if(c1==c)
           s1=s1+c1; }
        }
        
        for(int k1=l-1;k1>=0;k1--)
        {
          s2=s2+s.charAt(k1);
        }
        if(s.equals(s2))
        {
        System.out.println("-1");
         s1="";
         s2="";
        }
        else{
              System.out.println(s1); 
              s1="";
              s2="";
                }}
        // TODO code application logic here
    }
    
}
