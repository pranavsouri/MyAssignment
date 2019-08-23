"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
exports.__esModule = true;
var Person_1 = require("./Person");
var Employee = /** @class */ (function (_super) {
    __extends(Employee, _super);
    function Employee() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    Employee.prototype.setEmpId = function (eid) {
        this.empId = eid;
    };
    Employee.prototype.setUnit = function (unit) {
        this.unit = unit;
    };
    Employee.prototype.setprojName = function (proj) {
        this.projName = proj;
    };
    Employee.prototype.cabin = function (cabin) {
        return cabin;
    };
    Employee.prototype.role = function (role) {
        return role;
    };
    Employee.prototype.toString = function () {
        console.log("EmpID:" + this.empId + " <> " + this.unit + " <> " + " ProjName: " + " <> " + this.projName + " <> " + "Cabin:" + this.cabin + " <> " + "Role:" + this.role);
    };
    return Employee;
}(Person_1["default"]));
exports.Employee = Employee;
