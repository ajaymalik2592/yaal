package net.egork;

import net.egork.chelper.task.NewTopCoderTest;
import net.egork.chelper.tester.TestCase;

import java.util.*;

public class CubesOnATableTestCase {
    @TestCase
    public Collection<NewTopCoderTest> createTests() {
        List<NewTopCoderTest> tests = new ArrayList<NewTopCoderTest>();
        for (int i = 1; i <= 500; i++) {
            tests.add(createTest(null, i));
        }
        return tests;
    }

    private NewTopCoderTest createTest(Object answer, Object...arguments) {
        return new NewTopCoderTest(arguments, answer);
    }
}