var ternary_operator = /** @class */ (function () {
    function ternary_operator() {
    }
    ternary_operator.prototype.check = function () {
        var first = 5;
        var second = 3;
        var result = (first > second) ? "True, 5 is greater than 3." : "False, 3 is not greater than 5.";
        console.log(result);
    };
    return ternary_operator;
}());
var t_oper = new ternary_operator();
t_oper.check();
//another example
var age = 25;
var ans = (age >= 18) ? "Eligible for voting." : "Not eligible for voting.";
console.log(ans);
