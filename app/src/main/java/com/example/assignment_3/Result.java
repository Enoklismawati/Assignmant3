package com.example.assignment_3;

public class Result {
    private String cases;

    private String recovered;

    private String deaths;


    public Result(String cases, String recovered, String deaths) {
        this.cases = cases;
        this.recovered = recovered;
        this.deaths = deaths;
    }

    public String getCases() {
        return cases;
    }

    public String getRecovered() {
        return recovered;
    }

    public String getDeaths() {
        return deaths;
    }


}
