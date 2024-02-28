package basics;


import java.util.EnumSet;

enum program16a {
    nc1("nagendra1", "2001"),
    nc2("nagendra2", "2002"),
    nc3("nagendra3", "2003"),
    nc4("nagendra3", "2003"),
    nc5("nagendra3", "2003"),
    nc6("nagendra3", "2003");
    private final String name;
    private final String year;

    program16a(String names, String years) {
        name = names;
        year = years;
    }

    public String getname() {
        return name;
    }

    public String getyear() {
        return year;
    }

}

public class program16 {
    public static void main(String[] args) {
        for (program16a x : program16a.values())  //values() is static function
            System.out.printf("%s\t%s\t%s\n", x, x.getname(), x.getyear());
        System.out.println("for a definite range");
        for (program16a x : EnumSet.range(program16a.nc2, program16a.nc5))
            System.out.printf("%s\t%s\t%s\n", x, x.getname(), x.getyear());
    }
}
