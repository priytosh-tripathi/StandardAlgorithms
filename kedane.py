def Kedane(A):
    max_current=max_global=A[0]
    for i in range(len(A)-1):
        max_current=max(A[i],max_current+A[i])
        if max_current>max_global:
            max_global=max_current
    return max_global

A=[int(i) for i in input().split()] #Enter Array using space
max_sub=Kedane(A)
print(max_sub)
