package com.recyclerviewdemo.android;


public class Movie
{
    private  String name,gen,year;

    public Movie(String name, String gen, String year)
    {
        this.name=name;
        this.gen=gen;
        this.year=year;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
