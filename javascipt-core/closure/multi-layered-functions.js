function layer1(x){
  return function layer2(y){
    return function layer3(z){
      return console.log('x:'+x+' y:'+y+' z:'+z);
    }
  }
}
layer1(1)(2)(3);
//Output: x:1 y:2 z:3

/* It equals to the following:*/
var layer2_ref = layer1(1);

var layer3_ref = layer2_ref(2);

layer3_ref(3);
//Output: x:1 y:2 z:3
