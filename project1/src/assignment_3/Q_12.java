package assignment_3;
import java.util.*;	
public class Q_12 {

	public static void main(String args[]) {

        Scanner s= new Scanner(System.in);

        int n= s.nextInt();

        int arr[]= new int[n];

        for(int i=0; i<n;i++){

            arr[i]= s.nextInt();
        }

        int q=s.nextInt();

        int mod=(int)(1e9+7);

        while(q>0){
           
           int x= s.nextInt();
            int narr[]=new int[n];
           for(int i=0; i<n;i++){

               int index=i-x;

               if(index<0){
                   index+= n;
               }

              int sum= arr[i]+ arr[ index];

               narr[i]=sum;
            //    System.out.print(narr[i]+" ");

           }
           arr=narr;
        //    System.out.println();
            q--;
        }

        long ans=0;

        for(int i=0; i<n;i++){

            ans+= arr[i];
          
        }

          ans%=mod;

        System.out.println(ans);



    }
}