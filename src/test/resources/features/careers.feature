@wip
  Feature: I should be able to access application for Lead SDET position

  Scenario: Scenario: Accessing Careers, Searching for and Applying to a Job

    Given the user is on the homepage
    When the user clicks on the Careers tab on the upper right side of the page
    And the user should be able to redirect to the Careers page with title as "Grow your career—and build the future of commerce | Global Payments Careers"
    And the user clicks on the search job box at the Careers page
    And the user types "Lead Software Development Engineer in Test" and clicks enter
    And the user browses through the available positions, and clicks the Lead Software Development Engineer in Test option
    And the user lands on the job description page and clicks on the Apply now tab
    And the user should be able to redirect to the Careers page with title as "Workday"
    And the user navigates to the connection page where the user enters "bayram.suraye@gmail.com" and "Mismail1!"
    Then the user should be able to redirect to the Careers page with title as "You've already applied for this job."