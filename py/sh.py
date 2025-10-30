class D:
    def __init__(self, a):
        self.a = a

    def __add__(self, b):
        return self.a + b

    def __sub__(self, b):
        return self.a - b

    def __mul__(self, b):
        return self.a * b

    def __truediv__(self, b):
        return self.a / b

    def __mod__(self, b):
        return self.a % b


d = D(10)
print(d + 5)
print(d - 5)
print(d * 5)
print(d / 5)
print(d % 5)
