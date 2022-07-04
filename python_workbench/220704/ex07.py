st = [1,2,3,4,5]

st.remove(2)
print("st[0]:",st)

st.insert(3,5)
st.append(10)
print("st[1]:",st)
st.extend(["하나","둘","셋"])
print("st[2]",st)

for i in range(len(st)):
    print(st[i])