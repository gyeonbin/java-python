def xy(x,y) :
    ans = 1
    for i in range(y) :
        ans *= x
    return ans

while 1 :
    x = eval(input("x = "))
    y = eval(input("y = "))


    print("ans = ", xy(x,y))