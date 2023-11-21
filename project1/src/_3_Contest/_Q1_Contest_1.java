package _3_Contest;
import java.util.*;
public class _Q1_Contest_1 {

    public static int findMaxSawHeight(int N, int[] heights, long x) {
        int max_height = heights[0];
        int total_wood_cut = 0;

        for (int height : heights) {
            if (height > max_height) {
                max_height = height;
            }
            total_wood_cut += height;
        }
        total_wood_cut -= N * max_height;

        int low = 0;
        int high = max_height;

        while (low <= high) {
            int mid = (low + high) / 2;

            int temp_wood_cut = 0;
            for (int height : heights) {
                if (height > mid) {
                    temp_wood_cut += height - mid;
                }
            }

            if (temp_wood_cut >= x) {
                max_height = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return max_height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] heights = new int[N];
        for (int i = 0; i < N; i++) {
            heights[i] = scanner.nextInt();
        }
        long x = scanner.nextInt();

        int result = findMaxSawHeight(N, heights, x);
        System.out.println(result);

        scanner.close();
    }
}