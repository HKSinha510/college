# write a program to display the number of lines in the file and size of a file in bytes
import os

with open('r.txt') as f:
    print(f"Number of lines: {len(f.readlines())}")

print(f"Size of file: {os.path.getsize("r.txt")}b")