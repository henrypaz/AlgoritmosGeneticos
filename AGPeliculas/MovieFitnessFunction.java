/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AGPeliculas;

import AGPeliculas.Movie;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jgap.FitnessFunction;
import org.jgap.IChromosome;
import org.jgap.impl.IntegerGene;

/**
 *
 * @author Henry Paz
 */
public class MovieFitnessFunction extends FitnessFunction {

    List movies = new ArrayList();
    List genres = new ArrayList();

    public MovieFitnessFunction(List movies, List genres) {
        this.movies = movies;
        this.genres = genres;
    }

    @Override
    protected double evaluate(IChromosome chromosome) {
        double score = 0;
        double imdbScore = 0;

        List dups = new ArrayList();
        int badSolution = 1;

        for (int i = 0; i < chromosome.size(); i++) {

            IntegerGene agene = (IntegerGene) chromosome.getGene(i);
            int index = (Integer) chromosome.getGene(i).getAllele();

            if (dups.contains(index)) {
                badSolution = 0;
            } else {
                dups.add(index);
            }

            Movie movie = (Movie) movies.get(index);
            double genreScore = getGenreScore(movie);
            if (genreScore == 0) {
                badSolution = 0;
            }

            score = (score + movie.getImdbRating()) + (genreScore);
//            System.out.println(movie + " socore: " + score);
        }
        return (score * badSolution);
    }

    private double getGenreScore(Movie movie) {
        double genreScore = 0;
        Iterator it = this.genres.iterator();

        while (it.hasNext()) {
            String genre = (String) it.next();
            if (movie.getGenre().contains(genre)) {
                genreScore = genreScore + 1;
            }
        }
        return genreScore;
    }

}
