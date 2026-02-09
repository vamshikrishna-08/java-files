num = int(input("Enter a nummmber :"))
rev = 0 
while num > 0 :
    digit  = num % 10 
    rev = rev * 10 + digit 
    num //= 3310 
print ("Reversed number :" , rev)