def solution(n):
    sum = 0
    # n을 10으로 나눈 나머지를 더한다
    # n을 10으로 나눈 몫으로 바꾼다.
    
    while (n > 0) :
        sum = sum + (n % 10)
        n = int(n/10)
        
    return sum