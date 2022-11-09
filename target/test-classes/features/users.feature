Feature: Test all CRUD API endpoints for Users
  @get_all_users
  Scenario: Get all users
    Given I hit the get endpoint for users
#    Then the response will have status 200