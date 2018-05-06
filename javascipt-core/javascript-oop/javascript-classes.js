function Person (name){
  var obj = {};
  obj.name = name;
  obj.greeting = function(){
    alert("Hello, my name is "+ this.name);
  }
  return obj;
}

function Person(first, last, age, gender, interests) {
  this.name = {
    first,
    last
  };
  this.age = age;
  this.gender = gender;
  this.reference = (gender === 'male' ? 'he' : 'she');
  this.interests = interests;
  this.interestsList = function(){
    var list = "";
    for(var i = 0; i < this.interests.length; i++){
      list = list + interests[i] ;
      if(i < this.interests.length - 1){
      list = list + ', and ';
      }
    }
    return list;
  }
  this.bio = function() {
    alert(this.name.first + ' ' + this.name.last + ' is ' + this.age +
    ' years old. '+ this.reference + ' likes ' + this.interestsList()+ '.');
  };
  this.greeting = function() {
    alert('Hi! I\'m ' + this.name.first + '.');
  };
};
var person1 = new Person('Elain', 'Smith', 32, 'female', ['music', 'skiing', 'desserts']);
