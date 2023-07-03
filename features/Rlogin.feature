Feature: The Internet Guinea Pig Website

  Scenario Outline: As a user, I can log into the secure area

    Given User Opens appurl
    When user enters <username> and <password>
    And Clock on the Sign in Button
    Then I should see a message saying <message>

    Examples:
      | username                 | password   | message                 |
      | rahulshettyacademy       |  learning! | ProtoCommerce Home      |
      | frahulshettyacademyaff   | learning   | ProtoCommerce Home      |
