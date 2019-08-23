var str = "8/4*2+2+8/4-2";
function div(strn, indx) {
    console.log(strn);
    var a = +strn[indx - 1];
    var b = +strn[indx + 1];
    var Tot = ((a > b) ? function (a, b) { return a / b; } : function (a, b) { return b / a; });
    console.log("DIV( " + a + "," + b + ") => " + ((a > b) ? (a / b) : (b / a)));
    var str1 = strn.slice(0, indx - 1) + Tot(a, b).toString() + strn.slice(indx + 2, strn.length);
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
