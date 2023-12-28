package other;

public class ArrayComputations {
    public static void main(String[] args){
        short [] numbers = {6, 2, 7, 9, 10, 54, 129, 0, 420};
        System.out.println(numbers[0] < numbers[numbers.length - 1]);

        boolean [] checks = {numbers[0] == (numbers[1] + numbers[2]), numbers[1] == (numbers[2] + numbers[3]), numbers[2] == (numbers[3] + numbers[4])};
        System.out.println(checks[0]);
        System.out.println(checks[1]);
        System.out.println(checks[2]);
    }
}
