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
        notebook.show();
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkCondition();
        System.out.println();

        Notebook heavyNotebook = new  Notebook(2000,1001, 2020 );
        heavyNotebook.show();
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkCondition();
        System.out.println();

        Notebook oldNotebook = new  Notebook(3001,150, 2016);
        oldNotebook.show();
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkCondition();
        System.out.println();



    }
    public void checkPrice(){
        if (this.price < 600) { System.out.println("This notebook is very cheap");}
        else if (this.price >= 600 && this.price <= 1000) { System.out.println("This notebook is very good"); }
            else if (this.price > 1000) { System.out.println("This notebook is expensiv"); }
    }

    public void checkWeight(){
        if (this.weight < 1000) { System.out.println("This notebook is very light"); }
        else if (this.weight >= 1000 && this.weight <= 3000) { System.out.println("This notebook weighs approx"); }
            else if (this.weight > 3000) { System.out.println("This notebook is heavy"); }
    }

    public void checkCondition(){
        System.out.print("Advise: ");
        if (this.weight >= 1000 && this.weight < 3000 && this.price >= 600 && this.price < 2000) { System.out.println("This notebook is GREAT"); }
        else if (this.weight >= 3000 ) { System.out.println("This notebook is too heavy"); }
            else if (this.weight < 1000 ) { System.out.println("This notebook is too light"); }
                else if (this.price > 1000) { System.out.println("This notebook is too expensive"); }
                    else if (this.price <= 600) { System.out.println("This notebook is too cheap"); }
    }

    public void show()
    {
        System.out.println("Notebook: weight-" + this.weight + " ,price-" + this.price + " ,year-" +this.year);
    }
}
