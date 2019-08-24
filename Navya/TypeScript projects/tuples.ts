//tuples
var atuple =[1,"hello",[1,2,3],{key:'value'}];
atuple.forEach(element => {
    if(typeof element == "number"){
        return element+"is of type number";
    }
    if(typeof(element)=='object'){
        try{
            //var temp = (Array) element
            var temp=<Array<number>>element;
        }
        catch(error){
            console.log("the item is not an array");
        }
    }
});


//Unions
function unionFunction(pParameter : string | string[]){
    console.log(pParameter);
}
unionFunction("Welcome");
unionFunction(["a","b"]);