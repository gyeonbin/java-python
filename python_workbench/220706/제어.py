class 아반떼:
    v = 0
    # def __init__(self,n):
    #     self.v = n

    def change(self):
        v = int(input("속도 몇으로\n"))
        self.v = v
        print()
    
    def show(self):
        if self.v>100:
            print("속도위반, {}km\n".format(self.v))
        else:
            print("{}km\n".format(self.v))