package com.example.experience1;

/**
 * Created by apple1 on 2017/3/31.
 */

public class Message {
    private int imageId;
    private String nickName;
    private  String content;
    private  String time;

    public Message(int imageId, String nickName, String content, String time) {
        this.imageId = imageId;
        this.nickName = nickName;
        this.content = content;
        this.time = time;
    }

    public int getImageId() {
        return imageId;
    }

    public String getNickName() {
        return nickName;
    }

    public String getContent() {
        return content;
    }

    public String getTime() {
        return time;
    }
}
