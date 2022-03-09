@datatable_feature
Feature: DataTable feature

@datatable_step
  Scenario Outline: Login as email <Username>
    Given Open facebook application
    When Input to Username and Password
      | Username   | Password   |
      | <Username> | <Password> |

    And Click to Submit button
    And Close application

      Examples:
        | Username        | Password |
        | auto1@gmail.com | 111222   |

  @datatable_scenario @data_driven_testing
  Scenario Outline: Data Table in Scenario
    Given Open facebook application
    When Input to Username textbox with "<Username>"
    When Input to Password textbox with "<Password>"
    And Click to Submit button
    And Close application

      Examples:
        | Username        | Password |
        | auto1@gmail.com | 111222   |
        | auto2@gmail.com | 111222   |
        | auto3@gmail.com | 111222   |
        | auto4@gmail.com | 111222   |
