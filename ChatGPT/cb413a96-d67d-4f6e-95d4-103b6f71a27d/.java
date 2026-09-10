
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";

        System.out.println(findAnagramIndices(s, p));  // Output: [0, 6]
    }

    public static List<Integer> findAnagramIndices(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if(s == null || s.length() == 0 || p == null || p.length() == 0) {
            return result;
        }

        int[] target = new int[26];
        for(char c : p.toCharArray()) {
            target[c - 'a']++;
        }

        char[] arr = s.toCharArray();
        int left = 0, right = 0, count = p.length();

        while(right < s.length()) {
            if(target[arr[right] - 'a'] > 0) {
                count--;
            }
            target[arr[right] - 'a']--;
            right++;

            if(count == 0) {
                result.add(left);
            }

            if(right - left == p.length()) {
                if(target[arr[left] - 'a'] >= 0) {
                    count++;
                }
                target[arr[left] - 'a']++;
                left++;
            }
        }

        return result;
    }
}
