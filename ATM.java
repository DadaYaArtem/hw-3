class ATM {
    public int countBanknotes(int sum) {
        int count = 0;
        int[] bills = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int i = 0;
        while (i < bills.length) {
            if (sum >= bills[i]) {
                sum = sum - bills[i];
                count++;
            } else {
                i++;
            }
        }
        return count;
    }
}