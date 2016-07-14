Feature: BaseCamp Login

  Scenario Outline: BaseCamp Login
    Given Open chrome and start application
    When Input "<username>" and "<password>"
    Then user should login successfully
    Then application should be closed
    
    
  Examples:
  |username|password|
  |12345@newland.com|12345|
  |12345@newland.com|23456|
  |12345@newland.com|34567|