class pn:
    n = 0
    def __init__(self,n):
        self.n = n
    def print(self):
        if self.n>=0:
            print("양수")
        else:
            print("음수")
    def input(self):
        self.n=eval(input("값 입력:"))