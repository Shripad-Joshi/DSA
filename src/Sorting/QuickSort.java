package Sorting;

import Basic.BasicImpl;

public class QuickSort {

    static int arr[]={23,12,11,4,89,45};

    public void swap(int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    //partition
    public int partition(int low,int high){
        int p=high;
        int start=low,end=high;
        while(start<end){
            while(arr[start]<arr[p] && start<end){
                start++;
            }

            while(arr[end]>arr[p] && start<end){
                end--;
            }
            swap(start,end);
        }
        swap(p,start);
        return end;
    }

    //quick sort
    public void quickSort(int low,int high){
        if(low<high){
            int p=partition(low,high);
            quickSort(low,p-1);
            quickSort(p+1,high);
        }
    }

    public static void main(String[] args) {
        QuickSort sort=new QuickSort();
        sort.quickSort(0,arr.length-1);
        BasicImpl.printArray(arr);
    }
}
