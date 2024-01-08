def reverse_array(arr):
    # Initialize two pointers, i pointing to the start and j pointing to the end
    i = 0
    j = len(arr) - 1

    # Swap elements until the pointers meet in the middle
    while i < j:
        # Swap arr[i] and arr[j]
        arr[i], arr[j] = arr[j], arr[i]
        i += 1
        j -= 1

    return arr


# Example usage
original_arr = [1, 2, 3, 4, 5]
print("Original : ", original_arr)
reversed_arr = reverse_array(original_arr)
print("Reverse arr : ", reversed_arr)  # Output: [5, 4, 3, 2, 1]
