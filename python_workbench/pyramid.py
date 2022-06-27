while 1 :

    n = eval(input("피라미드 층 수 : "))

    for i in range(n+1):
    
        for j in range(n+i) :
            if j<=(n-i) :
                print(" ",end="")
            else :
                print("*",end="")
    
        print("")
