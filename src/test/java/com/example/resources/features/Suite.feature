Feature: Qase_suite
  Here are some simple tests

  @QaseSuite=Example_suite
  Scenario: Test with a defined suite
    Then An example step

  @QaseSuite=Example_suite\tChild_suite
  Scenario: Test with nested suite
    Then An example step
