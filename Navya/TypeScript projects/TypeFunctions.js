//typescript = javascript + (datatypes)
//Function with different types of parameters
function UsingParams(pRequired, pDefault, pOptional) {
    if (pDefault === void 0) { pDefault = "DBS-ID"; }
    var pRest = [];
    for (var _i = 3; _i < arguments.length; _i++) {
        pRest[_i - 3] = arguments[_i];
    }
    console.log(pRequired);
    console.log(pDefault);
    console.log(pOptional);
    console.log(pRest);
}
UsingParams(true);
UsingParams(false, "DBS-2394345678", 100, "a", "b", "c");
//Function that returns a function
function complicated() {
    console.log("invoked!");
    return function () {
        console.log("I will display if invoked only!");
        return function (pName) {
            return pName;
        };
    };
}
var result = complicated();
result();
console.log(complicated()()("Navya")); //Currying of functions
console.log(result);
//self-invokable functions
(function () {
    console.log("A function");
})();
var res = (function () {
    console.log("A function");
    return "name";
})();
console.log(res);
//lamda functions
(function () {
    console.log(" A function");
    return "a value";
});
(function () { return "a value"; });
var op = function (a) { return function (x, y) { console.log(x + y); return 1; }; };
console.log(op(2)(3, 4));
//BODMAS
var ad = function (a, b) { return a + b; };
var mul = function (a, b) { return a * b; };
var div = function (a, b) { return a / b; };
var sub = function (a, b) { return a - b; };
var mystring = "3+5*8-5";
for (var i = 0; i < (mystring).length; i++) {
    if (mystring[i] == '+') {
        var num1 = +mystring[i - 1];
        var num2 = +mystring[i + 1];
        // console.log(mystring[i-1]+mystring[i]+mystring[i+1]+"="+ad(num1,num2));
    }
}
var priority = function (ch) {
    if (ch == '+' || ch == '-')
        return 1;
    else
        return 2;
};
var evaluate = function (tokens) {
    var values = [];
    var ops = [];
    var i = 0;
    while (i < tokens.length) {
        if (!(tokens[i] == '+' || tokens[i] == '-' || tokens[i] == '/' || tokens[i] == '*')) {
            var val = 0;
            while (i < tokens.length && (!(tokens[i] == '+' || tokens[i] == '-' || tokens[i] == '/' || tokens[i] == '*'))) {
                val = (val * 10) + Number(tokens[i]);
                i += 1;
            }
            values.push(val);
        }
        else {
            while (ops.length != 0 && priority(ops[-1]) >= priority(tokens[i])) {
                var val2 = values.pop();
                var val1 = values.pop();
                op = ops.pop();
                values.push(applyOp(val1, val2, op));
            }
            ops.push(tokens[i]);
        }
        i += 1;
        while (ops.length != 0) {
            val2 = values.pop();
            val1 = values.pop();
            op = ops.pop();
            values.push(applyOp(val1, val2, op));
        }
    }
    console.log(values[-1]);
};
var applyOp = function (a, b, op) {
    if (op == '+') {
        return a + b;
    }
    if (op == '-') {
        return a - b;
    }
    if (op == '*') {
        return a * b;
    }
    if (op == '/') {
        return a / b;
    }
};
console.log(evaluate("3+5*8"));
