num = int(input("Enter number : "))

def FactNum(num):
    for i in range(1,num+1):
        if(num%i==0):
            print(i,end=" ")

a = FactNum(num)
print(a)

