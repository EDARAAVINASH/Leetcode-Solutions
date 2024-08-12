class Solution {
    public List<String> validStrings(int n) {
        List<String> result = new ArrayList<>();
        generate("", n, result);
        return result;
    }

    private void generate(String s, int n, List<String> result) {
        if (s.length() == n) {
            result.add(s);
            return;
        }

        // If the last character is not '0', we can safely add '0' without creating "00"
        if (s.isEmpty() || s.charAt(s.length() - 1) != '0') {
            generate(s + '0', n, result);
        }

        // Always safe to add '1'
        generate(s + '1', n, result);
    }
}
