#write a funciton to swap the values of two variable through a function

def swap(x, y):
    return y, x


a = "ab1"
b = "cd2"
print("Values before swaping")
print(f"a = {a}")
print(f"b = {b}")

print()

a, b = swap(a, b)
print("Values after swaping")
print(f"a = {a}")
print(f"b = {b}")
