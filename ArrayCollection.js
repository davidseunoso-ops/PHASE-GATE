function reversedArray(arrays) {
    for (let index = 0; index < arrays.length; index++) {
          for (let row = 0; row < arrays[index].length; row++) {
              for (let column = row + 1; column < arrays[index].length; column++) {
              //  if (arrays[index][row] < arrays[index][column]) {
                      let arraySwap = arrays[index][row];
                          arrays[index][row] = arrays[index][column];
                          arrays[index][column] = arraySwap;
                  }
              } 
          }
          return arrays;
   }
    let arrays = [
                    [1, 2, 3], 
                    [4, 5, 6], 
                    [6, 7, 8]
                ];
    
        let result = reversedArray(arrays);
        console.log(result);
