@customer
Feature: Register/Login and new Customer

  @register_login
  Scenario: Register to system and login
    Given Get login page url
    When Open Register page
    And Input to email textbox
    And Click to Submit
    And Get User and password infor
    And Back to Login page
    And Submit valid infor to login form
    Then Home page displayed

  @new_customer
  Scenario Outline: New Customer
    Given Open "New Customer" page
    When Input to "Customer Name" textbox with value "<Customer Name>"
    And Click to "f" radio button
    And Input to "Date of Birth" textbox with value "<Date of Birth In>"
    And Input to "Address" textarea with value "<Address>"
    And Input to "City" textbox with value "<City>"
    And Input to "State" textbox with value "<State>"
    And Input to "PIN" textbox with value "<PIN>"
    And Input to "Mobile Number" textbox with value "<Mobile Number>"
    And Input to "E-mail" textbox with value "<E-mail>"
    And Input to "Password" textbox with value "<Password>"
    And Click to "Submit" button
    Then Success message displays with "Customer Registered Successfully!!!"
    And the valid value displays at "Customer Name" with "<Customer Name>"
    And the valid value displays at "Gender" with "<Gender>"
    And the valid value displays at "Birthdate" with "<Date of Birth Out>"
    And the valid value displays at "Address" with "<Address>"
    And the valid value displays at "City" with "<City>"
    And the valid value displays at "State" with "<State>"
    And the valid value displays at "Pin" with "<PIN>"
    And the valid value displays at "Mobile No." with "<Mobile Number>"
    And the valid value displays at "Email" with "<E-mail>"

    Examples:
      | Customer Name | Gender | Date of Birth In | Date of Birth Out | Address     | City    | State | PIN    | Mobile Number | E-mail                  | Password |
      | Mary Jane     | female | 05/20/1993       | 1993-05-20        | 123 St John | NY city | US    | 414133 | 0913412412    | maryjane11442@gmail.com | 111222   |


