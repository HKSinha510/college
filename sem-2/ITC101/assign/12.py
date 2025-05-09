list_num = [31,441,5,1,53,215,1,42,14,31,2]


s = l = list_num[0]

for i in list_num:
    if i > l:
        l = i

    if i < s:
        s = i

print(f"Smallest number in list: {s}")
print(f"Largest number in list: {l}")