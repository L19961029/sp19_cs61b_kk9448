public class Main {
    public static void main(String[] args) {
        dogA a=new dogA();
        dogB b=new dogB();
        make_dog_shout.make_dog_shout(a);
        make_dog_shout.make_dog_shout(b);
        dog c=new dogA();
        c.makeNoise();
        dogA d=(dogA) c;
        System.out.println(d.b);
        dogC x = new dogC();
        www(x);
    }


    public static void www(dogA x) {
        x.makeNoise();
    }
}
class make_dog_shout{
    static void make_dog_shout(dog A){
        A.makeNoise();
    }
//   static void make_dog_shout(dogA x){
//       dogA.makeNoise();
//    }
//    static void make_dog_shout(dogB x){
//        dogB.makeNoise();
//    }
}
interface dog{
    void makeNoise();
    default void makeNoise3(){};

}
class dogA implements dog{
    int b=99;
    @Override
    public void makeNoise(){
        b=100;
        System.out.println("i am dog a");
    }
    public void makeNoise2(){
//         b=100;
        System.out.println("not implement");
    }
}
class dogB implements dog{
    @Override
    public void makeNoise(){
        System.out.println("i am dog b");
    }
}

class dogC extends dogA {
    @Override
    public void makeNoise() {
        System.out.print("i am dog c");
    }
}
