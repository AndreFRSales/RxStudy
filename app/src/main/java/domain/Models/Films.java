package domain.Models;

import java.util.ArrayList;

import javax.xml.transform.Result;

/**
 * Created by andrefernandes on 1/8/17.
 */

public class Films {

    private ArrayList<Result> results;
    private String count;

    public ArrayList<Result> getResults() {
        return results;
    }

    public void setResults(ArrayList<Result> results) {
        this.results = results;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }
}
