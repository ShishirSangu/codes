class SumOfNaturalNo:
    def __init__(self, limit):
        self.limit = limit

    def calculate_sum(self):
        return sum(range(1, self.limit + 1))


limit_value = int(input("Enter a number : "))
Sum_Calculate = SumOfNaturalNo(limit_value)
result = Sum_Calculate.calculate_sum()
print(result)


class Number:
    def __init__(self, limit_1):
        self.limit_1 = limit_1

    def sum_num(self):
        e = 0
        for i in range(1, self.limit_1 + 1):
            e += i
        return e


a = int(input("Enter a number : "))
b = int(input("Enter a number : "))
limitA = 0
for limitA in range(a, b+1):
    NumberNum = Number(limitA)


result_1 = Number(limitA).sum_num()
print(result_1)
