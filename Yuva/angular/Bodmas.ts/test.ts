/*var a:string="234/567"
var pattr=/["+"]/g;
var index=a.search(pattr);
var numbers = a.match(/\/+/g).map(Number);
var a1=numbers[0];
var b1=numbers[1];
console.log(numbers);
console.log(a1+" + "+b1+" = "+(a1+b1));
*/
function leftOperand(str:string,index:number):number{
    var left=index-1;
    var val=0;
    while((left>0) && (str[left]!="+" || str[left]!="-" || str[left]!="*" || str[left]!="/")){
        console.log(left--);
    }
    val=+str.slice(index-(index-left),index);
    return val;
}
function rightOperand(str:string,index:number):number{
    var right=index+1;
    var val=0;
    while((right<=str.length-1) &&(str[right]!="+" || str[right]!="-" || str[right]!="*" || str[right]!="/")){
        console.log(right++);
    }
    val=+str.slice(index+1,right);
    return val;
}
console.log(rightOperand("234/45",3));
console.log("234/45".slice(4,6));

