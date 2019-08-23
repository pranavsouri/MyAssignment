//Types of functions
//func with parameters
function params(reqParam, defParam, optionalParam) {
    if (defParam === void 0) { defParam = "hello"; }
    var rest = [];
    for (var _i = 3; _i < arguments.length; _i++) {
        rest[_i - 3] = arguments[_i];
    }
    console.log(reqParam);
    console.log(defParam);
    console.log(optionalParam);
    console.log(rest);
}
params("hello");
params("new", "newHello", 56, "one", "two", "three");
//params("new", "newHello",78,"newOne","two","three");
//func that returns a function
//self invokable functions
//lambda functions
