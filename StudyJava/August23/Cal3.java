package August23;

public class Cal3 extends Cal{
    public int minus (int v1, int v2) {
        return v1-v2;
    }

    //Overriding
    public int sum (int v1, int v2) {
        System.out.println("-----Cal3!!-----");
        return v1+v2;
    }
}
