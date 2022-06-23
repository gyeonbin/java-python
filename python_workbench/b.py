import math

a = input("a의 값을 입력\n")
b = input("b의 값을 입력\n")

a = int(a)
b = int(b)

print('{0} + {1} = {2}'.format(a,b,a+b))
print('{0} - {1} = {2}'.format(a,b,a-b))
print('{0} * {1} = {2}'.format(a,b,a*b))
print('{0} / {1} = {2}'.format(a,b,math.floor(a/b)))