class AbundantNumber:
    def __init__(self, number):
        self.number = number

    def is_abundant(self):
        num_sum = sum(i for i in range(1, self.number) if self.number % i == 0)
        return num_sum > self.number


num = int(input("Enter a number: "))
abundant_num = AbundantNumber(num)

if abundant_num.is_abundant():
    print(num, "is an abundant number.")
else:
    print(num, "is not an abundant number.")
