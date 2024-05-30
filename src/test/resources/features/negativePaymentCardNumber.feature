@negative
Feature: RastMobile Task

 Scenario: Card Details
    Given User goes to main page and accept cookies
    Then Verify the main page title
    Given User hovers the mouse over the title of newly released books
    Then User clicks on newly realesed "Bilgisayar" books options
    And User adds to cart first book
    Then Verifies that the product has been added on the cart icon
    Then User clicks on cart ıcon
    And User clicks on satinAL button
    Given User selects continue without register option
    And Verify the guest page title
    When User clicks on add address button
    Then User enters "Test", "BYSUTCU", "testMS@gmaill.com" to form
    Then User enters "Mehmet", "SUTCU", "Türkiye", "Ankara", "ÇANKAYA", "Kitap Sokak NO.10", "5531010101" to delivery form
    And User clicks on continue button
    And Verifies that user address details has been displayed
    Then User clicks on continue button
    And Verify the payment page title


 Scenario Outline: Negative CartNumber

    And User enters credit cart "<number>" _Negative
    And User enters credit cart name
    And User enters credit cart expires date
    And User enters credit cart cvc number
    Then User clicks on continue button
    And Verify error message is displayed
   Examples:
     | number           |
     | 0000236639977478 |
     | 5570236639970000 |
     | 557023663997747  |
     | 557023663997747. |
     | 557023663997747_ |
     | 557023663997747A |
     | a702366399774712 |

   #kullanılan test datalar
   #testdata1:hatalı
   #testdata2:hatalı
   #testdata3:eksik
   #testdata4:nokta isaret ile
   #testdata5:_ isaret ile
   #testdata6:Büyükharf ile
   #testdata7:küçükharf ile


