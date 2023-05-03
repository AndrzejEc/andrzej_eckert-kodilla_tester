public class Notebook {
    int weight;
    int price;
    int year;
    public Notebook(int weight, int price, int year){
        this.weight=weight;
        this.price=price;
        this.year=year;
    }
    public static void main(String[] args) {         // [2]
        Notebook notebook = new  Notebook(555, 1000, 2020);
        System.out.println(notebook.weight+" "+ notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkCondition();

        Notebook heavyNotebook = new  Notebook(2000,1001, 2020 );
        System.out.println(heavyNotebook.weight+" "+ heavyNotebook.price);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkCondition();

        Notebook oldNotebook = new  Notebook(3001,150, 2016);
        System.out.println(oldNotebook.weight+" "+ oldNotebook.price);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkCondition();



        //System.out.println(notebook.weight);
        //System.out.println(notebook.price);
        //System.out.println(heavyNotebook.weight);
        //System.out.println(heavyNotebook.price);
        //System.out.println(oldNotebook.weight+" " + oldNotebook.price);
        //if (notebook.price < 900){
//            System.out.println("This notebook is cheap");
        //}
        //else {
        //    System.out.println("This nootebook is quite expensiv");
        //}



        //String welcome = "Hello from FirstClass!";
        //System.out.println(welcome); // [3]

        //if (1 > 2){
        //    System.out.println("Niesamowite! Jeden jest większe niż dwa!!!");
        //}
        //else {
        //    System.out.println("Wszystko po staremu, jeden jest mniejsze niż dwa.");
        //}
    }
    public void checkPrice(){
        if (this.price < 600) {
            System.out.println("This notebook is very cheap");
        }
        else {
            if (this.price >= 600 && this.price <= 1000) {
                System.out.println("This notebook is very good");
            }
            else {
                if (this.price > 1000) {
                    System.out.println("This notebook is expensiv");
                }
            }
        }
    }

    public void checkWeight(){
        if (this.weight < 1000) {
            System.out.println("This notebook is very light");
        }
        else {
            if (this.weight >= 1000 && this.weight <= 3000) {
                System.out.println("This notebook weighs approx");
            }
            else {
                if (this.weight > 1000) {
                    System.out.println("This notebook is heavy");
                }
            }
        }
    }

    public void checkCondition(){
        System.out.println("Advise:");
        if (this.weight >= 1000 && this.weight <= 3000 && this.price >= 600 && this.price <= 2000) {
            System.out.println("This notebook is GREAT");
        }
        else {
            if (this.weight >= 3000 ) {
                System.out.println("This notebook is too heavy");
            }
            else {
                if (this.price > 1000) {
                    System.out.println("This notebook is too expensive");
                    System.out.println("This notebook is too expensive");

                }
            }
        }

    }
}
