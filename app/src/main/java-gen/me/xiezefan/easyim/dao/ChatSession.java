package me.xiezefan.easyim.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table CHAT_SESSION.
 */
public class ChatSession {

    private Long id;
    private String title;
    private String lastMessage;
    private String avatar;
    private Integer unread;
    private Long lastTime;
    private String targetId;

    public ChatSession() {
    }

    public ChatSession(Long id) {
        this.id = id;
    }

    public ChatSession(Long id, String title, String lastMessage, String avatar, Integer unread, Long lastTime, String targetId) {
        this.id = id;
        this.title = title;
        this.lastMessage = lastMessage;
        this.avatar = avatar;
        this.unread = unread;
        this.lastTime = lastTime;
        this.targetId = targetId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getUnread() {
        return unread;
    }

    public void setUnread(Integer unread) {
        this.unread = unread;
    }

    public Long getLastTime() {
        return lastTime;
    }

    public void setLastTime(Long lastTime) {
        this.lastTime = lastTime;
    }

    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

}
