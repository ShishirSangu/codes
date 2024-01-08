class Auto_Morphic:
    def __init__(self, number):
        self.number = number

    def is_it(self):
        sq = self.number * self.number
        sq_str = str(sq)
        num_str = str(self.number)

        return sq_str.endswith(num_str)


num = int(input("Enter a number: "))
automorphic_num = Auto_Morphic(num)

if automorphic_num.is_it():
    print(num, "is an automorphic number.")
else:
    print(num, "is not an automorphic number.")
