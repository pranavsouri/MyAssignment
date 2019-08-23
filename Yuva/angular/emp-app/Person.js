"use strict";
exports.__esModule = true;
var Person = /** @class */ (function () {
    function Person() {
    }
    Person.prototype.setName = function (name) {
        this.name = name;
    };
    Person.prototype.setGender = function (gender) {
        this.gender = gender;
    };
    Person.prototype.toString = function () {
        console.log("Name:" + this.name + " <> " + "gender:" + this.gender);
    };
    return Person;
}());
exports["default"] = Person;
