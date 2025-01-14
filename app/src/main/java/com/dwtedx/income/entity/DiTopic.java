package com.dwtedx.income.entity;

import java.util.Date;
import java.util.List;

public class DiTopic {
    private int id;

    private int userid;

    private String name;

    private String description;

    private int peoplenum;

    private int viewnum;

    private int type;

    private int multiple;

    private int liked;

    private int shared;

    private String longitude;

    private String latitude;

    private String location;

    private String remark;

    private int deleteflag;

    private String createtime;

    private String createtimestr;

    private int createuser;

    private String updatetime;

    private int updateuser;

    private String username;
    private String userpath;
    private int talkcount;
    private boolean voted;
    private int votecount;
    private List<DiTopicimg> topicimg;
    private List<DiTopictalk> topictalk;
    private List<DiTopicvote> topicvote;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public int getPeoplenum() {
        return peoplenum;
    }

    public void setPeoplenum(int peoplenum) {
        this.peoplenum = peoplenum;
    }

    public int getViewnum() {
        return viewnum;
    }

    public void setViewnum(int viewnum) {
        this.viewnum = viewnum;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getMultiple() {
        return multiple;
    }

    public void setMultiple(int multiple) {
        this.multiple = multiple;
    }

    public int getLiked() {
        return liked;
    }

    public void setLiked(int liked) {
        this.liked = liked;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public int getDeleteflag() {
        return deleteflag;
    }

    public void setDeleteflag(int deleteflag) {
        this.deleteflag = deleteflag;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public int getCreateuser() {
        return createuser;
    }

    public void setCreateuser(int createuser) {
        this.createuser = createuser;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

    public int getUpdateuser() {
        return updateuser;
    }

    public void setUpdateuser(int updateuser) {
        this.updateuser = updateuser;
    }

    public int getTalkcount() {
        return talkcount;
    }

    public void setTalkcount(int talkcount) {
        this.talkcount = talkcount;
    }

    public List<DiTopicimg> getTopicimg() {
        return topicimg;
    }

    public void setTopicimg(List<DiTopicimg> topicimg) {
        this.topicimg = topicimg;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getShared() {
        return shared;
    }

    public void setShared(int shared) {
        this.shared = shared;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpath() {
        return userpath;
    }

    public void setUserpath(String userpath) {
        this.userpath = userpath;
    }

    public String getCreatetimestr() {
        return createtimestr;
    }

    public void setCreatetimestr(String createtimestr) {
        this.createtimestr = createtimestr;
    }

    public List<DiTopicvote> getTopicvote() {
        return topicvote;
    }

    public void setTopicvote(List<DiTopicvote> topicvote) {
        this.topicvote = topicvote;
    }

    public boolean isVoted() {
        return voted;
    }

    public void setVoted(boolean voted) {
        this.voted = voted;
    }

    public int getVotecount() {
        return votecount;
    }

    public void setVotecount(int votecount) {
        this.votecount = votecount;
    }

    public List<DiTopictalk> getTopictalk() {
        return topictalk;
    }

    public void setTopictalk(List<DiTopictalk> topictalk) {
        this.topictalk = topictalk;
    }
}