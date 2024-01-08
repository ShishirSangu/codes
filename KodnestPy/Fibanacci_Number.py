# class Fib_Num:
#     def __init__(self, number):
#         self.number = number
#
#     def fib_series(self):
#         if self.number <= 0:
#             return None
#         if self.number == 1:
#             return 0
#         if self.number == 2:
#             return 1
#
#         num1 = 0
#         num2 = 1
#         fib_current = 0
#         for i in range(3, self.number + 1):
#             fib_current = num1 + num2
#             num1 = num2
#             num2 = fib_current
#
#         return fib_current
#
#
# number_num = 5
# fib_fib = Fib_Num(number_num)
# fib_is = fib_fib.fib_series()
# print(fib_is)
#


def fib(number_num1):
    series = [0, 1]

    while len(series) < number_num1:
        num_next = series[-1] + series[-2]
        series.append(num_next)

    return series


number1 = 5
fib_number_num = fib(number1)
print(fib_number_num)

