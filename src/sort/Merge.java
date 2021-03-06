package sort;

/**
 *

 有两个从小到大排序以后的数组A和B，其中A的末端有足够的缓冲空容纳B。请编写一个方法，将B合并入A并排序。

 给定两个有序int数组A和B，A中的缓冲空用0填充，同时给定A和B的真实大小int n和int m，请返回合并后的数组。

 * Created by lizhaoz on 2016/1/10.
 */

public class Merge {
    public static int[] mergeAB(int []A,int [] B,int n,int m){
        int i=n-1,j=m-1,z=n+m-1;
        for (int k = 0; k < n+m; k++) {
            if (i<0) A[z--]=B[j--];
            else if (j<0) A[z--]=A[i--];
            else if (A[i]<B[j]) A[z--]=B[j--];
            else A[z--]=A[i--];
        }
        return A;
    }
    private static void show(int[] a){
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int A[]=new int[]{1,4,6,0,0,0};
        int B[]=new int[]{2,3,5};
        show(mergeAB(A,B,3,3));
    }
}
