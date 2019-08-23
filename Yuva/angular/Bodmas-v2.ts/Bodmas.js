var str = "1000/2/2";
function leftOperand(str, index) {
    var left = index - 1;
    var val = 0;
    while ((left > 0) && (str[left] != "+" || str[left] != "-" || str[left] != "*" || str[left] != "/")) {
        left--;
    }
    val = +str.slice(index - (index - left), index);
    return val;
}
function rightOperand(str, index) {
    var right = index + 1;
    var val = 0;
    while ((right < str.length - 2) && (str[right] != "/" || str[right] != "-" || str[right] != "*" || str[right] != "+")) {
        right++;
    }
    console.log(index + 1 + " " + right);
    val = +str.slice(index + 1, right);
    return val;
}
function div(strn, indx) {
    console.log(strn);
    var a = leftOperand(strn, indx);
    var b = rightOperand(strn, indx);
    var a1 = a.toString().length;
    var b1 = b.toString().length;
    console.log(a + ":" + a1 + " <> " + b + ":" + b1);
    var Tot = ((a > b) ? function (a, b) { return a / b; } : function (a, b) { return b / a; });
    console.log("DIV( " + a + "," + b + ") => " + ((a > b) ? (a / b) : (b / a)));
    var str1 = strn.slice(0, indx - a1) + Tot(a, b).toString() + strn.slice(indx + b1, strn.length + 1);
    return str1;
}
function mul(strn, indx) {
    console.log(strn);
    var a = +strn[indx - 1];
    var b = +strn[indx + 1];
    var Tot = function (a, b) { return a * b; };
    console.log("MUL( " + a + "," + b + ") => " + (a * b));
    var str1 = strn.slice(0, indx - 1) + Tot(a, b).toString() + strn.slice(indx + 2, strn.length);
    return str1;
}
function sum(strn, indx) {
    console.log(strn);
    var a = +strn[indx - 1];
    var b = +strn[indx + 1];
    var Tot = function (a, b) { return a + b; };
    var str1 = strn.slice(0, indx - 1) + Tot(a, b).toString() + strn.slice(indx + 2, strn.length);
    console.log("ADD( " + a + "," + b + ") => " + (a + b));
    return str1;
}
function sub(strn, indx) {
    console.log(strn);
    var a = +strn[indx - 1];
    var b = +strn[indx + 1];
    var Tot = ((a > b) ? function (a, b) { return a - b; } : function (a, b) { return b - a; });
    console.log("SUB( " + a + "," + b + ") => " + ((a > b) ? (a - b) : (b - a)));
    var str1 = strn.slice(0, indx - 1) + Tot(a, b).toString() + strn.slice(indx + 2, strn.length);
    console.log(str1);
    return str1;
}
while (str.search("/") > -1) {
    var index = str.search("/");
    str = div(str, index);
}
var mulPattr = /[*]/g;
while (str.search(mulPattr) > -1) {
    var index = str.search(mulPattr);
    str = mul(str, index);
}
var addPattr = /[+]/g;
while (str.search(addPattr) > -1) {
    var index = str.search(addPattr);
    str = sum(str, index);
}
var subPattr = /[-]/g;
while (str.search(subPattr) > -1) {
    var index = str.search(subPattr);
    str = sub(str, index);
}
