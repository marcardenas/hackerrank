'''

    This code implements instructions given on the
    page. These inst are hard and unuseful, so go look
    the page
    
    By Marcelo Cárdenas 

'''

seqList = [];
lastAns = 0

[n, q] = raw_input().split(" ")
n = int(n); q = int(q)

for i in range(n):
    seqList.append(list())

for i in range(q):
    
    [query, x, y] = raw_input().split(" ")
    query = int(query); x = int(x); y = int(y)
    
    pos = ((x^lastAns)%n)
    
    if query == 1:        
        seqList[pos].append(y)
    
    if query == 2:
        lastAns = seqList[pos][y%len(seqList[pos])]    
        print lastAns

