a = 42
b = 120

if a>b:
    i=b
else:
    i=a

while a%i!=0 or b%i!=0:
    i-=1

print(i)