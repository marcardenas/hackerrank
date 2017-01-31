'''

    Fundamental programming skills, no
    need to explain
    
    By Marcelo Cárdenas
    
'''

n = int(raw_input(""))

dic = {}

for i in range(n):
    a = raw_input("").split(' ')
    dic[a[0]] = a[1]
    
for n in range(n):
    b = raw_input("").split(' ')
    try:
        print "{0}={1}".format(b[0],dic[b[0]])
    except KeyError:
        print "Not found"
