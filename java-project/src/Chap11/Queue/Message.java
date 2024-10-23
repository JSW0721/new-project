package Chap11.Queue;

public class Message {
    private String cmd;
    private String to;

    public String getCmd() {
        return cmd;
    }

    public String getTo() {
        return to;
    }

    public Message(String cmd, String to) {
        this.cmd = cmd;
        this.to = to;
    }
}