package section6methods;

/**
 * Demonstrates recursive method calls and the call stack
 */
public class CountDown {

    public static void main(String[] args) {
        /*
         * When a method calls itself:
         * - At least one base case (no recursion in this case)
         * - At least one recursive case (where the recursion occurs)
         */
        countDownFrom(10);
        countUpTo(1, 10);
    }

    /**
     * Recursively counts down from the given number to 0
     * 
     * @param num starting number to count down from
     */
    public static void countDownFrom(int num) {
        if (num >= 0) {
            System.out.println(num);
            countDownFrom(num - 1);
        }
    }

    /**
     * Recursively counts up from start to end
     * 
     * @param start starting number to count from
     * @param end   ending number to count to
     */
    public static void countUpTo(int start, int end) {
        if (start <= end) {
            System.out.println(start);
            countUpTo(start + 1, end);
        }
    }

    /*
     * What happens in memory is part of the call stack (a stack that keeps
     * track of the method calls)
     * 
     * Stack notes:
     * - Can only remove from the top of the stack
     * - Adding an item to the stack is called pushing
     * - Removing from the stack is called popping
     */
}
