import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] input = Arrays.stream(reader.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < input.length; i++) {
            int currNum = input[i];

            for (int j = i; j < input.length; j++) {
                int temp =  input[j];
                input[j] = currNum | input[j];
                currNum = currNum & temp;
            }
            input[i] = currNum;
        }


        for (int i = 0; i < input.length - 1; i++) {
            System.out.print(input[i] + ", ");

        }
        System.out.println(input[input.length - 1]);
    }
}
