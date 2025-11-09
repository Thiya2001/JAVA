class method3 {
    public static void main(String[] args) {
        System.out.println("Start");
        int res = solve("Wednesday" , false);
        System.out.println("Result : " + res);
        System.out.println("End");
        return;
    }
    public static int solve(String s, boolean a) {
        System.out.println("Today is : " + s);
        if(a) {
            return 14;
        }
        return 18;
    }
}