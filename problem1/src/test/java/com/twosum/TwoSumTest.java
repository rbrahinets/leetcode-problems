package problem1.src.test.java.com.twosum;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import problem1.src.main.java.com.twosum.TwoSum;

public class TwoSumTest {
    private TwoSum twoSum;

    @BeforeEach
    void setUp() {
        twoSum = new TwoSum();
    }

    @Test
    @DisplayName("Length of array is valid")
    void length_of_array_is_valid() {
        assertDoesNotThrow(
            () -> twoSum.twoSum(new int[]{3, 3}, 6)
        );
    }

    @Test
    @DisplayName("Throw exception when array is null")
    void throw_exception_when_array_is_null() {
        assertThrows(
            NullPointerException.class,
            () -> twoSum.twoSum(null, 6)
        );
    }

    @Test
    @DisplayName("Throw exception when length of array is invalid")
    void throw_exception_when_length_of_array_is_invalid() {
        assertThrows(
            Exception.class,
            () -> twoSum.twoSum(new int[]{3}, 6)
        );
    }

    @Test
    @DisplayName("Result array is not null")
    void result_array_is_not_null() throws Exception {
        assertTrue(twoSum.twoSum(new int[]{3, 3}, 6) != null);
    }

    @Test
    @DisplayName("Length of result array is valid")
    void length_of_result_array_is_valid() throws Exception {
        assertTrue(twoSum.twoSum(new int[]{3, 3}, 6).length == 2);
    }

    @Test
    @DisplayName("Result is correct")
    void result_is_correct() throws Exception {
        int[] expected = {0, 1};
        int[] actual = twoSum.twoSum(new int[]{2, 7, 11, 15}, 9);
        boolean isCorrectResult = (actual[0] == expected[0] && actual[1] == expected[1])
                               || (actual[0] == expected[1] && actual[1] == expected[0]);

        assertTrue(isCorrectResult);
    }

    @Test
    @DisplayName("Result array has not duplicate")
    void result_array_has_not_duplicate() throws Exception {
        int[] result = twoSum.twoSum(new int[]{3, 3}, 6);

        assertTrue(result[0] != result[1]);
    }
}
