package com.example.sistemaacademico;

public class Examen {
    private String exam_id;
    private String exam_title;
    private int exam_score;

    @Override
    public String toString() {
        return "id: "+exam_id+" / title: "+exam_title+" / SCORE: "+exam_score;
    }

    public String getExam_id() {
        return exam_id;
    }

    public void setExam_id(String exam_id) {
        this.exam_id = exam_id;
    }

    public String getExam_title() {
        return exam_title;
    }

    public void setExam_title(String exam_title) {
        this.exam_title = exam_title;
    }

    public int getExam_score() {
        return exam_score;
    }

    public void setExam_score(int exam_score) {
        this.exam_score = exam_score;
    }
}
