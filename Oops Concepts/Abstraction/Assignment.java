public class Assignment {
    String topic;
    String trainer;
    Assignment(String topic, String trainer) {
        this.topic = topic;
        this.trainer = trainer;
    }
}
class Java extends Assignment {
    Java(String topic, String trainer) {
        super(topic, trainer);
    }
    public void submit() {
        System.out.println("Submit assignment on " + topic + " by " + trainer + " on the Leet code");
    }
}
class MT extends Assignment {
    MT(String topic, String trainer) {
        super(topic, trainer);
    }
    public void submit() {
        System.out.println("Submit assignment on " + topic + " by " + trainer + " on the Excel sheet");
    }
}
class webtech extends Assignment {
    webtech(String topic, String trainer) {
        super(topic, trainer);
    }
    public void submit() {
        System.out.println("Submit assignment on " + topic + " by " + trainer + " on the Github");
    }
}
class Main {
    public static void main(String args[]) {
        Java obj1 = new Java("Oops", "Pranav");
        obj1.submit();
        MT obj2 = new MT("Functions", "Ankit");
        obj2.submit();
        webtech obj3 = new webtech("HTML", "Vignesh");
        obj3.submit();
    }
}