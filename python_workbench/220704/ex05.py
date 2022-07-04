class AA:
    st = [1,2,3,4,5,6,7,8,9,10]
    def doA(self):
        mylen = len(self.st)
        mymin = min(self.st)
        mymax = max(self.st)
        print('mylen:',mylen)
        print('mymin:',mymin)
        print('mymax:',mymax)

aa = AA()
aa.doA()
print(aa.st)