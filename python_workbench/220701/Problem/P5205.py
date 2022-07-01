st = [1,2,3,4,5,6,7,8,9,10]

st_1 =["사과"]
n = 0

for i in range(len(st)) :
    if st[i]%2 == 1 :
        st_1[n] = list(st[i])
        n = n+1

print(st_1)