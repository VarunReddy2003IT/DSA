package Sortings;

import java.util.Scanner;

public class Merge_Sort {
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
        mergesort(arr,0,n-1);
        System.out.print("Sorted array: ");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        
    }
    static void mergesort(int arr[],int l,int h){
        if(l<h){
            int mid=(l+h)/2;
            mergesort(arr,l,mid-1);
            mergesort(arr,mid+1,h);
            mergearray(arr,l,mid,h);
        }
    }
    static void mergearray(int arr[],int l,int m,int h){

        int n1 = m - l + 1;
        int n2 = h - m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while(i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

    }
}
