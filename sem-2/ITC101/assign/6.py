#program for sum of swaure sof first n natural number

n = int(input("Enter the values of n: "))

sum = 0
for i in range(1, n+1):
    sum += i**2

print(sum)