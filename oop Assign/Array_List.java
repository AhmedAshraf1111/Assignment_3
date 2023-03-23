import java.util.*;
import java.util.Scanner;

public class Array_List{ 
        
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in) ; 

        ArrayList<Integer> list= new ArrayList<>() ; 
        
        System.out.println("Enter the size of list");
         int n =scan.nextInt() ;
        for (int i=0; i<n;i++){ 
            System.out.println("enter the numbers");
            list.add(scan.nextInt()) ;  

        } 
        int max = Max_Integer(list) ; 
        
        System.out.println("this is the Maximum:"+max);
        scan.close();
    }
       public static int Max_Integer( ArrayList<Integer> x) {
         
                int max=0 ; 
                for (int i=0;i<x.size();i++){ 

                    if (max<x.get(i)){

                        max=x.get(i) ;
                    }
                }
       
                return max ;
       }

    } 

      



