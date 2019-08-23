export default class Person {
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
