def solution(n, times):
#K분안에 몇명이 들어갈수있는가?
    
    left = 1
    right = max(times) * n
    answer = 0
    
    while left <= right:
        mid = (left + right) // 2
        
        total = 0
        for num in times:
            total += mid // num
        #total = sum(mid // time for in times)
        
        if total >= n :
            right = mid - 1
            answer = mid
        else :
            left = mid + 1
    
    return answer