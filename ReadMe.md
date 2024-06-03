# Bu proje **RastMobile**  şirketi için hazırlanmıştır. 

#### Projede progranlama dili olarak: _java_17_, 

#### Otomasyon suiti olarak: _Selenium_4.20_ kullanılmıştır. 

#### Framework olarak BDD ve POM yaklaşımına uygun _Cucumber_ framework'ü tercih edilmiştir.  

Raporlama için cucumber html report ile xml report kullanılmış, 
ayrıca fail senaryorın text olarak dinamik şekilde raporlaması alınmıştır. 
Raporlara  TestOutput altında Report klasöründen ulaşılabilir. 
Testler içerisinde Driver class a Chrome, Edge ve Firefox browser tanımlamaları yapılarak 
parallel testler farklı browserlar ile koşulabilir durumdadır. 
Yine ayrıca Selenium Grid ile cross browser testleride projede denenmiştir.
Proje çerçevesinde Page Object Model yaklaşımına uygun olarak; 
sayfalara ait locate alanları page klasörü altında, 
test adımları feature dosyalarında, 
test adımlarını içeren kodlar stepdefinition klasörleri altında depolanmıştır. 
Test süresini kısaltmak içinbazı alanlarda elemente özgü expilicit wait tanımlamaları yapılmıştır.
Test'in UI da anlaşılabilmesi ve okunabirlirliğini arttırmak açısından tıklama yapılan bazı elementlerin çerçeve içine alınarak gösterimi yapılmıştır.
Ayrıca testler Runner class üretinden çalıştırılarak hook ve stepdefinitions entegrasyonu sağlanmıştır.
Proje istenirse tarafımdan sunumu gerçekleştirilebilir.

## This project was prepared for RastMobile company.  

In the project, Java 17 was used as the programming language and 
Selenium 4.20 was used as the automation suite. 
Cucumber framework, which is compatible with BDD and POM approach, was preferred as the framework.  
Cucumber html report and xml report were used for reporting, 
and dynamic reporting of the fail scenarios was received as text. 
Reports can be accessed from the Report folder under TestOutput. 
By defining the Driver class for Chrome, Edge and Firefox browsers within the tests, 
parallel tests can be run with different browsers. 
Cross browser tests with Selenium Grid were also tested in the project. 
Within the framework of the project, 
in accordance with the Page Object Model approach, 
the locate fields of the pages were stored under the page folder, 
the test steps were stored in feature files, 
and the codes separated by pages containing the test steps were stored under stepdefinition folders.
In order to shorten the test time, explicit wait definitions have been made in some areas.
In order to increase the understanding and readability of the test in the UI, some elements that are clicked have been framed and displayed.
If desired, the project can be presented by me.