'''

    Fundamental programming skills, no
    need to explain
    
    By Marcelo Cárdenas
    
'''

def factorial(n):
    if n==1:
        return 1
    else:
        return n*factorial(n-1)
    
    
a = int(input(""))     
print (factorial(a))
