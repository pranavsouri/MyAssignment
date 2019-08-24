//let vs var
let abc=100;
if (abc==100) {
    let abc=200;
    console.log(abc); //200
}

console.log(abc); //100


var abc1=100;
if (abc1==100) {
    var abc1=200;
    console.log(abc1); //200
}

console.log(abc1); //100