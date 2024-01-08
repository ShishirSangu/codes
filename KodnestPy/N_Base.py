# class N_base:
#     def __init__(self, base, power):
#         self.base = base
#         self.power = power
#
#     def calculate_base(self):
#         result1 = 1
#         for i in range(self.power):
#             result1 = result1 * self.base
#
#         return result1
#
#
# # base_num = int(input("Enter base: "))
# # power_num = int(input("Enter power: "))
# base_num = 2
# power_num = 3
# power_instance = N_base(base_num, power_num)
# result = power_instance.calculate_base()
# print(result)


class N_base:
    def __init__(self, base, power):
        self.base = base
        self.power = power

    def calculate_base(self):
        answer = 1
        for i in range(self.power):
            answer *= self.base

        return answer


# base_num = int(input("Enter base : "))
# power_num = int(input("Enter power : "))
base_num = 2
power_num = 3
Power_number = N_base(base_num, power_num)
result = Power_number.calculate_base()
print(result)
