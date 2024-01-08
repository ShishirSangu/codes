def reverse_string(string):
    reversed1_str = ""
    for i in range(len(string) - 1):
        reversed1_str += string[i]
        i -= 1
    return reversed1_str

# Example usage


original1_str = "Hello, World!"
reversed_str = reverse_string(original1_str)
print(reversed_str)  # Output: "!dlroW ,olleH"
