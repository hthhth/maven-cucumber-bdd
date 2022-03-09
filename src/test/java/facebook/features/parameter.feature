@parameter_feature
Feature: Parameter feature

#  Background:
#    Given Open facebook application

  @no_param
  Scenario: Scenario have no parameter
#    Given Open facebook application
    When Input to Username textbox
    And Input to Password textbox
    And Click to Submit button
#    And Close application

  @param
  Scenario: Scenario have parameter
#    Given Open facebook application
    When Input to Username textbox with "auto1@gmail.com"
    And Input to Password textbox with "111222"
    And Click to Submit button
#    And Close application

  @multi_param
  Scenario: Scenario have parameter
#    Given Open facebook application
    When Input to Username textbox with "auto1@gmail.com" and Password textbox with "111222"
    And Click to Submit button
#    And Close application

