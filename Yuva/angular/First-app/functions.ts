//Types of functions
//func with parameters
function params(reqParam:string, defParam:string="hello",optionalParam?:number,...rest:string[]){
    console.log(reqParam);
    console.log(defParam);
    console.log(optionalParam);
    console.log(rest);

}
params("hello");
params("new", "newHello",56,"one","two","three");
//params("new", "newHello",78,"newOne","two","three");

//func that returns a function
function func1(){
    return function hello(){
        console.log("hello");
    }
}
console.log(func1);

var res=func1();
res();
func1()(); //currying of function
function complicated(){
    return function(){
        console.log("in func2");
        return function(name:string){
            return "hello"+name;
        }
    }
}


(function(){
    console.log("hello");
})();   //anonymous function


//self invokable functions
//  (<function implementation>)();
//eg:: (function(){})();


//lambda functions
// ()=>{<return value of function>}
()=>{
    console.log("Lambda function");
}
()=> "hello";

var a=(b)=>(x:number,y:number)=>(x+y+b);
console.log(a(40)(10,20));



