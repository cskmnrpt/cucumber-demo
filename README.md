# qase-cucumber7

## Purpose of this branch
#### To check the behavior of `Qase.comment()` method

### Observation
Please open the file [`MathSteps.java`](https://github.com/cskmnrpt/cucumber-demo/blob/cucumberv7-comment-behaviour/src/test/java/com/example/stepdefinitions/MathSteps.java) to check.

In case of a failed test:

- If added **after** the assertion, the comment gets ignored.  
- If added **before** the assertion, the comment gets published along with the assertion error message.

Run the tests with `mvn test -Dcucumber.filter.tags="@zaid"`
