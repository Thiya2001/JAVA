class method1 {
    public static void main(String[] args) {
        System.out.println("Start");
        playchess("Thiya" , true);
        System.out.println("End");
        return;
    }
    public static void playchess(String s, boolean b) {
        if(b) {
            System.out.println(s + " : Wins");
        }
        else {
            System.out.println(s + " : Loss");
        }
    }
}