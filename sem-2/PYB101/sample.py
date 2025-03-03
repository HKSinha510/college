
import tabulate
R = [1800,2000,2000,2200]
TH = [30,28,26,24]
S = [120,120,100,110]
#Theta/2 is not required for calculation
A = ['Resistance', 'Deflection(TH)', 'Shunt Resistance(S)', 'G = R.S/R-S', 'K = E/(R+G)TH']
result = []
G_mean = []
K_mean = []

for i in range(len(R)):
    G = round((R[i]*S[i])/(R[i]-S[i]), 2)
    K = round(4/((R[i]+G)*TH[i]), 7)
    G_mean.append(G)
    K_mean.append(K)
    result.append([R[i], TH[i], S[i], G, K])

print(tabulate.tabulate(result, A, floatfmt=("", "", "", "", ".7f")))
print(f'Mean value of the galvonometer resistance(G) = {round(sum(G_mean)/len(G_mean), 2)} ohm')
print(f'Mean value of figure of merit(K) = {round((sum(K_mean)/len(K_mean)),7):.7f} A/div')