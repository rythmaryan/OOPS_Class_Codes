// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Product{
    int productId;
    Product(int pId){
        this.productId = pId;
    }
}

class Clothing extends Product{
    int size;
    Clothing(int p, int s){
        super(9);
        this.size = s;
    }
    
    void display(){
        System.out.println(this.size);
        System.out.println(super.productId);
    }
}

class Main {
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        Product p = new Product(1);
        Clothing c = new Clothing(1,30);
        c.display();
    }
}