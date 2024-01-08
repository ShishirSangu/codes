class PerfectNumber:
    def __init__(self, number):
        self.number = number

    def is_perfect(self):
        divisors = []
        for i in range(1, self.number):
            if self.number % i == 0:
                divisors.append(i)
        return sum(divisors) == self.number


num = int(input("Enter a number: "))
perfect_num = PerfectNumber(num)

if perfect_num.is_perfect():
    print(num, "is a perfect number.")
else:
    print(num, "is not a perfect number.")
