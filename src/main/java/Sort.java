public class Sort {
    public static void sort(String[] x){

//        for (int i = 0; i < x.length; i++) {
//            int minPos=i;
//
//            //find the min's position
//            for (int j = i+1; j <x.length ; j++) {
//
//                if (x[minPos].compareTo(x[j])>0){
//                    minPos=j;
//                }
//
//            }
//
//            //switch value
//
//            String temp=x[i];
//            x[i]=x[minPos];
//            x[minPos]=temp;
//
//
//
//        }

        //Find the smallest Item
        //Move it to the front
        //selection sort the rest (using Recursion ??)

    sort(x,0);



    }

    private static void sort(String[] x, int start){
        if (start==x.length) {return;}
        int smallestIndex=findSmallest(x,start);
        swap(x,start,smallestIndex);
        sort(x, start+1);

    }

    public static int findSmallest(String[] x, int start){

        int pos=start;

        for (int i = start; i < x.length; i++) {
            pos=x[pos].compareTo(x[i])>0?i:pos;
        }
        return  pos;




    }

    public static void swap(String[] x,int a ,int b){
        String temp=x[a];
        x[a]=x[b];
        x[b]=temp;
    }

    public static void main(String[] args) {
        String s="ABC";
        String s1="BCD";
        doSth(s1);
        System.out.println(s);
        System.out.println(s1);
    }

    static void doSth(String s2){
        s2=s2.replace("BC","");
    }
}
