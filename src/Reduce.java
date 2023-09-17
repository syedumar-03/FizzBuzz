public class Reduce {
    public static void main(String[] args) {
        int step_counter = 0;
        for (int i = 100; i > 0; i--){
            if (i % 2 == 0){
                i = i/2;
                step_counter += 1;
            } else {
                i = i - 1;
                step_counter += 1;
            }
        }
        System.out.println(step_counter);
    }
}
