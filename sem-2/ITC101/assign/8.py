# program to read character by chracter from a file

with open("r.txt") as f:
    s = "a"
    while s:
        s = f.read()
        print(s)