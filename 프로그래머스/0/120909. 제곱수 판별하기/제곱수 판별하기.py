def solution(n):
    check = n**(1/2)
    if check%1 == 0:
        answer = 1
    else:
        answer = 2
    return answer