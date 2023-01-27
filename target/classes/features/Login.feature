

  Feature:  Login functionality

            In order to do intern banking
            AS a valid para banking
            I want to login successfully
   #the first test Scenario
    Scenario: Login Successful1
      #as assumption use do what first step make
     Given Iam in the login page of the para bank application
    # The action which user is taken
     When  I enter valid credentails1
      # The result which should happen ( expected result )
     Then  I should be taken to Over view Page

     Scenario: Login successful2
       Given I am in the login page
       When I enter valid credentails2
       Then  I should be taken to Over view Page

    Scenario: Login Successful4
      Given I am in the login page
      When I enter valid credentails3
        | "ahmed" | "password"  |
      Then  I should be taken to Over view Page

    Scenario Outline: Login Successful3
      Given I am in the login page
      When I enter valid <username> and <password> with <userfulName>
      Then  I should be taken to Over view Page
      Examples:
        |username|password|userfulName|
        | "ahmed" | "password"  |"ahmed"|
        | "testpeople" | "pass" |"ahmed"|


