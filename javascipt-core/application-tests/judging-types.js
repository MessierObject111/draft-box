//Boolean
function isBoolean(args){
  return Object.prototype.toString.call(args) === '[object Boolean]'
}

//Function
function isFunction(){
  return Object.prototype.toString.call(args) === '[object Function]';
}

//date
function isDate(){
  return Object.prototype.toString.call(args) === '[object Date]';
}

//Number
function isNumber(){
  return Object.prototype.toString.call(args) === '[object Number]';
}

//NaN
function isNaN(){
  return args !== args;
}

//Regex
function isRegExp(){
  return Object.prototype.toString.call(args) === '[object RegExp]';
}

//null
function isNull(){
  return Object.prototype.toString.call(args) === '[object Null]';
}

//undefined
function isUndefined(){
  return Object.prototype.toString.call(args) === '[object Undefined]';
}

//Object
function isObject(){
  return Object.prototype.toString.call(args) === '[object Object]';
}

//Array:
function isArray(){
  return Object.prototype.toString.call(args) === '[object Array]';
}
