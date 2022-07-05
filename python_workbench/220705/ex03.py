def main() :
    print("main 시작")
    s = 0
    a = input("숫자를 입력하세요")
    print(type(a))
    num = int(a)
    print(type(num))
    if num>s:
        print("num은 {}보다 큽니다.".format(s))

    else :
        print("num은 {}보다 작습니다.".format(s))



    print("main 끝")

main()