package curty.curt.curt;

public final class Curt {
    private static Curt instance;

    public static Curt getInstance () {
        if (instance == null) {
            instance = new Curt();
        }
        return instance;
    }

    public static String curt (Object o) {
        return "You're a " + o;
    }

    private Curt () {}

    @Overrides
    public boolean equals (Object other) {
        return false;
    }

    @Overrides
    public toString () {
        return "curt";
    }
}