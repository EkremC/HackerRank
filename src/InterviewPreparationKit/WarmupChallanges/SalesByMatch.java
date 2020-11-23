package InterviewPreparationKit.WarmupChallanges;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

// https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
public class SalesByMatch {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        final Map<Integer, Long> collect = Arrays.stream(ar)
                .boxed()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        final int sum = collect.entrySet().stream()
                .filter(map -> map.getValue() > 1)
                .map(map -> map.getValue() / 2)
                .mapToInt(Long::intValue)
                .sum();
        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        scanner.close();
    }
}
