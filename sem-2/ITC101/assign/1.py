#write a program to check a number whether it is prime or not

num =  int(input("Enter a num: "))

for i in range(2, num):
    if num % i == 0:
        print(f"{num} is not prime number.")
        break

else:
    print(f"{num} is a prime number.")