mlist = list(range(10))
print(mlist)

mlist = [i for i in range(10)]
print(mlist)

mlist = [i*2 for i in range(10)]
print(mlist)

mlist = [(i*2,j) for i,j in zip(range(10),range(10))]
print(mlist)