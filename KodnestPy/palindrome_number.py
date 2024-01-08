class PalindromeNumber:
    def __init__(self, num_num):
        self.number = num_num

    def is_palindrome(self):
        # digit_num = 0
        rev = 0
        while self.number != 0:
            digit_num = self.number % 10
            rev = rev * 10 + digit_num
            self.number = self.number // 10

        return rev


num_no = 1234
rev_num = PalindromeNumber(num_no)
is_palindrome = rev_num.is_palindrome()
if is_palindrome == num_no:
    print(f"{num_no} is a palindrome bcz {is_palindrome}")
else:
    print(f"{num_no} is not a palindrome bcz {is_palindrome}")
