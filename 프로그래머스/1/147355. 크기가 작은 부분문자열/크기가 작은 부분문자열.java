class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int tLen = t.length();
        int pLen = p.length();
        Long longP = Long.parseLong(p);
        
        for (int i = 0; i < tLen - pLen + 1; i++) {
            if (Long.parseLong(t.substring(i,i+pLen)) <= longP) answer++;
            System.out.println(Long.parseLong(t.substring(i,i+pLen)));
            System.out.println(Long.parseLong(t.substring(i,i+pLen))<= longP);
        }
        return answer;
    }
}