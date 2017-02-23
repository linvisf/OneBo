package com.linvisf.onebo.bean.meizi;

import java.util.Date;

/**
 * Created by linhong on 2017/1/6.
 * <p>
 * 描述：
 */

public class Meizi {

//    _id: "586e1aad421aa9315ea79905",
//    desc: "1-5",
//    createdAt: "2017-01-05T18:06:37.810Z",
//    publishedAt: "2017-01-06T13:20:19.591Z",
//    source: "chrome",
//    type: "福利",
//    url: "http://ww4.sinaimg.cn/large/610dc034gw1fbfwwsjh3zj20u00u00w1.jpg",
//    used: true,
//    who: "daimajia"

    private String objectId;
    private String desc;
    private String source;
    private String type;
    private String url;
    private boolean used;
    private String who;
    private Date createdAt;
    private Date publishedAt;

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(Date publishedAt) {
        this.publishedAt = publishedAt;
    }
}
