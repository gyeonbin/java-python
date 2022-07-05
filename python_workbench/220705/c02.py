class AA:
    n = 0
    def __init__(self,n):
        self.n = n
    def print(self):
        print('n =',self.n)
        if(self.n>0):
            print("양수입니다")
        else :
            print('음수입니다.')
    def inputnumber(self):
        self.n = eval(input("숫자를 입력하세요"))