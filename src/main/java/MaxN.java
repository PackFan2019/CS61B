public class MaxN {

        public static int max(int[] m) {
            int ans=Integer.MIN_VALUE;

            for (int i = 0; i < m.length; i++) {

                if (ans<m[i]){
                    ans=m[i];
                }
            }

            return ans;


        }
        public static void main(String[] args) {
            int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};

            System.out.println(max(numbers));
        }
    }

