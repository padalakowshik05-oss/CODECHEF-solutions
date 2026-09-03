s = input()

words = s.split()

for i in range(len(words)):
    words[i] = words[i][0].upper() + words[i][1:]

print(" ".join(words))
print(len(words))