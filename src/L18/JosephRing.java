package L18;

import java.util.Arrays;

public class JosephRing {
    public static void solve(int n, int k) {
        int[] outer = new int[n];
        boolean[] in = new boolean[n];
        Arrays.fill(in, true);
        int outerCnt = 0;
        int num = 0;
        while (outerCnt < n) {
            for (int i = 0; i < n; i++) {
                if (in[i]) {
                    num++;
                    if (num == k+1) {
                        outer[outerCnt] = i;
                        outerCnt++;
                        in[i] = false;
                        num = 0;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(outer[i]);
        }
    }

    public static void main(String[] args) {
        solve(7,3);
    }


}
