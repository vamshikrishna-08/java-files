arr = [1,1,2,2,3,4,5,6,6,7,8,9,]
duplicates = []
for i in arr :
    if arr.count (i) > 1 and i not in duplicates:
        duplicates.append (i)
print("duplicates :", duplicates)        