package Fifthtask;

public class MinMax {
    static class MinAndMax{
        public static int min;
        public static int max;

        public static String printminmax(){
            return min + " " + max;
        }
    }
    static String minmax(int a[]){
        int min = a[0];
        int max = a[0];
        for(int i = 1;i<a.length;i++){
            if(min>a[i]) min = a[i];
            if(max<a[i]) max = a[i];
        }
        MinAndMax.min = min;
        MinAndMax.max = max;
        return MinAndMax.printminmax();
    }
}
