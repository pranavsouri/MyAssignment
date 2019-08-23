var op:string="3+2*5";
var i:number=0;
var j:number=0;
/*var sum:number=0;
for( i=0;i<str.length;i++){
    if(str[i]=="+"){
        var num=(a)=>(b,c)=>b*c+a;
        sum=num(+str[i-1])(+str[i+1],+str[i+3]);
    }
}
console.log(sum);*/
var arr=new Array();
var opnd=new Array();
var operand=function(op:string):number{

    if(op[i] == "/"){
        return 4;
    }
    else if(op[i]=="*"){
        return 3;
    }
    else if(op[i]=="+"){
        return 2;
    }
    else{
        return 1
}
arr[0]=5;
console.log(arr[0]);
//for(i=0;i<str.length;i++){
    /*var n1=""
    var n2=""
    while(str[i]!="+" || str[i]!="-" || str[i]!="*" || str[i]!="/" || str[i]!="%"){
        n1+=str[i];
    }
    var n1=+str[i];
    var num1:number=+n1;
    arr.push(num1);
    if(str[i]=)*/
    /*for(j=0;j<str.length;j++){
        if(str[j]=="/"){
            console.log(str[j-1]+"/"+str[j+1]);
        }
    }
        console.log("\n");
        if(str[j]=="*"){
            console.log(str[j-1]+"*"+str[j+1]);
        }
        console.log("\n");
        if(str[j]=="+"){
            console.log(str[j-1]+"+"+str[j+1]);
        }
        console.log("\n");
        if(str[j]=="-"){
            console.log(str[j-1]+"-"+str[j+1]);
        }
        console.log("\n");
    }*/
    
//}
/*for(j=0;j<str.length;j++){
    if(str[j]=="/"){
        console.log(str[j-1]+"/"+str[j+1]);
    }
}*/

}
