new Vue({
        el: '#exercise',
        data: {
            value: ' '
        },
        methods: {
        	showAlert: function() {
          	alert("This is an alert");
          },
        	updateValue: function(event) {
        		this.value = event.target.value;
        	}
        }
    });