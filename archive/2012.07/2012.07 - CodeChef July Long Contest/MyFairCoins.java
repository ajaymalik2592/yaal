package net.egork;

import net.egork.numbers.Matrix;
import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class MyFairCoins {
    static Matrix matrix = new Matrix(2, 2);

    static {
        Matrix.mod = 1000000007;
        matrix.data[0][0] = matrix.data[0][1] = 2;
        matrix.data[1][0] = 1;
    }

	public void solve(int testNumber, InputReader in, OutputWriter out) {
        int count = in.readInt();
        Matrix result = matrix.power(count);
        long answer = (result.data[0][0] * (Matrix.mod + 1) / 2) % Matrix.mod;
        out.printLine(answer);
	}
}
