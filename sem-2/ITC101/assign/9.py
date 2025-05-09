# check even length words in a string

string = "hello, I can sing a song."


print("Words with even length:")
for i in string.split():
    if len(i) % 2 == 0:
        print(i)
