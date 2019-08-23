"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
exports.__esModule = true;
var Movie = /** @class */ (function () {
    function Movie(name, certi, dateR, rating, genre, theatres) {
        this.name = name;
        this.certi = certi;
        this.dateR = dateR;
        this.rating = rating;
        this.genre = genre;
        this.theatres = theatres;
    }
    Movie.prototype.movieName = function () {
        return this.name;
    };
    Movie.prototype.movieGenre = function () {
        return this.genre;
    };
    Movie.prototype.movieCertificate = function () {
        return this.certi;
    };
    Movie.prototype.movieReleaseDate = function () {
        return this.dateR;
    };
    Movie.prototype.availableTheatres = function () {
        return this.theatres;
    };
    Movie.prototype.movieRating = function () {
        return this.rating;
    };
    return Movie;
}());
var wishList = /** @class */ (function (_super) {
    __extends(wishList, _super);
    function wishList() {
        return _super.call(this, "saaho", "U/A", "30/08/2019", 4.5, "action", ["imax", "forum", "cp"]) || this;
    }
    wishList.prototype.details = function () {
        return this.movieName() + "(" + this.movieCertificate() + " " + this.movieRating() + " " + this.movieGenre() + ")" + "booked on" + this.movieReleaseDate() + "at" + this.availableTheatres()[1];
    };
    return wishList;
}(Movie));
var mov = new wishList();
console.log(mov.details());
//****************  ternary operator
var value1 = 23;
var value2 = 24;
var result = (value1 > value2) ? "thats false" : "thats true";
console.log(result);
