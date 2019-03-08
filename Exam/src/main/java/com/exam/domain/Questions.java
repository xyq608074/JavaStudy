package com.exam.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Questions {
    private int qsId;
    private String qsTitle;
    private String qsA;
    private String qsB;
    private String qsC;
    private String qsD;
    private String qsAnswer;
    private Integer qsCourse;

    @Id
    @Column(name = "qs_id")
    public int getQsId() {
        return qsId;
    }

    public void setQsId(int qsId) {
        this.qsId = qsId;
    }

    @Basic
    @Column(name = "qs_title")
    public String getQsTitle() {
        return qsTitle;
    }

    public void setQsTitle(String qsTitle) {
        this.qsTitle = qsTitle;
    }

    @Basic
    @Column(name = "qs_a")
    public String getQsA() {
        return qsA;
    }

    public void setQsA(String qsA) {
        this.qsA = qsA;
    }

    @Basic
    @Column(name = "qs_b")
    public String getQsB() {
        return qsB;
    }

    public void setQsB(String qsB) {
        this.qsB = qsB;
    }

    @Basic
    @Column(name = "qs_c")
    public String getQsC() {
        return qsC;
    }

    public void setQsC(String qsC) {
        this.qsC = qsC;
    }

    @Basic
    @Column(name = "qs_d")
    public String getQsD() {
        return qsD;
    }

    public void setQsD(String qsD) {
        this.qsD = qsD;
    }

    @Basic
    @Column(name = "qs_answer")
    public String getQsAnswer() {
        return qsAnswer;
    }

    public void setQsAnswer(String qsAnswer) {
        this.qsAnswer = qsAnswer;
    }

    @Basic
    @Column(name = "qs_course")
    public Integer getQsCourse() {
        return qsCourse;
    }

    public void setQsCourse(Integer qsCourse) {
        this.qsCourse = qsCourse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Questions questions = (Questions) o;

        if (qsId != questions.qsId) return false;
        if (qsTitle != null ? !qsTitle.equals(questions.qsTitle) : questions.qsTitle != null) return false;
        if (qsA != null ? !qsA.equals(questions.qsA) : questions.qsA != null) return false;
        if (qsB != null ? !qsB.equals(questions.qsB) : questions.qsB != null) return false;
        if (qsC != null ? !qsC.equals(questions.qsC) : questions.qsC != null) return false;
        if (qsD != null ? !qsD.equals(questions.qsD) : questions.qsD != null) return false;
        if (qsAnswer != null ? !qsAnswer.equals(questions.qsAnswer) : questions.qsAnswer != null) return false;
        if (qsCourse != null ? !qsCourse.equals(questions.qsCourse) : questions.qsCourse != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = qsId;
        result = 31 * result + (qsTitle != null ? qsTitle.hashCode() : 0);
        result = 31 * result + (qsA != null ? qsA.hashCode() : 0);
        result = 31 * result + (qsB != null ? qsB.hashCode() : 0);
        result = 31 * result + (qsC != null ? qsC.hashCode() : 0);
        result = 31 * result + (qsD != null ? qsD.hashCode() : 0);
        result = 31 * result + (qsAnswer != null ? qsAnswer.hashCode() : 0);
        result = 31 * result + (qsCourse != null ? qsCourse.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Questions{" +
                "qsId=" + qsId +
                ", qsTitle='" + qsTitle + '\'' +
                ", qsA='" + qsA + '\'' +
                ", qsB='" + qsB + '\'' +
                ", qsC='" + qsC + '\'' +
                ", qsD='" + qsD + '\'' +
                ", qsAnswer='" + qsAnswer + '\'' +
                ", qsCourse=" + qsCourse +
                '}';
    }
}
