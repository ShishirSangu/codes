num = int(input("Enter a number : "))

rev = 0 
temp = num
while temp > 0:
    digit = temp%10
    rev = (rev * 10) + digit
    temp = temp//10
print(rev)
if rev==num:
    print(num," Number is palindrome")
else:
    print(num," Number is not a palindrome")