num = input()
def fun(num):
    l = []
    l.append(num)
    c = len(l)
    m = pow(5,c)
    cnt = 0
    flag = num
    while(flag%5 == 0):
        if(flag % m == 0):
            cnt = cnt + c
            flag = flag / m
        else :
            cnt = cnt+1
            flag = flag/5
    return cnt
n = 0
for i in range(1, num+1):
    n = n + fun(i)
    n = n % 500000000000000007
print n