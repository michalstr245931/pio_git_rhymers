package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int MAX_SIZE = 12;
    public static final int EMPTY = -1;
    public static final int IS_EMPTY = -1;
    private int[] numbers = new int[MAX_SIZE];

    public int total = EMPTY;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == MAX_SIZE-1;
    }

    protected int peekaboo() {
        if (callCheck())
            return IS_EMPTY;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return IS_EMPTY;
        return numbers[total--];
    }

}