package complexjson;

import java.util.List;

public class Superheromovies {
	
	public String category;
	public List<String> acceptedfranchises;
	public List<String> genres;
	//Here we need to ass  List<Movies> & List<TVShow>,,bec inside movies we have separate {} json details
	//we have separate class Movies & TVShow to take care those {} json details
	public List<Movies> movies;
	public List<TVShow> tvShow;
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public List<String> getAcceptedfranchises() {
		return acceptedfranchises;
	}
	public void setAcceptedfranchises(List<String> acceptedfranchises) {
		this.acceptedfranchises = acceptedfranchises;
	}
	public List<String> getGenres() {
		return genres;
	}
	public void setGenres(List<String> genres) {
		this.genres = genres;
	}
	public List<Movies> getMovies() {
		return movies;
	}
	public void setMovies(List<Movies> movies) {
		this.movies = movies;
	}
	public List<TVShow> getTvShow() {
		return tvShow;
	}
	public void setTvShow(List<TVShow> tvShow) {
		this.tvShow = tvShow;
	}
	
	

}
