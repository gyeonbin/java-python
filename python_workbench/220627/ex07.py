def 합(n) :
    sum = 0

    for i in range(1,n+1) :
        sum = sum + i

    return sum



n = eval(input("값을 넣으세요"))
print(합(n))

