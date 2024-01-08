class Sum_Of_Digit:
    def __init__(self, num_aaa):
        self.number = num_aaa

    def added_num(self):
        # num_str = self.number
        sum_num = 0
        # digit_num = 0
        while 0 != self.number:
            digit_num = self.number % 10
            sum_num = sum_num + digit_num
            self.number = self.number // 10

        return sum_num


num_aa = int(input("Enter a number : "))
# num_aa = 123
# Number_Num = Sum_Of_Digit(num_aa)
Sum_Number = Sum_Of_Digit(num_aa).added_num()
print(Sum_Number)


class SumOfDigits:
    def __init__(self, num_num):
        self.number = num_num

    def calculate_sum(self):
        # Convert the number to a string
        # num_str = str(self.number)

        # Calculate the sum of digits
        digit_sum = 0
        while self.number != 0:
            digit_sum += self.number % 10
            self.number //= 10

        return digit_sum


# Example usage
number = int(input("Enter a number : "))
digit_sum_calculator = SumOfDigits(number)
sum_of_digits = digit_sum_calculator.calculate_sum()
print(f"The sum of digits in {number} is: {sum_of_digits}")
