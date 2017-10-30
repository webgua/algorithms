package sort;

/**
 * Created by sheldon on 2017/10/30.
 * 选择排序，每一步找到最小元素替换到第一个
 */
public class SelectionSort extends SortExample {
    public static void sort(Comparable[] a){
        int N = a.length;
        for (int i=0;i<N;i++){
            int min = i;
            for (int j = i+1;j<N;j++){
                if(less(a[min],a[j])) min = j;
            }
            each(a,i,min);
        }
    }
}
