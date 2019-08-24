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
    function Person(name, age, gender) {
        this.uname = name;
        this.age = age;
        this.gender = gender;
    }
    Person.prototype.details = function () {
        return "Name:" + this.uname + "Age:" + this.age + "Gender:" + this.gender;
    };
    Person.prototype.getAge = function () {
        return this.age;
    };
    return Person;
}());
var Employee = /** @class */ (function (_super) {
    __extends(Employee, _super);
    function Employee() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    // constructor(nam,age,gender,num,dep,des){
    //    // super(nam,age,gender);
    //     this.empId=num;
    //     this.department=dep;
    //     this.designation=des;
    // }
    Employee.prototype.isEligibleAsEmp = function (age) {
        console.log(age);
        if (age > 18)
            return true;
        else
            return false;
    };
    return Employee;
}(Person));
var p = new Person("Rakesh", 25, "male");
var employee1 = new Employee(1, "sales", "project manager");
console.log(p.getAge());
console.log(employee1.isEligibleAsEmp(p.getAge()));
