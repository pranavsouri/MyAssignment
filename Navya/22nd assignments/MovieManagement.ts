//create classes and functions for movie management app

class Movie{
    private moviename:string;
    private theatrename:string;
    private seatnos: number;
    getMoviename():string{
        return this.moviename;
    }
    getTheatrename():string{
        return this.theatrename;
    }
    getSeatnos():number{
        return this.seatnos;
    }
    setMoviename(moviename){
        this.moviename=moviename;
    }
    setTheatrename(theatrename){
        this.theatrename=theatrename;
    }
    setSeatnos(seatnos){
        this.seatnos=seatnos;
    }
    movieDetails():string{
        return "movie:"+this.moviename+"theatrename:"+this.theatrename+"seatnos:"+this.seatnos;
    }
    bookSeat(seatno):string{
        if(this.seatnos>seatno){
            this.seatnos=this.seatnos-seatno;
        return "Seat has been booked!";}
        else return "House full!";
    }
    cancelSeat(seatno):string{
        this.seatnos=this.seatnos+seatno;
        return "ticket has been cancelled!";
    }
}

var movie=new Movie();
movie.setMoviename("Sahoo");
movie.setTheatrename("AMB");
movie.setSeatnos(100);
console.log(movie.movieDetails());
console.log(movie.bookSeat(4));
console.log(movie.cancelSeat(3));