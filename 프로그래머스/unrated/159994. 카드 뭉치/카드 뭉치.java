class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "No";
        int j = 0;
        int k = 0;
        for (int i = 0; i < goal.length; i++) {
            if (goal[i].equals(cards2[k])) {
                if (k < cards2.length-1) k++;
            }
            else if (goal[i].equals(cards1[j])) {
                if (j < cards1.length-1) j++;
            }
            else return "No";
        }
        return "Yes";
    }
}