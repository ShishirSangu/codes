num = int(input("Enter a number : "))

flag = False
if num == 1 or num == 0:
    print(num, "is not a prime number")
elif num > 1:
    # check for factors
    for i in range(2, int(num ** 0.5)+1):
        if (num % i) == 0:
            # if factor is found, set flag to True
            flag = True
            # break out of loop
            break

    # check if flag is True
    if flag:
        print(num, "is not a prime number")
    else:
        print(num, "is a prime number")

