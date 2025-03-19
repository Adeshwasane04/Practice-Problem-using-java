package Accenture;
public class MyQuestion2 {
    public static void main(String[] args) {
        String str = "abc.b.cc.abccd";
        System.out.println(isCheck(str));  // Prints the length of the longest segment
    }

    static int isCheck(String str) {
        int count1 = 0;  // To store the length of the longest segment
        int max = 0;     // To track the maximum length of all segments
        int count = 0;   // To count the length of the current segment

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // When a period is encountered, check the length of the current segment
            if (ch == '.') {
                if (count > max) {
                    max = count;  // Update max if the current segment is longer
                }
                count1 = count;  // Store the current segment length in count1
                count = 0;       // Reset count for the next segment
                continue;        // Skip to the next character
            }

            count++;  // Increment count for characters in the current segment

            // Check if we have a new max length
            if (max < count1) {
                max = count1;  // Update max
            }
        }

        // Final check for the last segment (it might not be followed by a period)
        if (count > max) {
            max = count;  // Update max if the last segment is the longest
        }

        return max;
    }
}
