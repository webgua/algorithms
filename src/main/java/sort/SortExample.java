package sort;

import java.util.Arrays;

/**
 * Created by sheldon on 2017/10/30.
 */
public class SortExample {
    public static void sort(Comparable[] a){
        // TODO: 2017/10/30
    }

    protected static boolean less(Comparable a,Comparable b){
        return a.compareTo(b) < 0;
    }

    protected   static void each(Comparable[] a,int i,int j){
        Comparable t = a[j]; a[i] = a[j] ; a[j] = t;
    }

    protected static void show(Comparable[] a){
        //在单行中打印数组
        Arrays.asList(a).stream().forEach(m -> System.out.print(m));
        System.out.println();
    }

    protected static boolean isSorted(Comparable[] a){
        for (int i = 1;i<a.length;i++){
            if(less(a[i],a[i-1])) return false;
        }
        return true;
    }


}
