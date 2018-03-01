var counter = (function () {
  var count = 0;
  return {
    add : function(){
      return ++count;
    },
    minus : function(){
      return --count;
    }
  };
})();
