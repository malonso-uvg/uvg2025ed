def my_generator(n):
    while True:
        for j in range(n):
            yield j

def my_function(n):
    while True:
        for j in range(n):
            return j


#value = my_function(5)
#print(value)
#print(value)
#print(value)

genertor = my_generator(5)
print(next(genertor))
print(next(genertor))
print(next(genertor))
print(next(genertor))
print(next(genertor))
print(next(genertor))
print(next(genertor))




        
