st = [1,2,3,4,5,6]

n = int(len(st)/2)

for i in range(n) :
    st[i], st[-i-1] = st[-i-1], st[i]

print(st)