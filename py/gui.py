class G:
    def __init__(self):
        self.h = int(input("Enter height: "))
        self.b = int(input("Enter base: "))

    def Calculate(self):
        print("Area of triangle: ", 0.5 * self.h * self.b)

obj = G()
obj.Calculate()

