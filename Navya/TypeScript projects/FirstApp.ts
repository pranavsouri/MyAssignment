function class1(){
    this.propertyName="A js property ";
}

var obj=new class1();
console.log(obj.propertyName);

var a:string = "navya";
var b:number= 100;
var arr: string[] = ["mo","vc"];
var object: any = {key:"value"};

function fun1():string{
    return "Trying to have fun...";
}
var fundoo = function():string{
    return " ha ha";
}
console.log(fun1());
console.log(fundoo());