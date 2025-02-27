Feature: Qase Title

  @QaseTitle=This_text_will_be_the_title_of_the_test,_in_Qase
  @QaseSuite=Example_suite  
  @QaseFields={"precondition":"In_BDD,_stories_guide_the_way."}
  Scenario: Scenario with Title, Suite and Description
    Then An example step

  @QaseFields={"severity":"blocker"}
  Scenario: Scenario with Field: Severity - blocker
    Then An example step
