num = 5


def fibonacci(number):
    series = [0, 1]  # Initialize the series with the first two numbers

    while len(series) < number:
        next_num = series[-1] + series[-2]  # Calculate the next number in the series
        series.append(next_num)

    return series

# Example usage:


fib_series = fibonacci(num)
print(fib_series)

