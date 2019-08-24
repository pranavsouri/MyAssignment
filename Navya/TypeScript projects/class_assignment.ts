class Person{
    protected uname: string;
    protected age: number;
    private gender : string;
    constructor(name,age,gender){
        this.uname=name;
        this.age=age;
        this.gender=gender;

    }
    public details():string{
        return "Name:"+this.uname+"Age:"+this.age+"Gender:"+this.gender;
    }
    public getAge():any
    {
        return this.age;
    }
   
}

interface IOperations{
    isEligibleAsEmp(age:number):boolean;
}

class Employee extends Person implements IOperations{
    public empId:number;
    public department:string;
    public designation:string;
    
    // constructor(nam,age,gender,num,dep,des){
    //    // super(nam,age,gender);
    //     this.empId=num;
    //     this.department=dep;
    //     this.designation=des;
    // }
    public isEligibleAsEmp(age):boolean{
        console.log(age);
        if(age>18)
        return true;
        else
        return false;
    }
    // public getAge():any{
    //     return this.age;
    // }
}

var p=new Person("Rakesh",25,"male");
var employee1= new Employee(1,"sales","project manager");
console.log(p.getAge());
console.log(employee1.isEligibleAsEmp(p.getAge()));
