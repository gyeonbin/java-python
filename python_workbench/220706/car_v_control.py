from 제어 import *

차1 = 아반떼()

while True:
    선택 = int(input("1.속도제어 2.속도확인\n"))
    print()
    if 선택 == 1:
        
        차1.change()
    elif 선택 == 2:
        차1.show()
