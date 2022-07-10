public class HW0 {
    public static void main(String[] args) {
        System.out.println("Hello World");

        int month=2;
        int day=0;

        for (int i = 1; i <=12 ; i++) {

            month   =i;

            switch (month) {
                case 2:
                    day=28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    day=30;
                    break;
                default:
                    day=31;
                    break;


            }

            System.out.println("Month "+ month + " has " + day);
        }



    }
}
