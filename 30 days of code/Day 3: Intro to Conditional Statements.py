'''

    Fundamental programming skills, no
    need to explain
    
    By Marcelo Cárdenas
    
'''

N = int(raw_input().strip())

if N%2!=0:
    print "Weird"
else:
    if 2<=N<=5:
        print "Not Weird"
    elif 6<=N<=20:
        print "Weird"
    else:
        print "Not Weird"
