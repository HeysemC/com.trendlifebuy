@US0033
  Feature: [US0033] As an administrator, I want a page on the site where I can see all active
                    and inactive customers together.

    Scenario: [TC001] When the All Customer button on the Dashboard Side Bar is clicked,
                      it should be verified that the All customer page can be accessed.

        Given Go to "adminUrl"
        Then Enter valid "adminRamazanEmail" and "adminRamazanPassword" and click sign in button
        And Click Customer button
        And Click All Customer button
        And Verify the Url contains All Customer list
        And Close the page


    Scenario: [TC002] Verify that the All Customer List is visible on the All Customer page.

        Given  Go to "adminUrl"
        Then Enter valid "adminRamazanEmail" and "adminRamazanPassword" and click sign in button
        And Click Customer button
        And Click All Customer button
        And Verify the Customer List is visible
        And Close the page


    Scenario: [TC003] When the radio button in the Is Active column of the All Customer List is clicked,
                      it should be verified whether the active state of the customer has changed.

        Given  Go to "adminUrl"
        Then Enter valid "adminRamazanEmail" and "adminRamazanPassword" and click sign in button
        And Click Customer button
        And Click All Customer button
        And Verify the Radio button is clickable
        And Close the page


    Scenario: [TC004] Clicking the Active Customer button on the All Customer page should verify
                      that the Active customer list is visible.

        Given  Go to "adminUrl"
        Then Enter valid "adminRamazanEmail" and "adminRamazanPassword" and click sign in button
        And Click Customer button
        And Click All Customer button
        And Click the Active button
        And Verify the Active Customer List
        And Close the page


    Scenario: [TC005] Verify that Details, Edit, Delete links are visible on the select tab
                      under the Action title in the Active Customer List.

        Given  Go to "adminUrl"
        Then Enter valid "adminRamazanEmail" and "adminRamazanPassword" and click sign in button
        And Click Customer button
        And Click All Customer button
        And Click Active Customer button
        And Click the Role button
        And Verify that Details, Edit, Delete links are visible
        And Close the page


    Scenario: [TC006] It should be verified that the Customer Profile page is visible
                      when the Details link under the Select tab is clicked.

        Given  Go to "adminUrl"
        Then Enter valid "adminRamazanEmail" and "adminRamazanPassword" and click sign in button
        And Click Customer button
        And Click All Customer button
        And Click the Role button
        And Click Details button
        And Verify the Customer Profile Page is visible


    Scenario: [TC007] Verify that the texts "Customer Profile, Name, Email, Phone, Registered Date,
                      Active Status, Order Summary, Total Orders, Confirmed Order, Pending Order, Completed Order,
                      Cancelled Order, Wallet Summary, Total Recharge, Pending Balance Approval and
                      Total Balance are visible

        Given  Go to "adminUrl"
        Then Enter valid "adminRamazanEmail" and "adminRamazanPassword" and click sign in button
        And Click Customer button
        And Click All Customer button
        And Verify the Customer Profile
        And Close the page


    Scenario: [TC008] It should be verified that Orders, Wallet Histories, Adresses information
                      can be listed from the selected Customer Profile.

        Given  Go to "adminUrl"
        Then Enter valid "adminRamazanEmail" and "adminRamazanPassword" and click sign in button
        And Click Customer button
        And Click All Customer button
        And Go the Customer Profile
        And Verify that Order, Wallet Histories and Adress information
        And Close the page


    Scenario: [TC009] When the Wallet Histories button is clicked on the DATE, USER ,
                      TXT ID, AMOUNT, TYPE, PAYMENT METHOD and APPROVAL headings above the list
                      that appears on the page, it should be verified that the list is ordered according
                      to these headings.

        Given  Go to "adminUrl"
        Then Enter valid "adminRamazanEmail" and "adminRamazanPassword" and click sign in button
        And Click Customer button
        And Click All Customer button
        And Go the Customer Profile
        And Click Wallet Histories button
        And Clicked on the DATE, USER ,TXT ID, AMOUNT, TYPE, PAYMENT METHOD and APPROVAL
        And Close the page


    Scenario: [TC010] When the Adresses button is clicked on the SL, FULL NAME, ADRESS, REGION,
                      EMAIL, PHONE NUMBER and POSTCODE headings above the list that appears on the page,
                      the list should be sorted accordingly with these headings.

        Given  Go to "adminUrl"
        Then Enter valid "adminRamazanEmail" and "adminRamazanPassword" and click sign in button
        And Click Customer button
        And Click All Customer button
        And Go the Customer Profile
        And Click Wallet Histories button
        And Clicked on the DATE, USER ,TXT ID, AMOUNT, TYPE, PAYMENT METHOD and APPROVAL
        And Close the page


    Scenario: [TC011] Verify that it is possible to search by email in the List from the
                      Quick Search Text Box.

        Given  Go to "adminUrl"
        Then Enter valid "adminRamazanEmail" and "adminRamazanPassword" and click sign in button
        And Click Customer button
        And Click All Customer button
        And Enter an E-mail to the Quick Search Box
        And Verify that it is possible to search by E-mail
        And Close the page


    Scenario: [TC012] It should be verified that the Update Customer page is visible
                      when the Edit link under the Select tab is clicked.

        Given  Go to "adminUrl"
        Then Enter valid "adminRamazanEmail" and "adminRamazanPassword" and click sign in button
        And Click Customer button
        And Click All Customer button
        And Click the Role button
        And Click the Role Select button
        And Click the Edit button
        And Verified that the Update Customer page is visible
        And Close the page


    Scenario: [TC013] On the Update Customer Page, the Basic Info Information can be seen,
                      and when the Update button is clicked, it should be verified
                      that the relevant customer information is updated.

        Given  Go to "adminUrl"
        Then Enter valid "adminRamazanEmail" and "adminRamazanPassword" and click sign in button
        And Click Customer button
        And Click All Customer button
        And Click the Role button
        And Click the Role Select button
        And Click the Edit button
        And Verify the Basic Info can be seen
        And Verify that the update button is working
        And Close the page


    Scenario: [TC014] When the Delete link under the Select tab is clicked,
                      it should be verified that the Delete window is visible
                      and the Delete operation can be performed in the opened window.

        Given  Go to "adminUrl"
        Then Enter valid "adminRamazanEmail" and "adminRamazanPassword" and click sign in button
        And Click Customer button
        And Click All Customer button
        And Click the Role button
        And Click the Role Select button
        And Click Delete button
        And Verify that the delete window is visible and working
        And Close the page


    Scenario: [TC015] Clicking the Inactive Customer button on the All Customer page
                      should verify that the Inactive Customer list is visible.

        Given  Go to "adminUrl"
        Then Enter valid "adminRamazanEmail" and "adminRamazanPassword" and click sign in button
        And Click Customer button
        And Click All Customer button
        And Click Inactive Customer button
        And Verify that the Inactive Customer List visible
        And Close the page


    Scenario: [TC016] Verify that Details, Edit, Delete links are visible on the select tab
                      under the Action title in the Inactive Customer List.

        Given  Go to "adminUrl"
        Then Enter valid "adminRamazanEmail" and "adminRamazanPassword" and click sign in button
        And Click Customer button
        And Click All Customer button
        And Click Inactive Customer button
        And Click the Role button
        And Verify that Details, Edit, Delete links are visible
        And Close the page


    Scenario: [TC017] Basic Info Information can be seen on the Update Customer Page and
              it should be verified that the relevant customer information can be updated
              when the Update button is clicked.

        Given  Go to "adminUrl"
        Then Enter valid "adminRamazanEmail" and "adminRamazanPassword" and click sign in button
        And Click Customer button
        And Click All Customer button
        And Click the Role button
        And Click the Role Select button
        And Click the Edit button
        And Verify the Basic Info can be seen
        And Verify that the update button is working
        And Close the page


    Scenario: [TC018] When the Delete link under the Select tab is clicked,
                      it should be verified that the Delete window is visible
                      and the Delete operation can be performed in the opened window.

        Given  Go to "adminUrl"
        Then Enter valid "adminRamazanEmail" and "adminRamazanPassword" and click sign in button
        And Click Customer button
        And Click All Customer button
        And Click the Role button
        And Click the Role Select button
        And Click Delete button
        And Verify that the delete window is visible and working
        And Close the page


    Scenario: [TC019] Clicking the Create Customer button on the All Customer page
                      should verify that the Create Customer list is visible.

        Given  Go to "adminUrl"
        Then Enter valid "adminRamazanEmail" and "adminRamazanPassword" and click sign in button
        And Click Customer button
        And Click All Customer button
        And Click Create Customer button
        And Verify that the Customer Page is visible
        And Close the page

