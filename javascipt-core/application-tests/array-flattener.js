//[1, [2, [ [3, 4], 5], 6]] => [1, 2, 3, 4, 5, 6]
function flatArray(arr, result) {
  if(!arr){
    return [];
  }
  for(var i = 0; i < arr.length; i++){
    if(Array.isArray(arr[i])){
      flatArray(arr[i], result);
    }else{
      result.push(arr[i]);
    }
  }
  return result;
}
