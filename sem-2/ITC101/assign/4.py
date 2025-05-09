# write a program to read a file line by line and print it


with open('r.txt') as f:
    st = "a"
    while st:
        st = f.readline()
        print(st)

with open('r.txt') as f:
    d = f.readlines()
    for i in f:
        print(i)