a=6
b=45

if a<b:
    i=b
else:
    i=a

while i%a!=0 or i%b!=0:
    i+=1

print(i)