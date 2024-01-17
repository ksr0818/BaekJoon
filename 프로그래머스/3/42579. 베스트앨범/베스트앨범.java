import java.util.*;
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        
        // 해시맵에 장르별 플레이 횟수 중첩해서 더해주기 
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0;i<genres.length;i++){
            map.put(genres[i],map.getOrDefault(genres[i],0)+plays[i]);
        }
        
        // 플레이 횟수기준을 정렬 
        ArrayList<Map.Entry<String,Integer>> mapList = new ArrayList<>(map.entrySet());
        
        Collections.sort(mapList, new Comparator<>(){
           @Override
            public int compare(Map.Entry<String,Integer> o1, Map.Entry<String,Integer> o2){
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        
        // 가장많은 플레이 횟수 재생 장르부터 첫번째 인덱스와 두번째 인덱스 고르고 정답배열에 넣기 
        ArrayList<Integer> list = new ArrayList<>();
        
        for(Map.Entry<String,Integer> entry : mapList){
            // System.out.println(entry.getKey()+" "+ entry.getValue());
            String genre = entry.getKey();
            
            
            int max =0;
            int first = -1;
            for(int i=0;i<genres.length;i++){
                if(genre.equals(genres[i]) && max<plays[i]){
                    max = plays[i];
                    first=i;
                }
            }
            
            list.add(first);
                
            max =0;
            int second = -1;
            for(int i=0;i<genres.length;i++){
                if(genre.equals(genres[i]) && max<plays[i] && first!=i){
                    max = plays[i];
                    second=i;
                }
            }
            
            if(second>=0) list.add(second);   
        }
       
        int[] answer = new int[list.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}