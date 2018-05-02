//Module Pattern
var Counter = (function(){
  var i = 0;
  function add(){
    return ++i;
  }
  function minus(){
    return --i;
  }
  return {
    add: function(){
      return add();
    },
    minus: function(){
      return minus();
    },
    realTimeValue: function(){
      return i;
    },
    initialValue: i,
    addInside: function(){
      return ++i;
    }
  }
})();

Counter.add();
1
Counter.add();
2
counter.realTimeValue()
2
counter.initialValue;
0

/* Another way of writing this: */
function Counter(){
  var i = 0;
  function add(){
    return ++i;
  }
  function minus(){
    return --i;
  }
  return {
    add: function(){
      return add();
    },
    minus: function(){
      return minus();
    },
    realTimeValue: function(){
      return i;
    },
    initialValue: i,
    addInside: function(){
      return ++i;
    }
  }
}
var counter = Counter();

counter.add();
1
counter.add();
2
counter.realTimeValue()
2
counter.initialValue;
0

/* To help explain this better, we can see how this works outside of a wrapping
 function, in the global scale: under this circumstances the private variable is
 not longer protected by a function shell and can be accessed globally. */
var i = 0;
function add(){
  return ++i;
}
function minus(){
  return --i;
}
var obj = {
  add: function(){
    return add();
  },
  minus: function(){
    return minus();
  },
  realTimeValue: function(){
    return i;
  },
  initialValue: i,
  addInside: function(){
    return ++i;
  }
}
obj.add();
obj.add();
obj.realTimeValue();
obj.initialValue;
obj.addInside();
