
class Ejercicio1{

    public void mayorQue(int a, int b){
        if(a > b){
            System.out.println("El mayor es: " + a);
        }else{
            System.out.println("El mayor es: " + b);
        }
    }
    public void devolverNums(int a, int b){
        if(a == b){
            System.out.println("0");
        }else if(a > b){
            System.out.println("1");
        }else{
            System.out.println("-1");
        }

    }

    public void public static void main(String[] args) {
        Ejercicio1 e = new Ejercicio1();
        e.mayorQue(5, 3);
        e.devolverNums(5, 3);
    }


}

