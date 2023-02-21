public class bt2 {
    public static class baitap2 {
        public static void main(String[] args) {
            System.out.println("hiển thị các số chẳn");
            int i;
            for (i = 0; i <= 10; i++) {
                if (i%2 == 0){
                    if (i == 4){
                        continue;
                    }
                    System.out.println(i);
                }
            }
        }
    }
}
