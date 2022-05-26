package com.planwith.web.domain;

import java.util.Date;
import java.util.Objects;

public class BoardDto {
    private Integer bno;
    private String title;
    private String writer;
    private String content;
    private Date reg_date;
    private Date up_date;
    private Integer view_cnt;
    private Integer scrap_cnt;
    private Integer comment_cnt;
    private Boolean recruiting;
    private String recruit_group;
    private Integer recruit_cnt;
    private String start_date;
    private String contact;
    private String period;
    private String lang;

    public BoardDto() {}

    public BoardDto(Integer bno, String title, String writer, String content, Date reg_date, Date up_date, Integer view_cnt, Integer scrap_cnt, Integer comment_cnt, Boolean recruiting, String recruit_group, Integer recruit_cnt, String start_date, String contact, String period, String lang) {
        this.bno = bno;
        this.title = title;
        this.writer = writer;
        this.content = content;
        this.reg_date = reg_date;
        this.up_date = up_date;
        this.view_cnt = view_cnt;
        this.scrap_cnt = scrap_cnt;
        this.comment_cnt = comment_cnt;
        this.recruiting = recruiting;
        this.recruit_group = recruit_group;
        this.recruit_cnt = recruit_cnt;
        this.start_date = start_date;
        this.contact = contact;
        this.period = period;
        this.lang = lang;
    }

    public Integer getBno() {
        return bno;
    }

    public void setBno(Integer bno) {
        this.bno = bno;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getReg_date() {
        return reg_date;
    }

    public void setReg_date(Date reg_date) {
        this.reg_date = reg_date;
    }

    public Date getUp_date() {
        return up_date;
    }

    public void setUp_date(Date up_date) {
        this.up_date = up_date;
    }

    public Integer getView_cnt() {
        return view_cnt;
    }

    public void setView_cnt(Integer view_cnt) {
        this.view_cnt = view_cnt;
    }

    public Integer getScrap_cnt() {
        return scrap_cnt;
    }

    public void setScrap_cnt(Integer scrap_cnt) {
        this.scrap_cnt = scrap_cnt;
    }

    public Integer getComment_cnt() {
        return comment_cnt;
    }

    public void setComment_cnt(Integer comment_cnt) {
        this.comment_cnt = comment_cnt;
    }

    public Boolean getRecruiting() {
        return recruiting;
    }

    public void setRecruiting(Boolean recruiting) {
        this.recruiting = recruiting;
    }

    public String getRecruit_group() {
        return recruit_group;
    }

    public void setRecruit_group(String recruit_group) {
        this.recruit_group = recruit_group;
    }

    public Integer getRecruit_cnt() {
        return recruit_cnt;
    }

    public void setRecruit_cnt(Integer recruit_cnt) {
        this.recruit_cnt = recruit_cnt;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    @Override
    public String toString() {
        return "BoardDto{" +
                "bno=" + bno +
                ", title='" + title + '\'' +
                ", writer='" + writer + '\'' +
                ", content='" + content + '\'' +
                ", reg_date=" + reg_date +
                ", up_date=" + up_date +
                ", view_cnt=" + view_cnt +
                ", scrap_cnt=" + scrap_cnt +
                ", comment_cnt=" + comment_cnt +
                ", recruiting=" + recruiting +
                ", recruit_group='" + recruit_group + '\'' +
                ", recruit_cnt=" + recruit_cnt +
                ", start_date='" + start_date + '\'' +
                ", contact='" + contact + '\'' +
                ", period='" + period + '\'' +
                ", lang='" + lang + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoardDto boardDto = (BoardDto) o;
        return Objects.equals(bno, boardDto.bno) && Objects.equals(title, boardDto.title) && Objects.equals(writer, boardDto.writer) && Objects.equals(content, boardDto.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bno, title, writer, content);
    }
}
