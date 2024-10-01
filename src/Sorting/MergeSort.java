package Sorting;

import Basic.BasicImpl;

public class MergeSort {
    static int[] arr={12,34,11,5,78,89};

    void mergeSort(int low,int high){
        if(low<high){
            int mid=(low+high)/2;
            mergeSort(low,mid);
            mergeSort(mid+1,high);
            merge(low,mid,high);
        }
    }

    void merge(int low,int mid, int high){
        int l1=mid-low+1;
        int l2=high-mid;

        int[] arr1=new int[l1];
        int[] arr2=new int[l2];

        for(int i=0;i<l1;i++){
            arr1[i]=arr[low+i];
        }

        for(int j=0;j<l2;j++){
            arr2[j]=arr[mid+j+1];
        }

        int i=0,j=0,k=low;
        while(i<l1 && j<l2){
            if(arr1[i]<=arr2[j]){
                arr[k++]=arr1[i++];

            }else{
                arr[k++]=arr2[j++];

            }
        }

        while(i<l1){
            arr[k++]=arr1[i++];
        }

        while(j<l2){
            arr[k++]=arr2[j++];
        }

    }

    public static void main(String[] args) {
        MergeSort m=new MergeSort();
        m.mergeSort(0,arr.length-1);
        BasicImpl.printArray(arr);
    }
}
