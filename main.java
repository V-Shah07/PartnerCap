@FunctionalInterface
interface addNumbers {
    int sum(int start, int end);
}

public class main {
    public static void main(String[] args) {
        int start = Integer.parseInt(args[0]);
        int end = Integer.parseInt(args[1]);

        addNumbers add = (int a, int b) -> {
            int sum = 0;
            for(int i = a; i <= b; i++){
                sum +=i;
            }
            return sum;
        };

        System.out.println("The sum is " + add.sum(start, end));
    }
}