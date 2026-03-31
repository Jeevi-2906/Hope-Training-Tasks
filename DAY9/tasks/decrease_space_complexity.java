class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        StringBuilder result = new StringBuilder();
        int n = s.length();
        int cycle = 2 * numRows - 2;

        for (int i = 0; i < numRows; i++) {
            int j = i;

            while (j < n) {
                result.append(s.charAt(j));

                if (i != 0 && i != numRows - 1) {
                    int diagonal = j + cycle - 2 * i;
                    if (diagonal < n) {
                        result.append(s.charAt(diagonal));
                    }
                }

                j += cycle;
            }
        }

        return result.toString();
    }
}