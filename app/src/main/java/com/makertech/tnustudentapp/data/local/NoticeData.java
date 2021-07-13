package com.makertech.tnustudentapp.data.local;

public class NoticeData {
    String nameOfNoticeWriter;
    int noticeImage, userImage;

    public NoticeData(String nameOfNoticeWriter, int noticeImage, int userImage) {
        this.nameOfNoticeWriter = nameOfNoticeWriter;
        this.noticeImage = noticeImage;
        this.userImage = userImage;
    }

    public String getNameOfNoticeWriter() {
        return nameOfNoticeWriter;
    }

    public void setNameOfNoticeWriter(String nameOfNoticeWriter) {
        this.nameOfNoticeWriter = nameOfNoticeWriter;
    }

    public int getNoticeImage() {
        return noticeImage;
    }

    public void setNoticeImage(int noticeImage) {
        this.noticeImage = noticeImage;
    }

    public int getUserImage() {
        return userImage;
    }

    public void setUserImage(int userImage) {
        this.userImage = userImage;
    }
}
