package edu.uvg;

import java.util.LinkedList;
import java.util.List;

import org.neo4j.driver.Record;
import org.neo4j.driver.Result;
import org.neo4j.driver.Transaction;
import org.neo4j.driver.TransactionWork;

public class MoviesQuery implements TransactionWork<LinkedList<String>>{

    @Override
    public LinkedList<String> execute(Transaction tx) {
        //Result result = tx.run( "MATCH (people:Person) RETURN people.name");
        Result result = tx.run( "MATCH (movie:Movie) RETURN movie.title");
        LinkedList<String> myMovies = new LinkedList<String>();
        List<Record> registros = result.list();
        for (int i = 0; i < registros.size(); i++) {
            //myactors.add(registros.get(i).toString());
            myMovies.add(registros.get(i).get("movie.title").asString());
        }
        
        return myMovies;   
    }
    

}