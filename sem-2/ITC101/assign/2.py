#write a program to check a number whether it is palindrome or not

num = int(input("Enter a num: "))
n = num

rev = 0
while num:
    last = num % 10
    rev = (rev * 10) + last

    num //= 10

print(f"{n} is palindrome" if n==rev else f"{n} is not palindrome")