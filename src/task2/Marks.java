package task2;

public abstract class Marks {
    int maths;
    int english;
    int coding;
    Marks(int maths, int english, int coding) {
        this.maths = maths;
        this.english = english;
        this.coding = coding;
    }
    abstract double getPercentage();
}
class A extends Marks{

    public A(int maths,int english,int coding){
        super(maths, english, coding);
    }

    @Override
    public double getPercentage() {
        int totalMarks=300;
        double sum=maths+english+coding;
        double  getPercentage=(sum/totalMarks)*100;
        return getPercentage;
    }
}
class B extends Marks{

    int geo;
    public B(int maths,int english,int coding,int geo){
        super(maths, english, coding);
        this.geo=geo;
    }
    @Override
    double getPercentage() {
        int totalMarks=400;
        double sum=maths+english+coding+geo;
        double  getPercentage=(sum/totalMarks)*100;
        return getPercentage;
    }
}
class MarksTest{
    public static void main(String[] args) {
        Marks faiza=new A(55,65,56);
        System.out.println(faiza.getPercentage()+"%");
        Marks Yousuf=new B(77,88,99,88);
        System.out.println(Yousuf.getPercentage()+"%");
    }
}

