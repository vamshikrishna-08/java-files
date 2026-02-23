public class task7 { // invoice generator
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Item: Pen\nPrice: 10\nQty: 5\nTotal: ")
                .append(10 * 5);
        System.out.println(sb);
    }
}
