interface Sports {
    void play(String msg);
}
class Cricket {
    Cricket(String msg) {
        System.out.println(msg);
    }
    public static void main(String[] args) {
        Sports obj = Cricket :: new;
        obj.play("I am playing Cricket");
    }
}
