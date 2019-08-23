interface iOperations{
    cabin(cabin:string):string;
    role(role:string):string;
}
class Person {
    name:string;
    private gender:string;
    public setName(name:string){
        this.name=name;
    }
    public setGender(gender:string){
        this.gender=gender;
    }
    public toString(){
        console.log("Name:"+this.name+" <> "+"gender:"+this.gender);
    }
}
class Employee extends Person implements iOperations{
    private empId:number;
    private unit:string;
    protected projName:string;
    public setEmpId(eid:number){
        this.empId=eid;
    }
    public setUnit(unit:string){
        this.unit=unit;
    }
    public setprojName(proj:string){
        this.projName=proj;
    }
    public cabin(cabin:string){
        return cabin;
    }
    public role(role:string){
        return role;
    }
    public toString(){
        console.log("EmpID:"+this.empId+" <> "+this.unit+" <> "+" ProjName: "+" <> "+this.projName+" <> "+"Cabin:"+this.cabin+" <> "+"Role:"+this.role);
    }
}
var per1=new Person();
per1.setName("yuki");
per1.setGender("M");
per1.toString();

var emp1=new Employee;
emp1.setEmpId(123);