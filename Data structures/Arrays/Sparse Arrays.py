'''

    This program count how many times a string
    occurs in a list of strings

    By Marcelo Cárdenas

'''


n = int(raw_input())
str_list = []

for i in range(n):
    s = raw_input()
    str_list.append(s)
    
q = int(raw_input())

for j in range(q):
    counter = 0
    
    st = raw_input()
    for l in str_list:
        
        if st == l:
            counter += 1
    print counter
