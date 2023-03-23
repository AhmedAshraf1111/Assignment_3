import java.util.*;
public class SortMain {
     public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in) ; 

        ArrayList<Integer> list= new ArrayList<>() ; 
        
        System.out.println("Enter the size of list");
         int n =scan.nextInt() ;
        for (int i=0; i<n;i++){ 
            System.out.println("enter the numbers");
            list.add(scan.nextInt()) ;  

        }  
        Sort_Array(list) ;
        scan.close();
     }
     public static void Sort_Array( ArrayList <Integer> z) { 
        int temp ;

       
        for (int i =0;i<z.size();i++){  
            for(int j=i+1;j<z.size();j++){ 

                if(z.get(i)<z.get(j)){ 

                }
                else{ 
                    temp=z.get(i) ;

                    z.set(i,z.get(j)) ;
                    z.set(j,temp) ;
                }


            }
            
        }
        
     }
}
