package com.addtwonumbers;

import java.math.BigInteger;

class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode listNode1, ListNode listNode2) {
        if (listNode1 == null) {
            throw new RuntimeException("First parameter is null");
        } else if (listNode2 == null) {
            throw new RuntimeException("Second parameter is null");
        }

        if (getSum(listNode1, listNode2).equals("0")) {
            return new ListNode(0, null);
        }

        return parseToListNode(getSum(listNode1, listNode2));
    }

    private ListNode parseToListNode(String sum) {
        ListNode result = null;

        for (int i = 0; i < sum.length(); i++) {
            result = new ListNode(Integer.parseInt(sum.split("")[i]), result);
        }

        return result;
    }

    private String getSum(ListNode listNode1, ListNode listNode2) {
        BigInteger sum = getNumber(listNode1).add(getNumber(listNode2));
        StringBuilder sumString = new StringBuilder();
        int length = String.valueOf(sum).length();

        for (int i = 0; i < length; i++) {
            sumString.append(sum.mod(BigInteger.valueOf(10)));
            sum = sum.divide(BigInteger.valueOf(10));
        }

        return sumString.reverse().toString();
    }

    private BigInteger getNumber(ListNode listNode) {
        StringBuilder number = new StringBuilder();

        while (listNode != null) {
            number.append(listNode.getValue());
            listNode = listNode.getNext();
        }

        return new BigInteger(number.reverse().toString());
    }
}
