package com.addtwonumbers;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AddTwoNumbersTest {
    private AddTwoNumbers addTwoNumbers;

    @BeforeEach
    void setUp() {
        addTwoNumbers = new AddTwoNumbers();
    }

    @Test
    @DisplayName("Method addTwoNumbers has exception when first parameter is null")
    void method_addTwoNumbers_has_exception_when_first_parameter_is_null() {
        assertThrows(
            RuntimeException.class,
            () -> addTwoNumbers.addTwoNumbers(null, new ListNode())
        );
    }

    @Test
    @DisplayName("Method addTwoNumbers has exception when second parameter is null")
    void method_addTwoNumbers_has_exception_when_second_parameter_is_null() {
        assertThrows(
            RuntimeException.class,
            () -> addTwoNumbers.addTwoNumbers(new ListNode(), null)
        );
    }

    @Test
    @DisplayName("Method addTwoNumbers work corect")
    void method_addTwoNumbers_work_corect() {
        ListNode listNode1 = new ListNode(3);
        listNode1 = new ListNode(4, listNode1);
        listNode1 = new ListNode(2, listNode1);

        ListNode listNode2 = new ListNode(4);
        listNode2 = new ListNode(6, listNode2);
        listNode2 = new ListNode(5, listNode2);

        ListNode actual = addTwoNumbers.addTwoNumbers(listNode1, listNode2);

        ListNode expected = new ListNode(8);
        expected = new ListNode(0, expected);
        expected = new ListNode(7, expected);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Method addTwoNumbers work corect with zero values")
    void method_addTwoNumbers_work_corect_with_zero_values() {
        ListNode actual = addTwoNumbers.addTwoNumbers(new ListNode(0), new ListNode(0));
        ListNode expected = new ListNode(0);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Method addTwoNumbers work corect ")
    void method_addTwoNumbers_work_corect_() {
        ListNode listNode1 = new ListNode(6);
        listNode1 = new ListNode(5, listNode1);

        ListNode listNode2 = new ListNode(9);
        listNode2 = new ListNode(4, listNode2);
        listNode2 = new ListNode(5, listNode2);

        ListNode actual = addTwoNumbers.addTwoNumbers(listNode1, listNode2);

        ListNode expected = new ListNode(1);
        expected = new ListNode(0, expected);
        expected = new ListNode(1, expected);
        expected = new ListNode(0, expected);

        assertEquals(expected, actual);
    }
}
