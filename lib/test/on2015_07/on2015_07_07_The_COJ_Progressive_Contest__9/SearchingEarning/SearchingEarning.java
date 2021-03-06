package on2015_07.on2015_07_07_The_COJ_Progressive_Contest__9.SearchingEarning;



import net.egork.misc.ArrayUtils;
import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class SearchingEarning {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int size = in.readInt();
        int count = in.readInt();
        int[] prices = in.readIntArray(size);
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
