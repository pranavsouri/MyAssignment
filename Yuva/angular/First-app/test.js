var str1 = "2+3*4";
var arr;
var op;
var i = 0;
var operand = function (arg1) {
    if (str[i] == "+" || str[i] == "-") {
        return 1;
    }
    else if (str[i] == "*" || str[i] == "/" || str[i] == "%") {
        return 2;
    }
};
arr.push(str[0]);
op.push(str[1]);
arr.push(str[2]);
console.log(op[0]);
for (i = 3; i < str.length; i++) {
    if (operand[op[0]]) { }
}
