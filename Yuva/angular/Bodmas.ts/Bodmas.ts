import BodmasInterface from './BodmasInterface';
class BodmasOperations implements BodmasInterface{
    mul(str: string, index: number): string {
        throw new Error("Method not implemented.");
    }
    sum(str: string, index: number): string {
        throw new Error("Method not implemented.");
    }
    sub(str: string, index: number): string {
        throw new Error("Method not implemented.");
    }
    private str:string;

    public div(strn:string,indx:number):string{
        console.log(strn);
        var a:number=+strn[indx-1];
        var b:number=+strn[indx+1];
        var Tot=((a>b)? (a,b)=>a/b :(a,b)=>b/a )
        console.log("DIV( "+a+","+b+") => "+((a>b)?(a/b):(b/a)));
        var str1=strn.slice(0,indx-1)+Tot(a,b).toString()+strn.slice(indx+2,strn.length);
        return str1;
    }

}

