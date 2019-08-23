import {MovieInterface} from './MovieInterface'
class Movie implements MovieInterface{
     
    public name:string;
    public certi:string;
    public dateR:string;
    public rating:number;
    public theatres:string[];
    public genre:string;

        constructor(name,certi,dateR,rating,genre,theatres){

            this.name=name;
            this.certi=certi;
            this.dateR=dateR;
            this.rating=rating;
            this.genre=genre;
            this.theatres=theatres;

        }

    public movieName(): string {
        return this.name;
    }   
    public movieGenre(): string {
        return this.genre;
    }
    public movieCertificate(): string {
        return this.certi;

    }
    public movieReleaseDate(): string {
       return this.dateR;
    }
    public availableTheatres(): string[] {
        return this.theatres;
    }
   public  movieRating(): number {
       return this.rating;
    }


}
class wishList extends Movie{
    constructor()
    {
                super("saaho","U/A","30/08/2019",4.5,"action",["imax","forum","cp"]);
       
    }
    public details(){
        return this.movieName()+"("+this.movieCertificate()+" "+this.movieRating()+" "+this.movieGenre()+")"+"booked on"+this.movieReleaseDate()+"at"+this.availableTheatres()[1];
    }
}
var mov=new wishList();
console.log(mov.details());

