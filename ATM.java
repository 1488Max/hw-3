public class ATM {
    public int countBanknotes(int sum) {
        int number = sum;
        int counter = 0;
        if (number >= 500) {
            while (number > 500) {
                number -= 500;
                counter++;
            }
        }
        if (number >= 200) {
            while (number > 200) {
                number -= 200;
                counter++;
            }
        }
        if (number >= 100) {
            while (number > 100) {
                number -= 100;
                counter++;
            }
        }
        if (number >= 50) {
            while (number > 50) {
                number -= 50;
                counter++;
            }
        }
        if (number >= 20) {
            while (number > 20) {
                number -= 20;
                counter++;
            }
        }
        if (number >= 10) {
            while (number > 10) {
                number -= 10;
                counter++;
            }
        }
        if (number >= 5) {
            while (number > 5) {
                number -= 5;
                counter++;
            }
        }
        if (number >= 2) {
            while (number > 2) {
                number -= 2;
                counter++;
            }
        }
        if (number >= 1) {
                number -= 1;
                counter++;
        }
        return counter;
    }
}
