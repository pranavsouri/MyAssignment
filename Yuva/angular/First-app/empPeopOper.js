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
    return Employee;
}(Person));
var per1 = new Person();
per1.setName("yuki");
per1.setGender("M");
per1.toString();
