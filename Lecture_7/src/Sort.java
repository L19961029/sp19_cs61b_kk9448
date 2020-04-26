public class Sort {
    //for循环方法
//    public static String[] sort(String[] x){
//
//     for(int i=0;i<x.length;i++){
//         int small_index=findSmallest(x,i);
//         swap(x,i,small_index);
//     }
//     return x;
//    }

    public static String[] sort(String[] x){
//        int length=x.length;
       sort(x,0);
        return x;
    }

    public static void sort(String[] x,int start){
        if(start==x.length){
            return;
        }
        int small_index=findSmallest(x,start);
        swap(x,start,small_index);
        sort(x,start+1);
    }

    public static String[] swap(String[] x, int a, int b){
                String tmp=x[a];
                x[a]=x[b];
                x[b]=tmp;
                return x;
    }


    public static int findSmallest(String[] x,int start){
        int small_index=start;

        for(int i=start;i<x.length;i++){
            int result=x[i].compareTo(x[small_index]);
            //if x[i]<x[small_index]; the result will be -1;
//            "a".compareTo("b"); // returns a negative number, here -1
//            "a".compareTo("a"); // returns  0
//            "b".compareTo("a"); // returns a positive number, here 1
//            "b".compareTo(null); // throws java.lang.NullPointerException
            if(result<0){
                small_index=i;
            }
        }
        return small_index;
    }

}
