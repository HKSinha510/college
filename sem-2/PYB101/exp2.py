import tabulate
from math import sqrt

A = ['load', 'inc mass', 'dec mass', 'mean len', 'tension', 'freq']

load  = [i for i in range(500, 2600, 500)]    #last wala
inc_load = [25.1, 36.3, 48.3, 57.3, 63.1]
dec_load = [27.5, 37.7, 44, 50.5, 63.1]
mean_len = [(inc_load[i] + dec_load[i])/2 for i in range(0, 5)]
tension = [load[i]*980 for i in range(0, 5)]

freq = []


for i in range(0, 5):
    fr = round((1/(4*mean_len[i]))*(sqrt(tension[i]/0.0186)), 2)

    freq.append(fr)

result = [[load[i], inc_load[i], dec_load[i], mean_len[i], tension[i], freq[i]] for i in range(0, 5)]

print(tabulate.tabulate(result, A, floatfmt=("", "", "", "", "", "")))
print("mean freq", sum(freq)/len(freq))