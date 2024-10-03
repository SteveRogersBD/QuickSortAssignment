package org.example;
import java.util.*;
public class QuickSort {

    public static int getPivot(int l,int h)
    {
        Random random = new Random();
        int randInt = random.nextInt(h-l+1);
        return l+randInt;
    }
    public static void swap(int []arr,int i,int j)
    {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int partition(int []arr,int l,int h)
    {
        int pi = getPivot(l,h);
        swap(arr,h,pi);
        int pivot = arr[h];
        int j = l-1;
        for(int i=l;i<h;i++)
        {
            if(arr[i]<=pivot)
                swap(arr,++j,i);
        }
        swap(arr,++j,h);
        return j;
    }
    public static int [] quickSort(int []arr,int l,int h)
    {
        if(l<h){
            int p = partition(arr,l,h);
            quickSort(arr,l,p-1);
            quickSort(arr,p+1,h);
        }
        return arr;
    }
    public static void printArray(int []arr)
    {
        for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
    }

    public static void main(String []args)
    {
        int []arr = {3,8,1,6,10,2,19,16};
        System.out.println("Unsorted:");
        printArray(arr);
        quickSort(arr,0,arr.length-1);
        System.out.println();
        System.out.println("Sorted:");
        printArray(arr);

        //testcase1
        System.out.println();
        System.out.println("Test case: Already Sorted");
        arr = new int[] {1,2,3,4,5,6};
        quickSort(arr,0,arr.length-1);
        System.out.println("Sorted:");
        printArray(arr);


        //testcase2
        System.out.println();
        System.out.println("Test case: Reversely Sorted");
        arr = new int[] {6,5,4,3,2,1};
        quickSort(arr,0,arr.length-1);
        System.out.println("Sorted:");
        printArray(arr);

        //testcase3
        System.out.println();
        System.out.println("Test case: Array with duplicate elements");
        arr = new int[] {3, 1, 2, 3, 3, 4, 2};
        quickSort(arr,0,arr.length-1);
        System.out.println("Sorted:");
        printArray(arr);

        //testcase4
        System.out.println();
        System.out.println("Test case: Array with a mix or pos and neg");
        arr = new int[] {3, -1, 0, 5, -3, 2, -2};
        quickSort(arr,0,arr.length-1);
        System.out.println("Sorted:");
        printArray(arr);

        //testcase5
        System.out.println();
        System.out.println("Test case: Empty Array");
        arr = new int[] {};
        quickSort(arr,0,arr.length-1);
        System.out.println("Sorted:");
        printArray(arr);

        //testcase6
        System.out.println();
        System.out.println("Test case: One element in the array");
        arr = new int[] {14};
        quickSort(arr,0,arr.length-1);
        System.out.println("Sorted:");
        printArray(arr);


        //edgecase1
        System.out.println();
        System.out.println("Test case: Large array");
        arr = new int[] {710, -576, 645, 505, 143, -383, 906, -899, -451, 943, -278, -427, 121, 585, -466, 868, 568,
                -145, 810, 378, 939, -621, -409, -653, 714, -889, -39, -591, -144, 489, -365, 426, -683, -439,
                -20, 438, 439, 291, -254, 134, 482, 753, -721, -97, 38, -695, -964, -568, -443, 673, 911, -94,
                -376, 715, 83, 761, -95, -403, -946, -441, -292, -730, 423, -57, 979, -379, -237, -44, -858,
                -589, 780, 302, 126, 477, 388, -90, -732, -282, -41, 198, -872, 361, -477, 478, -225, 91, -317,
                -258, 125, 821, -462, -695, -837, 404, -294, -705, 970, -334, -532, 569}
        ;
        quickSort(arr,0,arr.length-1);
        System.out.println("Sorted:");
        printArray(arr);

        //edgecae2
        System.out.println();
        System.out.println("Test case: Duplicate elements");
        arr = new int[] {5, 5, 5, 10, 10, 10, 1, 1, 1, 7, 7, 7, 2, 2, 2, 5, 5, 5, 10, 10};
        quickSort(arr,0,arr.length-1);
        System.out.println("Sorted:");
        printArray(arr);

    }
}
