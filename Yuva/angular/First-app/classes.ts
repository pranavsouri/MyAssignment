class Greetings{
    //defaut access specifier "public"
    public strprop:string;
    private numprop:number;
    protected safeprop:any = "in protected";
    anonprop:any;
}
class SpecialGreetings extends Greetings{
    constructor(){
        super();
    }
    
}