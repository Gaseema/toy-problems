counter=0
answer=0
while (counter < 1000):
    if counter % 3 == 0 or counter % 5 == 0:
        answer=answer+counter
    counter=counter+1
print answer