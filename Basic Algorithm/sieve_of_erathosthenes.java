class HelloWorld {
    public static void main(String[] args) {
        int n = 40;
        System.out.println("primes numbers from 0 to " + n + " are: ");
        boolean[] primes = new boolean[n];
        isPrime(n, primes);
    }

    static void isPrime(int n, boolean[] primes) {
        primes[0] = true;
        primes[1] = true;
        for (int i = 2; i * i <= n; i++) {
            if (!primes[i]) {
                for (int j = i * 2; j < n; j += i) {
                    primes[j] = true;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (!primes[i]) {
                System.out.println(i);
            }
        }
    }
}
