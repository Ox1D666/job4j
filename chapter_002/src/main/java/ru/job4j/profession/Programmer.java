package ru.job4j.profession;

public class Programmer extends Engineer {
    private String smart;
    Program program = new Program();

    public String getSmart() {
        return smart;
    }
    private Program makeProgram() {
        return program;
    }
}
