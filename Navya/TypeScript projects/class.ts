class Greetings{
    public strProp: string;
    private numProp: number;
    protected safeProp: any;
    static astaticProp:string="I'm static";
    anonProp:any; //default public
}

class SpecialGreetings extends Greetings implements iDidSomething{
    constructor(){
        super();
        this.safeProp;
    }
    public Worked():string{
    return "worked a lot";
    }
}

interface iDidSomething{
    Worked():string;
}
var objGreetings = new SpecialGreetings();
objGreetings.Worked;
