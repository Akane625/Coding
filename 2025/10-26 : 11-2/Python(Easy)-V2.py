import random
import math


def function(n):
    if n <= 1:
        return False
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False
    return True


numbers = [random.randint(0, 100) for i in range(5)]
composite = []
prime = []

for i in numbers:
    if i == 0:
        print("0 is neither prime nor composite")
    elif function(i):
        prime.append(i)
    else:
        composite.append(i)

print(numbers)
print(f"Composite Numbers: {composite}")
print(f"Prime Numbers: {prime}")
