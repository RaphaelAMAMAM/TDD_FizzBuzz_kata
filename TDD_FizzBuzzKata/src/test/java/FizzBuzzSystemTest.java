import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzSystemTest {
    FizzBuzzSystem fizzBuzzSystem = new FizzBuzzSystem();

    @Test
    void Should_return_fizz_when_is_multiple_of_three() {
        int number = 3;
        String value = fizzBuzzSystem.getResultByMultiple(number);
        assertThat(value).isEqualTo("fizz");
    }

    @Test
    void Should_return_buzz_when_is_multiple_of_five() {
        int number = 5;
        String value = fizzBuzzSystem.getResultByMultiple(number);
        assertThat(value).isEqualTo("buzz");
    }

    @Test
    void Should_return_fizzbuzz_when_is_multiple_of_three_and_five() {
        int number = 15;
        String value = fizzBuzzSystem.getResultByMultiple(number);
        assertThat(value).isEqualTo("fizzbuzz");
    }

    @Test
    void Should_return_fizz_when_contains_three() {
        int number = 3;
        String value = fizzBuzzSystem.getResultByContaining(number);
        assertThat(value).isEqualTo("fizz");
    }

    @Test
    void Should_return_buzz_when_contains_five() {
        int number = 5;
        String value = fizzBuzzSystem.getResultByContaining(number);
        assertThat(value).isEqualTo("buzz");
    }

    @Test
    void Should_return_fizzbuzz_when_contains_three_and_five() {
        int number = 35;
        String value = fizzBuzzSystem.getResultByContaining(number);
        assertThat(value).isEqualTo("fizzbuzz");
    }
}