package Random;

public class Main {

    int sth;
    public static void main(String[] args) {

        int org = 42;
        Main x = new Main();
        int y = x.jazda(org);
        System.out.println(org + " " + y);
    }

    int jazda (int arg){
        arg *=2;
        return arg;
    }

    public int getSth() {
        return sth;
    }

    public void setSth(int sth) {
        this.sth = sth;
    }
}
