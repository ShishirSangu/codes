class Arm_num:
    def __init__(self, number):
        self.num = number

    def is_armstrong(self):
        num_str = str(self.num)
        digit_numm = len(num_str)
        num_int = int(self.num)
        # result = 1
        # digit = 0
        sum_is = 0
        for i in range(digit_numm):
            digit_num = num_int % 10
            sum_is = sum_is + (digit_num ** digit_numm)
            num_int = num_int // 10

        return sum_is


number_num = 153
arm_num_is = Arm_num(number_num)
answer_is = arm_num_is.is_armstrong()
if answer_is == number_num:
    print(f"number is armstrong number because the number entered '{number_num}' and '{answer_is}' both are same")
else:
    print(f"number is not armstrong number because the number entered '{number_num}' and '{answer_is}' both are same")
