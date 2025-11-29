class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;
        StringBuilder[] arr = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) arr[i] = new StringBuilder();
        int idx = 0, step = 1;
        for (char c : s.toCharArray()) {
            arr[idx].append(c);
            if (idx == 0) step = 1;
            else if (idx == numRows - 1) step = -1;
            idx += step;
        }
        StringBuilder res = new StringBuilder();
        for (StringBuilder sb : arr) res.append(sb);
        return res.toString();
    }
}
