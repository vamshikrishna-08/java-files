num = int(input("enter a number "))
temp = num
sum = 0
digits = len(str(sum))
while temp > 0 :
    digit = temp % 10
    sum += digit ** digits
    temp //= 10
    if sum == num :
        print("armstrong number")
    else :
        print("not an armstrong number ")