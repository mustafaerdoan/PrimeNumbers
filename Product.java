class GFG {


    public static void main(String[] args) {
        int i = 0;
        int num = 0;
        //Empty String
        String primeNumbers = "";

        for (i = 100; i <= 999; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                //Appended the Prime number to the String
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to 100 are :");
        System.out.println(primeNumbers);
        fivedigit ();
    }

    public static void fivedigit(){
        int i=0;
        int num=0;
        //Empty String
        String primeNumbersF = "";
        for (i = 500; i <= 599; i++)
        {
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {
                //Appended the Prime number to the String
                primeNumbersF = primeNumbersF + i + " ";
            }
        }
        System.out.println("Prime numbers start with are :");
        System.out.println(primeNumbersF);
    }
}