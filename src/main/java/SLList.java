public class SLList<lochNess> {


    // never used outside
    private class StuffNode {
        public lochNess item;
        public StuffNode next;

        public StuffNode(lochNess i, StuffNode n ){
            item=i;
            next=n;
        }
    }
    private StuffNode first;
    private int size;




    public SLList(lochNess x) {
        first =new StuffNode(x,null);
        size=1;
    }


    public void addFirst(lochNess x) {
        first.next=new StuffNode(x,first.next);
        size++;
    }

    public lochNess getFirst(){
        return first.item;
    }

    public void addLast(lochNess x) {
        size++;

        StuffNode p=first;
       while(p.next!=null){
           p=p.next;
       }

            p.next= new StuffNode(x,null);
    }


    /**  return the size of the list **/

    private  int size(StuffNode p){

        return size();
    }


    public int size(){
        return size;
    }


}
