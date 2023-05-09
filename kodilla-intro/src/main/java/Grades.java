public class Grades {
    private int[] grades;
    private int size;

    public Grades(){
        this.grades=new int[10];
        this.size=0;
    }

    public static void main(String[] args) {
        Grades andy = new Grades();
        andy.add(2);
        andy.add(3);
        System.out.println(andy.getAverage());
    }
    public void add(int value){
        if (this.size==10){
            return;
        }
        this.grades[this.size]=value;
        this.size++;
    }

    public int getLast(){
        if (this.size==0){
            return 0;
        } else {
            return this.grades[this.size-1];
        }
    }

    public double getAverage(){
        double sum=0;
        double av=0;
        for (int i = 0; i < this.size; i++) {
            sum=sum+this.grades[i];
        }
        return (sum/this.size-1);
        //av=(sum/this.size-1);
        //return av;
    }


}
