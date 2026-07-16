class Account:
    def __init__(self, balance):
        self.balance = balance

    def __add__(self, other):
        return self.balance + other.balance

a = Account(1000)
b = Account(10000)

print(a + b)
print(2 + 2.3)
print(4.7 + 2.3)
print('om' + 'ji')