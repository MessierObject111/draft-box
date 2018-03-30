//Boolean
function isBoolean(args){
  return Object.prototype.toString.call(args) === '[object Boolean]'
}

//Function
function isFunction(args){
  return Object.prototype.toString.call(args) === '[object Function]';
}

//date
function isDate(args){
  return Object.prototype.toString.call(args) === '[object Date]';
}

//Number
function isNumber(args){
  return Object.prototype.toString.call(args) === '[object Number]';
}

//NaN
function isNaN(args){
  return args !== args;
}

//Regex
function isRegExp(args){
  return Object.prototype.toString.call(args) === '[object RegExp]';
}

//null
function isNull(args){
  return Object.prototype.toString.call(args) === '[object Null]';
}

//undefined
function isUndefined(args){
  return Object.prototype.toString.call(args) === '[object Undefined]';
}

//Object
function isObject(args){
  return Object.prototype.toString.call(args) === '[object Object]';
}

//Array:
function isArray(args){
  return Object.prototype.toString.call(args) === '[object Array]';
}

//Error
function isError (args) {
    return Object.prototype.toString.call(args).slice(8, -1) === 'Error';
}

//Symbol
isSymbol (args) {
    return Object.prototype.toString.call(args).slice(8, -1) === 'Symbol';
}

//Promise
isPromise (args) {
    return Object.prototype.toString.call(args).slice(8, -1) === 'Promise';
}

//Set
isSet (args) {
    return Object.prototype.toString.call(args).slice(8, -1) === 'Set';
}
