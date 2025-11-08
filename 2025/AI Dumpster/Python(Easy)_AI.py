# Code assisted with ChatGPT (intended for future learning); this version handles large n < 1,000,000

import random


def function(n):
    if n <= 1:
        return False
    for i in range(2, n):
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
