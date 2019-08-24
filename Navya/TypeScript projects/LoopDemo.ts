var nums: string[]=['a1','a2','a3','a4']
console.log(1 in nums);

//for..each (var item in items){}
nums.forEach(element => {
    console.log(element); //a1,a2,a3,a4
});

// for..of
for(let i of nums){
    console.log(i); //a1,a2,a3,a4 
}

//for
for(let index =0; index<nums.length;index++)
{
    console.log(nums[index]); //a1,a2,a3,a4
}

// for..in
for (const key in nums) {
    console.log(key); //0,1,2,3
}

