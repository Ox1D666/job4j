package ru.job4j.inheritance;

public class JSONReport extends TextReport {
    @Override
    public String generate(String name, String body) {
        return name + " : " + name + "," + System.lineSeparator() + body + " : " + body;
    }

    public static void main(String[] args) {
        JSONReport jsonReport = new JSONReport();
        String s = jsonReport.generate("name", "body");
        System.out.println(s);
    }
}
