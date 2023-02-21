public class bt1 {
    public static class baitap1 {
        public static void main(String[] args) {
            System.out.println("hiển thị các số lẻ");
            int number = 10;
            for (int i = 0; i <= number; i++) {
                if (i%2 == 1){
                    if (i == 3 || i == 7){
                        continue;
                    }
                    System.out.println(i);
                }
            }

        }
    }
}
