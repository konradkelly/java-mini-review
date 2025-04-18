public class Practice {

    /**
     * Prints each item from an array on a separate line.
     * 
     * Example:
     * 
     * input:
     * {"welcome", "to", "sdev", "220"}
     * 
     * printed output:
     * welcome
     * to
     * sdev
     * 220
     * 
     * 
     * 
     * @param items an array of strings to print
     */
  
    public static void printItems(String[] items) {
        // TODO: Implement this method here!
        for (String item : items) {
            System.out.println(item);
        }
    }

    /**
     * Returns whether a is more than twice the value of b.
     * 
     * Examples:
     * input:
     *   a: 10, b: 3
     * return:
     *   true
     * 
     * input:
     *   a: 6, b: 4
     * return:
     *   false
     * 
     * input:
     *   a: 4, b: 2
     * return:
     *   false
     * 
     * @param a an int
     * @param b an int
     * @return true if a is strictly more than twice the value of b, false otherwise
     */
    public static boolean moreThanDouble(int a, int b) {
        if (a > b * 2) {
            return true;
        }
        return false;
    }


    /**
     * Returns whether every word in the array starts with the letter A (either
     * upper or lower case).
     * 
     * Examples:
     * input:
     *   {"alligators", "are", "AWESOME"}
     * return:
     *   true
     * 
     * input:
     *   {"apes", "can", "be", "amazing"}
     * return:
     *   false
     * 
     * Edge case: If array is empty, return true.
     * 
     * @param words a array of words
     * @return true if every word starts with A (case-insensitive), false otherwise.
     */
    public static boolean allStartWithA(String[] words) {
        if (words == null || words.length == 0) {
            return true;
        }

        for (String word : words) {
            if (!word.toLowerCase().startsWith("a")) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("///// Print items /////");
        System.out.println("Calling printItems(new String[]{\"welcome\", \"to\", \"sdev\", \"220\"})");
        printItems(new String[]{"welcome", "to", "sdev", "220"});
        System.out.println();
        System.out.println("Calling printItems(new String[]{\"hello\", \"world\"})");
        printItems(new String[]{"hello", "world"});
        System.out.println();
        System.out.println("///// More than Double /////");
        System.out.println("moreThanDouble(10, 3): " + moreThanDouble(10, 3));
        System.out.println("moreThanDouble(6, 4): " + moreThanDouble(6, 4));
        System.out.println("moreThanDouble(4, 2): " + moreThanDouble(4, 2));
        System.out.println();
        System.out.println("///// All Start With A /////");
        System.out.println("allStartWithA(new String[]{\"alligators\", \"are\", \"AWESOME\"}): " + allStartWithA(new String[]{"alligators", "are", "AWESOME"}));
        System.out.println("allStartWithA(new String[]{\"apes\", \"can\", \"be\", \"amazing\"}): " + allStartWithA(new String[]{"apes", "can", "be", "amazing"}));
        System.out.println("allStartWithA(new String[]{}): " + allStartWithA(new String[]{}));
        System.out.println();
    }
}
/*        





 */
    
