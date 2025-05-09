#check if string is palindrome of not. 

user = input("Enter a word: ")

print(f"{user} is palindrome" if user==user[::-1] else f"{user} is not palindrome")