import java.util.*;

class Solution {
    
    public static HashSet<Integer> numberSet = new HashSet<>();
    
    public int solution(String numbers) {
        int count = 0;
        
        recursive("", numbers);

        
        for (int num : numberSet) {
            if(isPrime(num)) {
                count ++;
            }
        }
        
        return count;
    }
    
    private static boolean isPrime(int num) {
        if(num == 1 || num == 0) {
            return false;
        }
        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
    
    // 입력 받은 숫자를 나올 수 있는 최대의 조합을 구해서 HashSet으로 만들어 반환한다.
        private void recursive(String comb, String others) {
            // 현재 조합을 set에 추가한다.
            if(!comb.equals("")) {
                numberSet.add(Integer.parseInt(comb));
            }
    
            // 남은 숫자 중 한개를 더해 새로운 조합을 만든다.
            for(int i=0; i<others.length(); i++) {
                if(!comb.equals("")) {
                    // HashSet의 타입을 Integer형으로 만들어준다.
                    numberSet.add(Integer.valueOf(comb));
                }
    
                recursive(comb + others.charAt(i), others.substring(0, i) + others.substring(i+1));
            }
        }
    
}