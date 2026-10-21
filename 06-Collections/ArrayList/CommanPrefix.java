//comman prefix


public class CommanPrefix{

    public static void main(String[] args) {

        String[] arr = {"flower", "flow", "flight"};

        String prefix = arr[0];

        for (int i = 1; i < arr.length; i++) {

            while (!arr[i].startsWith(prefix)) {

                prefix = prefix.substring(0, prefix.length() - 1);

            }
        }

        System.out.println(prefix);
    }
}


//second

/*public class CommanPrefix{

    public static void main(String[] args) {

        String[] arr = {"flower", "flow", "flight"};

        String ans = "";

        for (int i = 0; i < arr[0].length(); i++) {

            char ch = arr[0].charAt(i);

            for (int j = 1; j < arr.length; j++) {

                if (i >= arr[j].length() || arr[j].charAt(i) != ch) {

                    System.out.println(ans);
                    return;
                }
            }

            ans += ch;
        }

        System.out.println(ans);
    }
}*/