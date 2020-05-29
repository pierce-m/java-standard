package codecov;

public class Index {
    public boolean uncovered_if(boolean a) {
        int f = 10,
        if (a) 
            return f;
        else
            return true;
    }   

    public boolean fully_covered() {
        return true;
    }

    public boolean uncovered() {
        return true;
    }
}
