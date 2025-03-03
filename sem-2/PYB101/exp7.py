import tabulate
from math import sqrt

A = ['appmas', 'pan mass', 'total mass', 'tension', 'loop', 'length of string', 'length of loop', 'freq']

app_mass = [i for i in range(0, 21, 5)] + [35]      #last wala
pan_mass = [15] * 6
total_mass = [app_mass[i] + pan_mass[i] for i in range(0, 6)]
tension = [total_mass[i]*980 for i in range(0, 6)]
loop = [7, 6, 5, 4, 4, 4]       #last wala
l_string = [146] * 6
l_loop = [l_string[0]/i for i in loop]

freq = []


for i in range(0, 6):
    fr = round((1/(2*l_loop[i]))*(sqrt(tension[i]/0.003)), 2)

    freq.append(fr)

result = [[app_mass[i], pan_mass[i], total_mass[i], tension[i], loop[i], l_string[i], l_loop[i], freq[i]] for i in range(0, 6)]

print(tabulate.tabulate(result, A, floatfmt=("", "", "", "", "", "", "", "")))
print("mean freq", sum(freq)/len(freq))