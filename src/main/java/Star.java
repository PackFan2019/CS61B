public class Star {
    public static void main(String[] args) {


        drawTriangle(100);


    }

    static void drawTriangle(int n){

        for (int i = 1; i <=n ; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }

            System.out.println("");


        }

    }
}
