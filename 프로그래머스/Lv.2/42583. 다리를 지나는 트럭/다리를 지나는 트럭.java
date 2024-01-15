import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> queue = new LinkedList<>();
		int sum = 0;
		int time = 0; 

		for(int i = 0; i < truck_weights.length; i++) {
			int truck = truck_weights[i];

			while(true) {
				// 큐에 아무것도 없는 경우
				if(queue.isEmpty()) { 
					queue.add(truck);
					sum += truck;
					time++;
					break;
                    
                    // 트럭이 다 찬 경우 
				} else if(queue.size() == bridge_length) { 
					sum -= queue.poll();
                    
                    // 큐가 차지않았음
                    
				} else  { 
                    
					// weight 내에서 새로운 트럭 추가
					if(sum + truck <= weight) {
						queue.add(truck);
						sum += truck;
						time++;
						break;
					} else { 
                        
						// 넘는다면 0을 추가
						queue.add(0);
						time++;
					}
				}
			}
		}

        // 마지막 트럭에서 다리 길이만큼 지나가야하기에 + 다리 길이 
		return time + bridge_length; 
    }
}