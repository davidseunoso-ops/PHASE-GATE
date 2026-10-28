def reversedArray(arrays):
    
    for index in range(len(arrays)):
        for row in range(len(arrays[index])):
            for column in range(len(1, arrays[index])):
              #  if (arrays[index][row] < arrays[index][column]) {
                 arraySwap = arrays[index][row]
                 arrays[index][row] = arrays[index][column]
                 arrays[index][column] = arraySwap
    return arrays;
   
arrays = [[1, 2, 3], [4, 5, 6], [6, 7, 8]]
    
result = reversedArray(arrays)
print(result)
