### 1. Write your own tests

Now you're going to write your own test.

Look in the class **`org.example.exercises.accountbalance.AccountTest;`**.

```java
// src/test/java/org/example/exercises/accountbalance/AccountTest.java

package org.example.exercises.accountbalance;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AccountTest {
    @Test
    @Ignore  // Remove each @Ignore and implement test
    public void shouldIncreaseMyBalanceWhenIDepositMoney() {
        Account account = new Account();
    }

    @Test
    @Ignore  // Remove each @Ignore and implement test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney() {

    }

    @Test
    @Ignore  // Remove each @Ignore and implement test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal() {

    }
}
```

You'll see three commented out empty unit tests(one for each of the test cases listed below).

For each of the test cases:

1. Implement the test for that test case. Uncomment it and add a test code inside it.
2. Fix compile errors.
3. Watch the test fail.
4. Write now code that you expect to make the test pass.
5. Watch the test pass. If any of your tests fail, you should repeat step #4.
6. Commit your changes and go back to Step #1 for the next test case.

| Given                     | When            | Then                                |
|---------------------------|-----------------|-------------------------------------|
| I have $100 in my account | I deposit $50   | I see that my account contains $150 |
| I have $100 in my account | I withdraw $50  | I see that my account contains $50  |
| I have $50 in my account  | I withdraw $100 | I see that my account contains $50  |

### 2. Factorial Exercise

Open the class `org.example.exercises.factorial.FactorialTest;`. You'll find five unit tests there.

```java
// src/test/java/org/example/exercises/factorial/FactorialTest.java

package org.example.exercises.factorial;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/*
    * Change Factorial.compute() so that the first test passes and the remaining tests fail.
    * Change Factorial.compute() so that the first two tests pass and the remaining tests fail.
    ...
    * Change Factorial.compute() so that all the tests pass.
 */

public class FactorialTest {
    private final Factorial factorial = new Factorial();

    @Test // Make me pass first
    @Ignore // Remove each @Ignore to allow the test to run
    public void shouldReturnOneWhenNumberIsOne() {
        assertThat(new Factorial().compute(1), is(1));
    }

    @Test
    @Ignore // Remove each @Ignore to allow the test to run
    public void shouldReturnTwoWhenNumberIsTwo() {
        assertThat(factorial.compute(2), is(2));
    }

    @Test
    @Ignore // Remove each @Ignore to allow the test to run
    public void shouldReturnOneWhenNumberIsZero() {
        assertThat(factorial.compute(0), is(1));
    }

    @Test
    @Ignore // Remove each @Ignore to allow the test to run
    public void shouldReturnSixWhenNumberIsThree() {
        assertThat(factorial.compute(3), is(6));
    }

    @Test(expected = IllegalArgumentException.class)
    @Ignore // Remove each @Ignore to allow the test to run
    public void shouldThrowIllegalArgumentExceptionWhenNumberIsNegative() {
        factorial.compute(-1);
    }
}
```

Your goal is to make changes to the class `Factorial` so that one more test passes than the last time you made a change.
Essentially, you're doing the Make the failing test pass step of TDD.

This should help you get used to the rhythm of TDD before you have to write your own tests. Here's the cycle you should
go through once for each test.

## How to submit homework

### Setup

- Step 1. Fork the repository
- Step 2. Clone your fork

### Submitting work

- Step 1. Create a folder for the specific homework
- Step 2. Push to your fork
- Step 3. Submit a pull request
- Step 3.1. Add a title and comment

In the comment section, you must add the following:

```text
* Comfortability [0 to 5]
* Completeness [0 to 5]
* What was a win?
* What was a challenge?
* Any other comments
```