@rast
Feature: RastMobile Task

  Scenario: Navigate MainPage
    Given User goes to main page and accept cookies
    Then Verify the main page title

  Scenario: Add a product to cart
    Given User hovers the mouse over the title of newly released books
    Then User clicks on newly realesed "Bilgisayar" books options
    And User adds to cart first book
    Then Verifies that the product has been added on the cart icon
    Then User clicks on cart ıcon
    And User clicks on satinAL button

  Scenario Outline: Get a book without register
    Given User selects continue without register option
    And Verify the guest page title
    When User clicks on add address button
    Then User enters "Test", "BYSUTCU", "testMS@gmaill.com" to form
    Then User enters "<Ad>", "<Soyad>", "<Ulke>", "<Sehir>", "<Ilce>", "<Adres>", "<tel>" to delivery form
    And User clicks on continue button

    Examples:
      | Ad     | Soyad | Ulke    | Sehir  | Ilce    | Adres             | tel        |
      | Mehmet | Sutcu | Türkiye | Ankara | ÇANKAYA | Kitap Sokak NO.10 | 5531610100 |

  Scenario: Payment Page
      Given Verifies that user address details has been displayed
      Then User clicks on continue button
      And Verify the payment page title
      And User enters credit cart number
      And User enters credit cart name
      And User enters credit cart expires date
      And User enters credit cart cvc number
      Then User clicks on continue button

    Scenario: Order confirmation
      Given User checks the notification form checkbox
      And verify checkBOX isChecked
      Then user unchecks notification form checkbox
      And verify checkBOX isUnChecked
      Then User clicks on Order Confirmation button
      And Verifies that checkbox err message has been displayed
