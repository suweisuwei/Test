package ch17;

public class Student {
    public int score;
    public Comment comment;

    public void setScore(int score) {
        this.score = score;
        this.comment = getComment(score);
    }

    public static void main(String[] args) {
        Student xhx = new Student();
        xhx.score = 90;
        xhx.comment = Comment.A;

        System.out.println("xhx's grade is:" + xhx.comment);
    }
    public static Comment getComment(int score) {
        if(score > 90) {
            return Comment.A;
        }else if(score > 75){
            return Comment.B;
        }else if(score > 60) {
            return Comment.C;
        }else {
            return Comment.D;
        }
    }
}

enum Comment{
    A,
    B,
    C,
    D

}