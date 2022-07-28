public class FizzBuzzSystem {

    public String getResultByMultiple(int number) {
        String result = "";

        if (isMultipleOf(3, number)) {
            result += "fizz";
        }
        if (isMultipleOf(5, number)) {
            result += "buzz";
        }
        return result.equals("") ? String.valueOf(number) : result;
    }

    private boolean isMultipleOf(int multiple, int number) {
        return number % multiple == 0;
    }

    public String getResultByContaining(int number) {
        String result = "";

        if (String.valueOf(number).contains("3")) {
            result += "fizz";
        }
        if (String.valueOf(number).contains("5")) {
            result += "buzz";
        }
        return result.equals("") ? String.valueOf(number) : result;
    }


}
