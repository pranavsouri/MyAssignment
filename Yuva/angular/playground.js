var obj={};
function funny1(){

}
var funny2=function(){

}
var complexobj={
funny3: function(){
    console.log("In funny3()");
},
items:["Mobiles","Cables","papers","laptop"],
subobj:{sk1:1000,sk2:"some values are:",sk3:[1,2,3,["a","b"],{ssk1:100}]}

}
console.log(complexobj.funny3())
console.log(complexobj.items)

console.log(complexobj.subobj.sk1)
console.log(complexobj.subobj.sk3[3][1])
console.log(complexobj.subobj.sk3[4].ssk1)
