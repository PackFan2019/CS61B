import java.util.Arrays;

public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    /**
     * return the size of the list using recursion
     **/
    public int size() {
//        if (this==null) return 0;
        if (this.rest == null) return 1;
        return this.rest.size() + 1;

    }

    public int get(int i) {
        if (i == 0) return this.first;
        else return this.rest.get(i - 1);
    }


    public int iterativeSize() {

        /*
         * My iterativeSize method is as shown below. I recommend that when you write iterative data structure code that you use the name p to remind yourself that the variable is holding a pointer. You need that pointer because you can't reassign "this" in Java
         *
         * */


        IntList p = this;
        int totalSize = 0;


        while (p != null) {
            totalSize++;
            p = p.rest;
        }
        return totalSize;
    }

    public static void main(String[] args) {
        IntList l = new IntList(15, null);
        l = new IntList(10, l);
        l = new IntList(5, l);

// System.out.println(l.size());
//        System.out.println(l.iterativeSize());
//
//        System.out.println(l.get(2));

//        IntList k=incrList(l,5);

        IntList k = dincrList(l, 5);

        for (int i = 0; i < k.size(); i++) {

            System.out.println(k.get(i));
        }


    }

    public static IntList incrList(IntList l, int x) {
        //Recursive
        if (l == null) return null;
        else return new IntList(l.first + x, incrList(l.rest, x));
        //iterative
    }

    public static IntList dincrList(IntList l, int x) {
        if (l == null) return null;
        l.first=l.first+x;
        //niu:
        dincrList(l.rest,x);
        return l;
    }
}
