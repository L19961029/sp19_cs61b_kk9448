public class SSList {
    public SSList(){
        sentinel = new IntNode(61,null);
        size = 0;
    }
    public SSList(int n){
        sentinel = new IntNode(61,null);
        sentinel.next = new IntNode(n, null);
        size = 1;
    }


    private class IntNode{
        public int item;
        public IntNode next;
        public IntNode(int i, IntNode n){
            item = i;
            next = n;
        }
    }

//    private IntNode first;
    private IntNode sentinel;
    private int size;

    public int size(){
        return size;
    }

    public void addFirst(int n){
        sentinel.next = new IntNode(n,sentinel.next);
        size=size+1;
    }
    public void addLast(int n){
        IntNode p=sentinel.next;
        while(p!=null){
            p=p.next;
        }
        p = new IntNode(n,null);
        size=size+1;
    }
    public int getFirst(){
        return sentinel.next.item;
    }

    public static void main(String[] args){
        SSList L=new SSList();
        L.addFirst(2);
        L.addLast(5);
        L.addLast(5);
        System.out.println(L.getFirst());
    }


}

