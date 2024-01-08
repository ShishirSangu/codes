class Harshadh_Number:
    def __init__(self, number):
        self.number = number

    def is_harshadh(self):
        sum_digit = sum(int(digit) for digit in str(self.number))
        return self.number % sum_digit == 0


num = int(input("Enter a number: "))
harshad_num = Harshadh_Number(num)

if harshad_num.is_harshadh():
    print(num, "is a Harshad number.")
else:
    print(num, "is not a Harshad number.")
