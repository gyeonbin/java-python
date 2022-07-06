from flask import request
def Result(num1,num2):

    result = 0
    if num1 is None:
        num1 = 0
    else:
        num1=int(request.args.get("num1"))
    if num2 is None:
        num2 = 0
    else:
        num2=int(request.args.get("num2"))

    if num1>num2:
        num1,num2 = num2,num1
        result = 0
    
    for i in range(num1,num2+1):
        result +=i
    
    return result