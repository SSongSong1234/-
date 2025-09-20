def solution(sides):
    max_side = 0
    for i in sides:
        if i > max_side:
            max_side=i
    total = sum(sides) - max_side
    
    if max_side < total:
        return 1
    else:
        return 2