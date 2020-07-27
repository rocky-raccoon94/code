import math


class Rectangle:
    def __init__(self, width, length):
        self.width = width
        self.length = length

    def area(self):
        return self.width * self.length


class Circle:
    def __init__(self, r):
        self.r = r

    def area(self):
        return self.r * self.r * math.pi


def f(**kargs):
    for a in kargs:
        print(a, kargs[a])


f(a=1, b=2)
