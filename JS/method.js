// implement any two methods of js 


// 1. map()

const nums = [1, 2, 3, 4, 5];
const squared = nums.map(num => num * 2);
console.log(squared);


// 2.filter()


const list = [10, 20, 30, 40, 50];
const remove = list.filter(index => index > 25);
console.log(remove);


// 3.find

const users = [
    { id: 1, name: 'Apoorv' },
    { id: 2, name: 'Rahul' },
    { id: 3, name: 'Vibha' }
];

const match = users.find(user => user.id === 2);
console.log(match)
