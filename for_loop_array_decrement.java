public class for_loop_array_decrement {
        public static void main(String[] args){
            int a[] = {5, 4, 3, 2, 1 };

            for (int i = a.length-1; i>=0; i--){  //for (int i = a.length-1; i>=0; i--)
                System.out.print(a[i]+"\n");
            }
        }
    }