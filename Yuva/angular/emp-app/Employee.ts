import iOperations from './Operations';
import Person from './Person';
export class Employee extends Person implements iOperations{
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