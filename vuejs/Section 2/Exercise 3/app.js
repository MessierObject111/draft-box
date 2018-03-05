new Vue({
        el: '#exercise',
        data: {
            value: 0
        },
        computed: {
        	result: function() {
          	return this.value <= 37 ? 'Not there yet' : 'Done';
          },
          now: function () {
            return Date.now()
          }
        },
        watch: {
        	value: function(){
          	var self = this;
          	setTimeout(function(){
            	self.value = 0;
            }, 2000);
          }
        },
        methods: {
          nowMethod: function () {
            return Date.now()
          }
        }
    });