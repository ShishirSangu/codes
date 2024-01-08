def copy_array(arr):
    copied_arra = [None] * len(arr)

    for i in range(len(arr)):
        copied_arra[i] = arr[i]

    return copied_arra


original_arr = [1, 2, 3, 4, 5]
print("original : ", original_arr)
copied_array = copy_array(original_arr)
print(copied_array)


