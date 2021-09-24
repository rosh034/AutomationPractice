Feature: Testing categories in store

    Scenario: Add 1 product from Women category to basket
    Given user is on Women category page "http://automationpractice.com/index.php?id_category=3&controller=category"
    When user click on button Add To Cart "Faded Short Sleeve T-shirts"
    Then product should be successfully added to shopping cart
    And there should be 1 product in basket
    
  
