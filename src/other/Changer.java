package other;

public class Changer {
    public static void main(String [] args){
        int[] data = {3, 2, 8, 5, 9, 1};
        int position = 0;

        for (int number : data) {
            if (number % 2 != 0) {
                data[position] *= 2;
                position++;
            } else {
                position++;
            }
        }
    }
}
