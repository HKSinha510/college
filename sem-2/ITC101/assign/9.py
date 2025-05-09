# check even length words in a string

string = "hellow, i am sing a song."

for i in string.split():
    if len(i) % 2 == 0:
        print(i)
