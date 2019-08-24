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
Feature: IP-001 (Login)
  Login Functional

  @tag1
  Scenario Outline: Title of your scenario outline
    Given Nagvigate to Login page
    And I enter username as "didinonpqcms@gmail.com"	and Password as "testing123456"
    And I Click The Login Button
    Then I Should Be Homepage View
