def solution(n):
    sum1 = 0
    for i in range(1, n+1):  # 1부터 n까지
        if i % 2 == 0:       # 짝수라면
            sum1 += i
    return (sum1 )