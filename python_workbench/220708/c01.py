class Point:
    
    x,y=0,0
    def __init__(self,x,y):
        self.x=x
        self.y=y
    def __str__(self):
        return "["+str(self.x)+","+str(self.y)+","

class Circle:
    r=0
    p=Point(0,0)
    def __init__(self,x,y,r):
        self.p=Point(x,y)
        self.r=r
    def showInfo(self):
        print(self.p,self.r)


