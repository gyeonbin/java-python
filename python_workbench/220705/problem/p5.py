def main():
    n=int(input("값을 입력하세요:"))
    if n<0:
        print("입력한 값은 0보다 작습니다.")
    elif n>=0 and n<10:
        print("입력한 값은 0이상 10미만입니다.")
    elif n>=10 and n<20:
        print("입력한 값은 10이상 20미만 입니다.")
    else:
        print("입력한 값은 20이상입니다.")

main()