import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        
        Map<String,Integer> map = new HashMap<>();
        
        for (int i =0; i < players.length; i++) map.put(players[i],i+1);
        
        for (int i =0 ; i < callings.length; i++) {
            String temp = "";
             
            temp = players[map.get(callings[i])-2];
            players[map.get(callings[i])-2] = players[map.get(callings[i])-1];
            players[map.get(callings[i])-1] = temp;
                
            map.put(callings[i], map.get(callings[i])-1);
            map.put(temp, map.get(temp) +1);
            
        } 
        answer = players;
        return answer;
    }
}