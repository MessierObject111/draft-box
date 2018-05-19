const assignments = [
	{
		city: 'San Jose',
		building: 10
	},

	{
		city: 'San Fran',
		building: 20
	},
    {
        city: 'San Jose',
        building: NaN
    },
    {
        city: 'San Clement'
    },
		{
			city: 'Los Angeles',
			building: 30
		}
];

var total = [ {a:0}, {a:1}, {a:2}, {a:3} ].reduce(
  ( accumulator, currentValue ) => accumulator + currentValue.a,
  0
);
total;//6
var reducer = (accumulator, currentValue) => {
	if(currentValue != undefined){
		let type = Object.prototype.toString.call(currentValue.building).slice(8, -1);
		if(type === 'Number') {
			console.log("accu:" + accumulator + "current: "+currentValue.building+'is Number');
			return accumulator + currentValue.building;
		}
		if(type === 'String' && (+(currentValue.building)) !== (+(currentValue.building)) ) {
			console.log("accu:" + accumulator + "current: "+currentValue.building+ 'is String');
			return accumulator + (+(currentValue.building));
		}
	}
};
console.log(assignments.reduce(reducer, 0));
