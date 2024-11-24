public class Main {
    public static void main(String[] args) {
        Menu menu=new Menu("Бургер",200);
        try {
            menu.setprice(-45);
        }catch (MenuException xx){
            System.err.println(xx.getMessage());
        }

        Menu men=new Menu("",150);
        try {
            men.setname("");
        }catch (MenunameException ee){
            System.err.println(ee.getMessage());


        }


    }
}