base = int(input("Enter a base number : "))
exp = int(input("Enter power number : "))

power = 1
for i in range(1,exp+1):
    power = power*base
print(power)