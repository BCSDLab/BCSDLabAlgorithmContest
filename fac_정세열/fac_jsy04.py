num = input()
def fun(num):
    l = []
    l.append(num)
    c = len(l)
    m = pow(5,c)
    cnt = 0
    flag = num
    while(flag%m == 0):
        cnt = cnt + c
        flag = flag / m
    return cnt
n = 0
for i in range(1, num+1):
    n = n + fun(i)
    n = n % 500000000000000007
print n