"use strict";
exports.__esModule = true;
var BodmasOperations = /** @class */ (function () {
    function BodmasOperations() {
    }
    BodmasOperations.prototype.mul = function (str, index) {
        throw new Error("Method not implemented.");
    };
    BodmasOperations.prototype.sum = function (str, index) {
        throw new Error("Method not implemented.");
    };
    BodmasOperations.prototype.sub = function (str, index) {
        throw new Error("Method not implemented.");
    };
    BodmasOperations.prototype.div = function (strn, indx) {
        console.log(strn);
        var a = +strn[indx - 1];
        var b = +strn[indx + 1];
        var Tot = ((a > b) ? function (a, b) { return a / b; } : function (a, b) { return b / a; });
        console.log("DIV( " + a + "," + b + ") => " + ((a > b) ? (a / b) : (b / a)));
        var str1 = strn.slice(0, indx - 1) + Tot(a, b).toString() + strn.slice(indx + 2, strn.length);
        return str1;
    };
    return BodmasOperations;
}());
