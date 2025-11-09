public class MySQL {
    String database = "mysql";
    static MySQL ref;
    private MySQL() {
        //Load Instruction
    }
    public static MySQL connectDatabase() {
        if(ref == null)
        ref = new MySQL();
        return ref;
    }
}
