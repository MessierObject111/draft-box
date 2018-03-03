new Vue ({
    el: '#counter',
    data: {
        count: 0,
        x: 0,
        y: 0
    },
    methods: {
    increase : function(step, event){
        this.count+=step;
    },
    updateCoordinates : function(event){
        this.x = event.clientX;
        this.y = event.clientY;
    },
    dummy : function(event) {
        event.stopPropagation();
    }
  }
})