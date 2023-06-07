package level4;
    import java.util.*;

    public class Redoing {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int q = scanner.nextInt();

            Stack<String> a = new Stack<>();
            Stack<String> b = new Stack<>();

            for (int i = 0; i < q; i++) {
                String query = scanner.next();

                if (query.charAt(0) == '1') {
                    // Add a string to stack A.
                    a.push(query.substring(2));
                } else if (query.charAt(0) == '2') {
                    // Pop K strings from stack A and push them into stack B.
                    int k = Integer.parseInt(query.substring(2));
                    for (int j = 0; j < k; j++) {
                        if (!a.isEmpty()) {
                            b.push(a.pop());
                        } else {
                            break;
                        }
                    }
                } else if (query.charAt(0) == '3') {
                    // Pop L strings from stack B and push them into stack A.
                    int l = Integer.parseInt(query.substring(2));
                    for (int j = 0; j < l; j++) {
                        if (!b.isEmpty()) {
                            a.push(b.pop());
                        } else {
                            break;
                        }
                    }
                }

                // Print the topmost string in stack A.
                if (!a.isEmpty()) {
                    System.out.println(a.peek());
                } else {
                    System.out.println("Nil");
                }
            }
        }
    }
}
