class FriendlyPairs:
    def __init__(self, start, end):
        self.start = start
        self.end = end

    def find_pairs(self):
        pairs = []
        for num1 in range(self.start, self.end + 1):
            sum1 = self.get_divisor_sum(num1)
            for num2 in range(num1 + 1, self.end + 1):
                if sum1 == self.get_divisor_sum(num2):
                    pairs.append((num1, num2))
        return pairs

    @staticmethod
    def get_divisor_sum(number):
        divisors = [1]
        for i in range(2, int(number ** 0.5) + 1):
            if number % i == 0:
                divisors.append(i)
                if i != number // i:
                    divisors.append(number // i)
        return sum(divisors)


start = int(input("Enter the starting number: "))
end = int(input("Enter the ending number: "))

friendly_pairs = FriendlyPairs(start, end)
pairs = friendly_pairs.find_pairs()

if pairs:
    print("Friendly pairs within the range are:")
    for pair in pairs:
        print(pair)
else:
    print("No friendly pairs found within the range.")
