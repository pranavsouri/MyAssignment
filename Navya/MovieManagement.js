//create classes and functions for movie management app
var Movie = /** @class */ (function () {
    function Movie() {
    }
    Movie.prototype.getMoviename = function () {
        return this.moviename;
    };
    Movie.prototype.getTheatrename = function () {
        return this.theatrename;
    };
    Movie.prototype.getSeatnos = function () {
        return this.seatnos;
    };
    Movie.prototype.setMoviename = function (moviename) {
        this.moviename = moviename;
    };
    Movie.prototype.setTheatrename = function (theatrename) {
        this.theatrename = theatrename;
    };
    Movie.prototype.setSeatnos = function (seatnos) {
        this.seatnos = seatnos;
    };
    Movie.prototype.movieDetails = function () {
        return "movie:" + this.moviename + "theatrename:" + this.theatrename + "seatnos:" + this.seatnos;
    };
    Movie.prototype.bookSeat = function (seatno) {
        if (this.seatnos > seatno) {
            this.seatnos = this.seatnos - seatno;
            return "Seat has been booked!";
        }
        else
            return "House full!";
    };
    Movie.prototype.cancelSeat = function (seatno) {
        this.seatnos = this.seatnos + seatno;
        return "ticket has been cancelled!";
    };
    return Movie;
}());
var movie = new Movie();
movie.setMoviename("Sahoo");
movie.setTheatrename("AMB");
movie.setSeatnos(100);
console.log(movie.movieDetails());
console.log(movie.bookSeat(4));
console.log(movie.cancelSeat(3));
