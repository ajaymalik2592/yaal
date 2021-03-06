package net.egork;

import net.egork.io.IOUtils;
import net.egork.misc.ArrayUtils;
import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class SearchingEarning {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int size = in.readInt();
        int count = in.readInt();
        int[] prices = IOUtils.readIntArray(in, size);
        ArrayUtils.sort(prices);
        int answer = 0;
        for (int i = 0; i < count; i++) {
            if (prices[i] < 0) {
                answer -= prices[i];
            }
        }
        out.printLine(answer);
    }
}
