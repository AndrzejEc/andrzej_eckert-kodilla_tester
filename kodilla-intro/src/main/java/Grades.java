public class Grades {
    private int[] grades;
    private int size;

    public Grades(){
        this.grades=new int[10];
        this.size=0;
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

    public float getAverage(){
        int sum=0;
        for (int i = 0; i < this.size-1; i++) {
            sum=sum+this.grades[this.size-1];
        }
        return (sum/this.size-1);
    }
}
