#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @validlogin
  Scenario Outline: Title of your scenario outline
    Given I navigate to kamisa.web.iprop-dev.com/ login page
    When I click email address
	    And	 I enter an invalid Email address <Emailaddress> and Password <Passwrod>
    And	 I click log in button 
    Then I should unable to log in

    Examples: 
      | Emailaddress  									| Password |
      | refqi.hussein@gmail.com 				| mysecret9892|