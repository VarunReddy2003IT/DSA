package Sortings;

import java.util.Scanner;

public class Selection_Sort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n =sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        for(int i=0;i<n;i++){
            int ind=0,ele=Integer.MAX_VALUE;
            boolean flag=false;
            for(int j=i;j<n;j++){
                if(arr[j]<ele){
                    ind=j;
                    ele=arr[j];
                    flag=true;
                }
            }
            if(flag){
                arr[ind]=arr[i];
                arr[i]=ele;
            }

        }
        System.out.print("Sorted array: ");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
