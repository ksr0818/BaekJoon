def solution(sizes):
    answer = 0
    
    max_w = 0
    max_h = 0
    
    for w,h in sizes:
        large = max(w,h)
        small = min(w,h)
        
        max_w = max(max_w, large)
        max_h = max(max_h, small)
        
    return max_w * max_h