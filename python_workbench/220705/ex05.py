def main():
    num=int(input('input number:'))
    
    if num%2==0 and num%3==0:
        print("6의 배수")
    else:
        print('{}은 num입니다.'.format(num))

main()