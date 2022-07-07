def gen(n):
    sum = 0
    st_n = str(n)
    for i in st_n:
        sum = int(i)
    return sum


n=input()

if n%10<9:
    n = n*n
