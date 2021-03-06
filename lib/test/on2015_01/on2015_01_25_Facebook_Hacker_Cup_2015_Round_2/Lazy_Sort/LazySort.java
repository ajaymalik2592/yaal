package on2015_01.on2015_01_25_Facebook_Hacker_Cup_2015_Round_2.Lazy_Sort;



import net.egork.misc.ArrayUtils;
import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class LazySort {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
		int count = in.readInt();
		int[] order = in.readIntArray(count);
		for (int i = 0; i < 2; i++) {
			int from = order[0];
			int to = order[0];
			int start = 1;
			int end = count - 1;
			for (int j = 1; j < count; j++) {
				if (order[start] == from - 1) {
					start++;
					from--;
				} else if (order[start] == to + 1) {
					start++;
					to++;
				} else if (order[end] == from - 1) {
					end--;
					from--;
				} else if (order[end] == to + 1) {
					end--;
					to++;
				} else {
					break;
				}
			}
			if (from == 1 && to == count) {
				out.printLine("Case #" + testNumber + ": yes");
				return;
			}
			ArrayUtils.reverse(order);
		}
		out.printLine("Case #" + testNumber + ": no");
    }
}
