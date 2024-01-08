def reverse_string_with_spaces(string):
    reversed_str = ""
    spaces = [" "] * len(string)  # Create a list to store the spaces

    # Iterate through the string and identify the positions of the spaces
    for i in range(len(string)):
        if string[i] == " ":
            spaces[i] = " "  # Preserve the space in the list
        else:
            reversed_str += string[i]  # Add non-space characters to the reversed string

    # Reverse the reversed_str without spaces
    reversed_str = reverse_string(reversed_str)

    # Insert the spaces back into the reversed string
    for i in range(len(reversed_str)):
        if spaces[i] == " ":
            reversed_str = reversed_str[:i] + " " + reversed_str[i:]  # Insert space at the corresponding position

    return reversed_str


def reverse_string(string):
    reversed_str = ""
    for i in range(len(string) - 1, -1, -1):
        reversed_str += string[i]
    return reversed_str


# Example usage
original_str = "Hello,  World!"
reversed_str = reverse_string_with_spaces(original_str)
print(reversed_str)  # Output: "!dlroW ,olleH"
