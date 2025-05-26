package complexjson;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Serializer {

	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub

		//create Create object to interact with main class
		Superheromovies  superheromovies = new Superheromovies();

		//category
		superheromovies.setCategory("Super Hero Movies & TV Show");

		//acceptedfranchises
		List<String> franch = new ArrayList<String>();
		franch.add("DC");
		franch.add("Marverl");
		superheromovies.setAcceptedfranchises(franch);
		//genres
		List<String> genres = new ArrayList<String>();
		genres.add("Action");
		genres.add("Love");
		genres.add("Funny");
		superheromovies.setGenres(genres);

		//List<Movies>
		//we need to create list for allmovies & add sub movies & then add to the main classsuperheromovies
		List<Movies> allmovies = new ArrayList<Movies>();
		//firstmovie
		Movies  movies = new Movies();
		movies.setTitle("Batman");
		movies.setYear(2008);
		List<String> cast = new ArrayList<String>();
		cast.add("Suku");
		cast.add("Kirubha");
		movies.setCast(cast);
		allmovies.add(movies);
		
		//Secondmovie
		Movies  movies1 = new Movies();
		movies1.setTitle("Superman");
		movies1.setYear(2010);
		List<String> cast1= new ArrayList<String>();
		cast1.add("Savi");
		cast1.add("vijayan");
		movies1.setCast(cast1);
		allmovies.add(movies1);

		superheromovies.setMovies(allmovies);
		
		//print & check in pojo format [plain object java)
		System.out.println(superheromovies.getCategory());
		System.out.println(superheromovies.getAcceptedfranchises());
		System.out.println(superheromovies.getGenres());
		System.out.println(superheromovies.getMovies());
	
        //using ObjectMapper convert pojo format [plain object java) to Json format
		ObjectMapper mapper = new ObjectMapper();
		String JSONobj = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(superheromovies);
		System.out.println(JSONobj);
	}

}
