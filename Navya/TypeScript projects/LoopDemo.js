var nums = ['a1', 'a2', 'a3', 'a4'];
console.log(1 in nums);
//for..each (var item in items){}
nums.forEach(function (element) {
    console.log(element); //a1,a2,a3,a4
});
// for..of
for (var _i = 0, nums_1 = nums; _i < nums_1.length; _i++) {
    var i = nums_1[_i];
    console.log(i); //a1,a2,a3,a4 
}
//for
for (var index = 0; index < nums.length; index++) {
    console.log(nums[index]); //a1,a2,a3,a4
}
// for..in
for (var key in nums) {
    console.log(key); //0,1,2,3
}
