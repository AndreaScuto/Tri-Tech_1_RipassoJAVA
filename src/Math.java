public class Math {
    public static int prodotto(int x, int y){
        return x*y;
    }

    public static boolean paridispari (int x, int y){
        Boolean res;
        if (((x + y) % 2) == 0){
            res = true;
        } else {
            res = false;
        }
        return res;
    }

}
