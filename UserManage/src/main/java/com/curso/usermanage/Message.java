package com.curso.usermanage;

/**
 *
 * @author omarinmo
 */
public class Message {
    /**
     * 
     * @return toString
     */
    @Override
    public String toString() {
        return "Message:\n ["
                + "Sender:" + sender
                + ", content: " + content + " ]";

    }
    /**
     * Atributes
     */
    private String sender;
    private String content;
    /**
     * Constructor without parameters
     */
    public Message() {
    }
    /**
     * Constructor with parameters
     * @param sender
     * @param content 
     */
    public Message(String sender, String content) {
        this.sender = sender;
        this.content = content;
    }
    /**
     * 
     * @return String sender users
     */
    public String getSender() {
        return sender;
    }
    /**
     * Modify sender message
     * @param sender String
     */
    public void setSender(String sender) {
        this.sender = sender;
    }
    /**
     * Content to message
     * @return 
     */
    public String getContent() {
        return content;
    }
    /**
     * Modify content to message
     * @param content 
     */
    public void setContent(String content) {
        this.content = content;
    }

}
