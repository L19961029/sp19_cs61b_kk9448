import org.junit.Test;
import static org.junit.Assert.*;

public class TestSort {

    @Test
    public void testSort(){
        String[] a={"i","have","an","egg"};
        String[] b={"an","egg","have","i"};
        Sort.sort(a);
        assertArrayEquals(a,b);

        String[] a1={};
        String[] b1={};
        assertArrayEquals(a1,b1);
//        if(a.equals(b)){
//            System.out.println("2333");
//        }else{
//            System.out.println("that is good");
//
//        }
    }


    @Test
    public void testSmallest(){
        String[] a={"i","have","an","egg"};
        int output= 2;

        int actual=Sort.findSmallest(a,0);
        assertEquals(output,actual);

        String[] a2={"there","are","many","pigs"};
        int output2= 1;

        int actual2=Sort.findSmallest(a2,0);
        assertEquals(output2,actual2);
    }

    @Test
    public void testSwap(){
        String[] input={"i","have","an","egg"};
        int a=0;
        int b=2;
        String[] output={"an","have","i","egg"};
        String[] ans=Sort.swap(input,a,b);
        assertArrayEquals(ans,output);
//        if(a.equals(b)){
//            System.out.println("2333");
//        }else{
//            System.out.println("that is good");
//
//        }
    }


//    public static void main(String[] args){
//        testSort();
//       testSmallest();
//        testSwap();
//    }
}


