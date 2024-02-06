package org.tfoc;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
class SolutionTest {

    @Test
    void testSolution() {

        log.info("Don't forget to write the tests to make sure it works. Enjoy!");
    }

    @ParameterizedTest
    @CsvSource(value = {"(([]),false","({)}),false","(({}([]))),true", "([{[]}]]),false"})
    void isValid(String input, boolean result) {

        boolean response = Solution.isValid(input);
        assertEquals(result, response);
    }
}