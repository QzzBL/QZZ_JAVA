public class ltem {
        String name;
        int price;

        void addPrice(int otherprice){
            price = price + otherprice;

        }
        public static void main(String[] args){
            ltem ltem1 = new ltem();
            ltem1.price = 50;
            ltem1.name = "gailun";
            ltem1.addPrice(50);
            System.out.println(ltem1.name + "=" + ltem1.price);
        }
}
