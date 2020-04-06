public class RemoveConsecutives {

    public static void main(String args[]) {
        String z = "aabaccd"; //user input

        String k = "";

        int i;

        for (i = 1; i < z.length(); i++) {

            if (z.charAt(i) != z.charAt(i - 1)) {

                k = k + z.charAt(i - 1);

            }

        }

        if (z.charAt(i - 2) != z.charAt(i - 1) || k.equals("")) {

            k += z.charAt(i - 1);

        }

        System.out.println(k);
    }
}

