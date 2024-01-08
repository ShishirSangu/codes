# class PrimeNo:
#     def __int__(self, num):
#         self.Num = num
#
#     def is_prime(self):
#         if self.num <= 1:
#             return False
#
#         for i in range(2, int(self.num ** 0.5) + 1):
#             if self.num % i == 0:
#                 return False
#         return True
#
#
# # num = 17
#
# prime_test = PrimeNo(17)
# is_prime = prime_test.is_prime()
# # print(result)
# if is_prime():
#     print(f"Yes {num} is prime number")
# else:
#     print(f"No {num} is not a prime number")

class PrimeChecker:
    def __init__(self, num):
        self.number = num

    def is_prime(self):
        if self.number <= 1:
            return False

        for i in range(2, int(self.number ** 0.5) + 1):
            if self.number % i == 0:
                return False

        return True


# Example usage:
a = int(input("Enter a number : "))
b = int(input("Enter a number : "))
for number in range(a, b):
    prime_checker = PrimeChecker(number)
    is_prime = prime_checker.is_prime()

    if is_prime:
        print(f"{number} is a prime number.")
    else:
        print(f"{number} is not a prime number.")


print(int(67 ** 0.5))