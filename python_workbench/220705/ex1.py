str = "What is important is that you should choose what is best for you"

cnt = 0
for i in str:
    if i=="s":
        print(i,end=" ")
        print(cnt)
    cnt+=1

myst = "한글\n잘대"
print(myst)
myst = "한글\t잘대"
print(myst)
myst = "한글\\잘대"
print(myst)
myst = "한글''잘대"
print(myst)