package net.egork;

import net.egork.io.IOUtils;
import net.egork.misc.MiscUtils;
import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
		int count = in.readInt();
		int maxTwoPoint = in.readInt();
		int[] team = new int[count];
		int[] distance = new int[count];
		IOUtils.readIntArrays(in, team, distance);
		MiscUtils.decreaseByOne(team);
		int[] score = new int[2];
		for (int i = 0; i < count; i++)
			score[team[i]] += distance[i] == -1 ? 1 : (distance[i] <= maxTwoPoint ? 2 : 3);
		out.printLine(score[0] + ":" + score[1]);
    }
}
