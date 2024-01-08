class StrongNumber:
    def __init__(self, number):
        self.number = number

    @staticmethod
    def factorial(n):
        if n == 0:
            return 1
        fact = 1
        for i in range(1, n+1):
            fact *= i
        return fact

    def is_strong(self):
        digit_sum = 0
        num = self.number
        while num > 0:
            digit = num % 10
            digit_sum += self.factorial(digit)
            num //= 10
        return digit_sum == self.number


number_num = 145
strong_num = StrongNumber(number_num)
is_strong = strong_num.is_strong()
print(f"{number_num} is a strong number: {is_strong}")
